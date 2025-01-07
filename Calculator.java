import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number on:-");
		int a = sc.nextInt();
		System.out.print("Enter the number on:-");
		int b = sc.nextInt();
		System.out.print("Addition is :- "+(a+b) );
	}
}