import java.util.Arrays;

public class dupliicateRemoving {

	public static void main(String[] args) {
		int []A= {10,9,4,5,2,1,4,1,2,4,4,4,5,6,7,8,5};
		int B[] = new int[A.length];
		for(int i=0;i<A.length;i++) {
			int N=A[i];
			for(int j=0;j<A.length;j++) {
				if(N==A[j])
					B[j]=0;
				else
					B[i]=A[i];
					//System.out.println("WE got  "+A[j]);
			}
		}
      System.out.println(Arrays.toString(B));
	}

}
