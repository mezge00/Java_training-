import java.util.Arrays;

public class quicksortAl {

	public static void main(String[] args) {
		int [] A= {4,5,6,7,2,1,7,3};
		quicksort(A,0,A.length-1);
		System.out.println(Arrays.toString(A));

	}
	public static void quicksort(int array[],int start,int end) {
		if(end<=start)
			return;
		int pivot=partion(array,start,end);
		quicksort(array,start,pivot-1);
		quicksort(array,pivot+1,end);

		
		
	}
	private static int partion(int[] array, int start, int end) {
		int pivot=array[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
				
				
			
		}
		i++;
		int temp=array[i];
		array[i]=array[end];
		array[end]=temp;
		return i;
	}

}
