package dfs;

import java.util.Stack;

/**
 *
 * @author ANIRUDDHA
 */

// DFS algo using Stack
public class DFS {
    
    private Stack<Vertex> stack;
    
    public DFS(){
        this.stack = new Stack<>();
    }
    
    public void dfsalgo(Vertex root){
        
        stack.add(root);
        root.setVisited(true);
        
        while(!stack.isEmpty()){
            
            //Pop the actual vertices for display
            Vertex actualVertex = stack.pop();
            System.out.print(actualVertex+"-");
            
            //Visit all neighbours and add them to visited.
            for(Vertex v: actualVertex.getAdjacenciesList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    v.setPredecessors(actualVertex);
                    stack.push(v);
                }
            }
        }
    }
    
}
