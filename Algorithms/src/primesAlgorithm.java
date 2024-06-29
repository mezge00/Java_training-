/*
 * This is the main method there is nothing other than 
 * testing the two classes. Just creating an object of graph
 * class and then I added the edges and nodes of the given graph.
 * 
 * The total cost of the tree is: 20,
 * The asymptotic analysis of the graph is, O(ElogE) where is the 
 * number of edges. 
 * **/
public class primesAlgorithm {
	
	public static void main(String[] args) {
		// And here please note that I used 9 as a node size that's
		// because the array by default starts from 0 to length of array,and
		//our graph starts from 1 rather than zero so that 9 is better to work with.
		Graph mstGraph=new Graph(9);
		mstGraph.addEdge(1, 2, 4);
		mstGraph.addEdge(1, 5, 5);
		mstGraph.addEdge(1, 8, 8);
		mstGraph.addEdge(2, 4, 4);
		mstGraph.addEdge(2, 3, 3);
		mstGraph.addEdge(5, 6, 1);
		mstGraph.addEdge(5, 7, 2);
		mstGraph.addEdge(7, 8, 3);
		
		System.out.println("The total cost is: "+mstGraph.myMST());
	}

}
