package com.apaul.graph;

import java.util.List;

public class Node {
	
	int data;
	
	boolean visited = false;

	public Node(int data) {
		super();
		this.data = data;
	}
	
	public Node getUnvisitedNode(int[][] adjMatrix, List<Node> nodes){
		
		int index = nodes.indexOf(this);
		
		int size = nodes.size();
		
		for(int i = 0; i <size; i++){
			if (adjMatrix[index][i] == 1 && nodes.get(i).visited == false) {
				return nodes.get(i);
			}
		}
		
		return null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", visited=" + visited + "]";
	}
	
	
	
	

}
