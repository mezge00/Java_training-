import java.util.Scanner;

public class LinearProgramming {
public static int MaxOut(int x,int y) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size: ");
	double n=in.nextDouble();
	int Max = 0;
	for(int i=0;i<n;i++) {
		x=(int)(Math.random()*100+1);
		y=(int)(Math.random()*100+1);
		if(2*x+3*y==100&&10*x+4*y==300)
			 Max=16*x+11*y;
	}
	return Max;
	
}
	public static void main(String[] args) {
		int x=(int)(Math.random()*100+1);
		int y=(int)(Math.random()*100+1);
		System.out.println(MaxOut(x,y));

	}

}
