package datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Node<T> {
	
	private boolean isVisited;	
	private T t;
	private Set<Node<T>> edges;

	public Node(T t) {
		this.t =t;
		this.isVisited=false;
		edges = new TreeSet<Node<T>>();
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public Set<Node<T>> getEdges() {
		return edges;
	}
	public void setEdges(Set<Node<T>> edges) {
		this.edges = edges;
	}
	public void addEdgeTo(Node<T> n1) {
		edges.add(n1);
	}
}

public class UnWeightedGraph<T> {
	
	private List<Node<T>> nodes;
	public UnWeightedGraph() {
		nodes = new LinkedList<Node<T>>();
	}	
	public void dfs(Node<T> node) {
		node.setVisited(true);
		Set<Node<T>> edges = node.getEdges();
		for(Node<T> edge: edges) {
			if(!edge.isVisited())
				dfs(edge);
		}
	}
	public void dfs() {
		dfs(nodes.get(0));
	}
	public void bfs() {
		bfs(nodes.get(0));
	}
	public void bfs(Node<T> node) {
		MQueue<Node<T>> q = new MQueue<>();
		q.add(node);
		while(!q.isEmpty()) {
			Node<T> n = q.remove();
			Set<Node<T>> edges = n.getEdges();
			for(Node<T> edge: edges) {
				if(!edge.isVisited())
					q.add(edge);
			}
			n.setVisited(true);
		}
	}
}