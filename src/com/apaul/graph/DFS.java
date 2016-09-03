package com.apaul.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {

	Stack<Node> stack = new Stack<Node>();
	
	private int[][] adjMatrix; 
	
	private List<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node n){
		nodes.add(n);
	}
	
	public void buildMatrix(Node first, Node second){
		
		if(adjMatrix == null){
			int size = nodes.size();
			adjMatrix = new int[size][size];
		}
		int firstIndex = nodes.indexOf(first);
		int secondIndex = nodes.indexOf(second);
		adjMatrix[firstIndex][secondIndex] = 1;
		adjMatrix[secondIndex][firstIndex] = 1;		
		
	}
	
	public void dfs(Node root){
		
		stack.push(root);
		root.visited = true;
		while(!stack.isEmpty()){
			Node n = stack.peek();
			
			Node childNode = n.getUnvisitedNode(adjMatrix, nodes);
			if(childNode != null){
				childNode.visited = true;
				stack.push(childNode);
			}else{
				Node pop = stack.pop();
				System.out.println(pop.toString());
				
			}
			
		}
		
		
	}
}
