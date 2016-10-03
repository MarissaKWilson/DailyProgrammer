import java.util.Scanner;

public class Gameplay {
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number or q to quit: ");
		while(scan.hasNext()){
			if (scan.next().equalsIgnoreCase("q")){
				System.exit(0);
			}
			int num = scan.nextInt();
			while(num != 1){
				int adjustment = 0;
				if (num % 3 == 1){
					adjustment = -1;
					printhelper(num, adjustment);
					num--;
					
				} else if (num % 3 == 2){
					adjustment = 1;
					printhelper(num, adjustment);
					num++;
				} else {
					printhelper(num, adjustment);
				}
				num = num/3;
			}
			System.out.println("1");
		}
	}
	public static void printhelper(int i, int adjustment){
		System.out.println(i + " " + adjustment);
	}
}