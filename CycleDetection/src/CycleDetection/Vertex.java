package CycleDetection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANIRUDDHA
 */

public class Vertex {
 
	private String name; //The name
	private boolean visited; //Visited vertices
	private boolean beingVisited; //vertices to be visited 
	private List<Vertex> neighbourList; //List of all neighbours
	
	//Constructor
	public Vertex(String name){
		this.name=name;
		this.neighbourList=new ArrayList<>();
	}
	
	public void addNeighbour(Vertex vertex){
		this.neighbourList.add(vertex);
	}

	//Getters and Setters

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	//Override the toString method to return the traversal path 
	@Override
	public String toString() {
		return ""+this.name;
	}
}
