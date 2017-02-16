package dfs;

/**
 *
 * @author ANIRUDDHA
 */
public class Main {

    public static void main(String[] args) {
        
        DFS dfs = new DFS();
        
        // Create vertices
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        
        //Add neighbours to vertices
        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);
        
        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);
        
        // Start the DFS with the root here vertex1
        dfs.dfsalgo(vertexA);
    }
    
}
