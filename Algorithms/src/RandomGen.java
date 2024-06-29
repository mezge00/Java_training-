import java.util.Arrays;

public class RandomGen {

	public static void main(String[] args) {
		int []A=new int[10000];
		
		for(int i=0;i<A.length;i++) {
			int a=(int)(Math.random()*1000+1);
			A[i]=a;
		}
		System.out.println(Arrays.toString(A));

	}

}
