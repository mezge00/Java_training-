/*Here is a graph class which is built on three methods
 * and one constructor. The main purpose of this graph is 
 * to create a Minimum spanning tree. 
 * To create a graph we can use an arraylist to store the 
 * Node elements, or any other list but here I am used ArrayList 
 * and priority queue's to implement the greedy algorithm.
 * The priority queue specially the heap data structure allows 
 * us to store the previously visited elements and at the same time 
 * it also helps us to remove those elements easily.
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class Graph{
		List<List<edge>> graph;  //Creating a list of sublit edge type graph 
		boolean visited[];       // An array used for storing the visited elements
		int node;                // Nodes or the size of our graph these can be objects 
		Graph(int node){
			graph=new ArrayList<>();
			visited=new boolean[node];
			this.node=node;
// At the first time all the weights are infinite and then I used null instead of infinite
// That's how the prime's algorithm work.
			for(int i=0;i<node;i++) {
				graph.add(i,new ArrayList<>());
			}
			
		}// end of constructor 
		//Adding the edge to the nodes
		// Here we can use the source and destination nodes, and their weight
		// as an argument, And more importantly we need to connect in both forward and backward sides
		// Because this is undirected graph that's how prime's algorithm works.
		public void addEdge(int srcNode,int destNode,int weight) {
			graph.get(srcNode).add(new edge(destNode,weight));
			graph.get(destNode).add(new edge(srcNode,weight));
		}
		
		// Here is the method that traverses on the unweighed tree 
		// or previously unvisited tree and we need to return the minimum 
		// distance on our ways.
		
		public int minimumCostForUntraversedGraph(int origin) {
			// I created a priority queue(heap) to keep track of the visited nodes
			PriorityQueue<edge> myheap=new PriorityQueue<>((e1,e2)->e1.weight-e2.weight);
			// when we visit we need to update the visited status
			visited[origin]=true;
			List<edge>childsource=graph.get(origin);
			for(edge e:childsource) {
				myheap.add(e);
			}
			//create a variable that constantly updates if the condition is true.
			
			int minimumcost=0;
			while(!myheap.isEmpty()) {  // We iterate until the heap is empty or all vertices are finished
				edge minvalueEdge=myheap.poll();  
				if(visited[minvalueEdge.destination])// If it is already visited jump to the next
					continue;
				visited[minvalueEdge.destination]=true;
				minimumcost=minimumcost+minvalueEdge.weight;
				List<edge>childList=graph.get(minvalueEdge.destination);
				for(edge e:childList) {
					if(!visited[e.destination])
						myheap.add(e);  // Just continue adding to the queue until all the vertices are finished 
					
				}
			}
			return minimumcost;
		}
		//this method is used to retrieve the total cost of the tree.
		public int myMST() {
			int minimumCost=0;
			for(int i=0;i<node;i++) {
				if(!visited[i])
					minimumCost=minimumCost+minimumCostForUntraversedGraph(i);
			}
			return minimumCost;
		}
	}