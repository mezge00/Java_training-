import java.util.ArrayList;
import java.util.Collections;

public class decimalToBinary {
	public static void main(String [] args) {
	convert(2146999999);
	}
	static ArrayList<Integer> A=new ArrayList<Integer>();
	static int i=0;
	public static  <A> void convert(int d) {
		while(d!=0) {
			A.add(d%2);
			d=d/2;
			i++;
			
			
		}
		Collections.reverse(A);
		for(int j:A) {
			System.out.print(j);
		}
		System.out.println("");
		System.out.println(A.size()+" bits");
		
			
		}
	

}
