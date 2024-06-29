import java.util.ArrayList;

public class Grapher {
	ArrayList<Node>node;
	int matrix[][];
	Grapher(int size){
		node=new ArrayList<Node>();
		matrix=new int[size][size];
		
	}
	public void addNode(Node node) {
		
	}
	public void addEdge(int src,int dst) {
		matrix[src][dst]=1;
	}
	public boolean checkEdge(int src,int dst) {
		if(matrix[src][dst]==1)
			return true;
		else
			return false;
		
	}
	public void print() {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++ ) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
