package com.apaul.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StronglyConnectedGraph {
	
	Stack<Node> stack = new Stack<Node>();
	
	private int[][] adjMatrix; 
	
	private int[][] adjMatrixT; 
	
	int size = 0;
	
	private List<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node n){
		nodes.add(n);
	}
	
	public void buildMatrix(Node first, Node second){
		
		if(adjMatrix == null){
			size = nodes.size();
			adjMatrix = new int[size][size];
		}
		int firstIndex = nodes.indexOf(first);
		int secondIndex = nodes.indexOf(second);
		adjMatrix[firstIndex][secondIndex] = 1;
		//adjMatrix[secondIndex][firstIndex] = 1;		
		
	}

	public void scc(Node first) {
		dfs(first);
		wipeOutHistory();
		transpose();
		
		print();
		printSCC();
	}

	private void printSCC() {
		for(Node n : stack){
			if(!n.visited){
				sccUtils(n);
			}
			System.out.println(" ");
		}
	}

	private void sccUtils(Node n) {
		n.visited = true;
		int i = nodes.indexOf(n);
		for(int m = 0; m < size; m++){
			if(adjMatrixT[i][m] == 1){
				if(!nodes.get(m).visited){
					sccUtils(nodes.get(m));
				}
			}
		}
		System.out.print(n.data + " ");
		
	}

	private void print() {
		for(Node n : stack){
			System.out.print(n.data + " ");
		}
		System.out.println(" ");
	}

	private void transpose() {
		if(adjMatrixT == null){
			size = nodes.size();
			adjMatrixT = new int[size][size];
		}
		for(int i =0; i < size; i++){
			for(int j =0; j < size; j++){
				if(adjMatrix[i][j] == 1){
					adjMatrixT[j][i] = 1;
				}
			}
		}
	}

	private void wipeOutHistory() {
		for(Node n : nodes){
			n.visited = false;
		}
		
	}

	private void dfs(Node node) {
		node.visited = true;
		int i = nodes.indexOf(node);
		for(int m = 0; m < size; m++){
			if(adjMatrix[i][m] == 1){
				dfs(nodes.get(m));
			}
		}
		stack.push(node);
	}

}
