package hamiltoniancycle;

class Main {
    
    public static void main(String args[]) {
        
    	HamiltonianAlgorithm hamiltonian = new HamiltonianAlgorithm();
        /**
           (0)
            |      	  
            |   	  
            | 	      
           (1)-------(2)    */
        
    	int adjacencyMatrix[][] = {{0, 1, 0},
        				  {1, 0, 1},
        				  {0, 1, 0}
        };
 
        hamiltonian.hamiltonianCycle(adjacencyMatrix);
    }
}
