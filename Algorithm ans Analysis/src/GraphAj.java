import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAj {
	
	ArrayList <LinkedList<Node>> alist;
	public GraphAj() {
		alist=new ArrayList<>();
	}
	public void addNode(Node node) {
		LinkedList<Node>currentList=new LinkedList<>();
		currentList.add(node);
		alist.add(currentList);
		
	}
    public void addEdge(int src, int dst) {
		Node dstNode=alist.get(dst).get(0);
		alist.get(src).add(dstNode);
	}
    public boolean checkEdge(int src, int dst) {
		return false;
    	
    	
    }
    public void print() {
    	
    }
}
