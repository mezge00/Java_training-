import java.util.Scanner;

public class DayPackage {
	static int totalCost=0;
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the enter the amount");
		int amount=in.nextInt();
		voicePackege(amount);
		System.out.println(totalCost);
		
				

	}
	public static void voicePackege(int amountInMinuite) {
		switch(amountInMinuite) {
		case 12:
			System.out.println("The price is 5 birr");
			totalCost=totalCost+5;
			break;
		case 20:
			System.out.println("The price is 9 birr");
			totalCost=totalCost+9;			
			break;
		case 38:
			System.out.println("The price is 15 birr");
			totalCost=totalCost+15;
			break;
		case 100:
			System.out.println("The price is 40 birr");
			totalCost=totalCost+40;
			break;
		default:
			System.out.println("That is unlimited go and check for the lengterm ");
			break;
			
		}
		
	}
	public void internetPackage(int amountInMegaByte) {
	
		switch(amountInMegaByte) {
	case 35:
		System.out.println("The price is 3 birr");
		totalCost++;
		break;
	case 75:
		System.out.println("The price is 5 birr");
		totalCost++;
		break;
	case 200:
		System.out.println("The price is 12 birr");
		totalCost++;
		break;
	case 500:
		System.out.println("The price is 25 birr");
		totalCost++;
		break;
	case 1024:
		System.out.println("The price is 45 birr");
		totalCost++;
		break;
		
	default:
		System.out.println("That is unlimited go and check for the lengterm ");
		break;
		
		}
		
	}
	public void messagePackege(int amountInNumberofMessages) {
		switch(amountInNumberofMessages) {
		case 20:
			System.out.println("The price is 3 birr");
			totalCost++;
			break;
		case 100:
			System.out.println("The price is 10 birr");
			totalCost++;
			break;
		case 200:
			System.out.println("The price is 30 birr");
			totalCost++;
			break;
		
		default:
			System.out.println("That is unlimited go and check for the lengterm ");
			break;
			
			}
			
		
	}

}
