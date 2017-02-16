package CycleDetection;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author ANIRUDDHA
 */

// Cycle Detection:
// We can apply Topological Ordering only on DAGs(Directed Acyclic Graphs)
// If a graph has a cycle, it wont be a DAG
// Hence to apply TopologicalOrdering, Cycle Detection is necessary
// It can be also used to detect deadlocks.

public class CycleDetection {
	
	//Detect cycles using DFS
	public void detectCycles(List<Vertex> vertexList){
		for(Vertex v : vertexList){
			if( !v.isVisited()){
				dfs(v);
			}
		}
	}
	
	//Recursive DFS algorithm
	public void dfs(Vertex vertex){
	
		vertex.setVisited(false);
		vertex.setBeingVisited(true);
		
		for(Vertex v : vertex.getNeighbourList()){
			
			if( v.isBeingVisited()){
				System.out.print("Cycle is detected...");
				return;
			}
			
			if( !v.isVisited()){
				v.setVisited(true);
				dfs(v);
			}
		}
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
		
	}

	// We use the stack data structure just like in DFS
	private Stack<Vertex> stack;
	
	public CycleDetection(){
		this.stack = new Stack<>();
	}
	
	
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
}
