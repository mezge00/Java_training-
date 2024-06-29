import java.util.Arrays;

public class dBay {

	public static void main(String[] args) {
		int [] A= {4,5,6,7,2,1,7,3};
		quicksort(A,0,A.length-1);
		System.out.println(Arrays.toString(A));
}
		public static void quicksort(int array[],int firstOrder,int lastOrder) {
				if(lastOrder<=firstOrder)
					return;
				int pivot=partion(array,firstOrder,lastOrder);
				quicksort(array,firstOrder,pivot-1);
				quicksort(array,pivot+1,lastOrder);

				
				
			}
			private static int partion(int[] array, int firstOrder, int lastOrder) {
				int pivot=array[lastOrder];
				int i=firstOrder-1;
				for(int j=firstOrder;j<=lastOrder-1;j++) {
					if(array[j]<pivot) {
						i++;
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
						
						
					
				}
				i++;
				int temp=array[i];
				array[i]=array[lastOrder];
				array[lastOrder]=temp;
				return i;
			}
}
