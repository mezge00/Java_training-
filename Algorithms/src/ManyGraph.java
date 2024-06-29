import java.util.ArrayList;
/*
    Java program for
    Prim's algorithm using adjacency list
*/


public class ManyGraph
{
    int vertices;
    public ArrayList < ArrayList < Edge >> adjacencylist;
    public Graph(int vertices)
    {
        this.vertices = vertices;
        this.adjacencylist = new ArrayList < ArrayList < Edge >> (vertices);
        for (int i = 0; i < this.vertices; ++i)
        {
            this.adjacencylist.add(new ArrayList < Edge > ());
        }
    }
    public void addEdge(int u, int v, int weight)
    {
        adjacencylist.get(u).add(new Edge(u, v, weight));
        if (u == v)
        {
            // self loop
            return;
        }
        adjacencylist.get(v).add(new Edge(v, u, weight));
    }
    public void decreaseKey(smallHeap minHeap, int newKey, int vertex)
    {
        int index = minHeap.indexes[vertex];
        Nodee node = minHeap.node[index];
        node.key = newKey;
        minHeap.bubbleUp(index);
    }
    public void primMST()
    {
        boolean[] inHeap = new boolean[this.vertices];
        ResultSet[] resultSet = new ResultSet[this.vertices];
        int[] key = new int[this.vertices];
        Nodee[] heapNodes = new Nodee[this.vertices];
        // Set default value of heap nodes resultset and keys
        for (int i = 0; i < this.vertices; i++)
        {
            heapNodes[i] = new Nodee();
            heapNodes[i].vertex = i;
            heapNodes[i].key = Integer.MAX_VALUE;
            resultSet[i] = new ResultSet();
            resultSet[i].parent = -1;
            inHeap[i] = true;
            key[i] = Integer.MAX_VALUE;
        }
        heapNodes[0].key = 0;
        smallHeap minHeap = new smallHeap(this.vertices);
        for (int j = 0; j < this.vertices; j++)
        {
            minHeap.insert(heapNodes[j]);
        }
        int i = 0;
        while (minHeap.isEmpty() == false)
        {
            Nodee extractedNode = smallHeap.extractMin();
            int extractedVertex = extractedNode.vertex;
            inHeap[extractedVertex] = false;
            while (i < adjacencylist.get(extractedVertex).size())
            {
                Edge edge = adjacencylist.get(extractedVertex).get(i);
                if (inHeap[edge.v])
                {
                    int v = edge.v;
                    int w = edge.weight;
                    if (key[v] > w)
                    {
                        key[v] = w;
                        decreaseKey(minHeap, w, v);
                        resultSet[v].parent = extractedVertex;
                        resultSet[v].weight = w;
                    }
                }
                i++;
            }
            i = 0;
        }
        int result = 0;
        System.out.print("\n\n Minimum Spanning Tree \n");
        for (int node = 1; node < this.vertices; ++node)
        {
            System.out.println(" Edge (" + resultSet[node].parent + 
                               "-" + node + ")  weight : " + 
                               resultSet[node].weight);
            result += resultSet[node].weight;
        }
        // Display calculated result
        System.out.println(" Total minimum weight : " + result);
    }
    // Display graph nodes and edges
    public void printGraph()
    {
        System.out.print("\n Graph Adjacency List ");
        for (int i = 0; i < this.vertices; ++i)
        {
            System.out.print(" \n [" + i + "] :");
            // iterate edges of i node
            for (int j = 0; j < this.adjacencylist.get(i).size(); ++j)
            {
                System.out.print("  " + this.adjacencylist.get(i).get(j).v);
            }
        }
    }
    public static void main(String[] args)
    {
        Graph g = new Graph(10);
        g.addEdge(0, 1, 7);
        g.addEdge(0, 7, 6);
        g.addEdge(0, 8, 4);
        g.addEdge(1, 2, 9);
        g.addEdge(1, 8, 6);
        g.addEdge(2, 3, 8);
        g.addEdge(2, 6, 12);
        g.addEdge(2, 9, 14);
        g.addEdge(3, 4, 16);
        g.addEdge(3, 9, 5);
        g.addEdge(4, 5, 15);
        g.addEdge(5, 6, 8);
        g.addEdge(5, 9, 7);
        g.addEdge(6, 7, 2);
        g.addEdge(6, 8, 10);
        g.addEdge(8, 9, 3);
        // Display graph element
        g.printGraph();
        g.primMST();
    }
	public void myMST() {
		// TODO Auto-generated method stub
		
	}
}