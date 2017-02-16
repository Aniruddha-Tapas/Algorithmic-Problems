package CycleDetection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author ANIRUDDHA
 */
 
public class Main {

	public static void main(String[] args) {
		
		// Create vertices
        Vertex vertex1 = new Vertex("A");
        Vertex vertex2 = new Vertex("B");
        Vertex vertex3 = new Vertex("C");
        
        //Add neighbours to vertices
        vertex1.addNeighbour(vertex2);
        vertex2.addNeighbour(vertex3);
		vertex3.addNeighbour(vertex1); //Backward edge
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
	    
		CycleDetection cd = new CycleDetection();
		cd.detectCycles(vertexList);
	   
	}
}
