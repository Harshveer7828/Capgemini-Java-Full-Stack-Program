import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number one:-");
		int a = sc.nextInt();
		System.out.print("Enter the number two:-");
		int b = sc.nextInt();
		System.out.println("Enter the operation\n1. Addition\n2. Subtraction\n3. Multiplication");
		int operation = sc.nextInt();
		
		switch(operation){
			case 1:{
				System.out.print("Sum of the number is :- "+ (a+b));
				break;
			}
			case 2:{
				System.out.print("Subtraction of the number is :- "+ (a-b));
				break;
			}
			case 3:{
				System.out.print("Multiplication of the number is :- "+ (a*b));
				break;
			}
			case 4:{
				System.out.print("Remainder of the number is :- "+ (a/b));
				break;
			}
			default : {
				System.out.print("Ooops! Invalid input");
				break;
			}
		}
		
	}
}