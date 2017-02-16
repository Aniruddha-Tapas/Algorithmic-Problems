package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ANIRUDDHA
 */

public class BFS {
    // BFS Algorithm
    public void bfsalgo(Vertex root){
        
        Queue<Vertex> queue = new LinkedList<>(); //Polymorphism: LinkedList implements Queue data structure
        root.setVisited(true);
        queue.add(root);
    
        // Iterate until queue is empty
        while(!queue.isEmpty()){
            
            //Pop the actual vertices
            Vertex actualVertex = queue.remove();
            System.out.print(actualVertex+"-");
            
            //Visit all neighbours and add them to visited.
            for(Vertex v: actualVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
    
    
}
