
public class Binarysearch {

	public static void main(String[] args) {
		

	}
	public static int binarySearch(int A[],int particularOrder) {
		int early=0;
		int late=A.length-1;
		while(early<=late) {
			int middle=(A[late]+A[early])/2;
			if(A[middle]<particularOrder)
				early=middle+1;
			else if(A[middle]>particularOrder)
				late=middle-1;
			else
				return middle;
					
			
			
		}
		return -1;
		
	}

}
