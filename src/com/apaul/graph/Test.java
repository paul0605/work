package com.apaul.graph;

public class Test {

	public static void main(String [] args){
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node j = new Node(7);
		Node g = new Node(8);
		
		StronglyConnectedGraph dfs = new StronglyConnectedGraph();
		//DFS dfs = new DFS();
		dfs.addNode(a);
		dfs.addNode(b);
		dfs.addNode(c);
		dfs.addNode(d);
		dfs.addNode(e);
		dfs.addNode(f);
		dfs.addNode(j);
		dfs.addNode(g);
		
		dfs.buildMatrix(a, b);
		dfs.buildMatrix(a, f);
		dfs.buildMatrix(b, c);
		dfs.buildMatrix(b, d);
		dfs.buildMatrix(d, e);
		dfs.buildMatrix(e, j);
		dfs.buildMatrix(b, g);
		dfs.buildMatrix(f, g);
		//dfs.dfs(a);
		dfs.scc(a);
		
	}
}
