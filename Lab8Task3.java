import java.util.Scanner;

public class Lab8Task3{
	public static void displaySortedNumbers(double num1, double num2, double num3){
	double max = Math.max(num1, Math.max(num2, num3));
	double min = Math.min(num1, Math.min(num2, num3));
	double middle = num1 + num2 + num3 - max - min;
	
	System.out.println("Three numbers in increasing order are: " + min + "<" + middle + "<" + max);
	return;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("First number: ");
	double first = input.nextDouble();
	System.out.print("Second number: ");
	double second = input.nextDouble();
	System.out.print("Third number: ");
	double third = input.nextDouble();

	displaySortedNumbers(first, second, third);

	input.close();
	}
}