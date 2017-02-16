package dfs;
/**
 *
 * @author ANIRUDDHA
 */

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    
    private String name; //The name of the vertex
    private boolean visited; //Visted vertices
    private List<Vertex> adjacenciesList; //List of all adjacent neighbours
    private Vertex predecessors; //Lis of previous vertex
    
    public Vertex(String name){
        this.name = name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }
    
    public void addNeighbour(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public Vertex getPredecessors() {
        return predecessors;
    }

    public void setPredecessors(Vertex predecessors) {
        this.predecessors = predecessors;
    }

    public String toString(){
        return this.name;
    }
}
