import java.util.*;

public class Lab8Task1a{
	public static int sumDigits(long n){
	int sum = 0;
	while(n != 0){
	  int num = (int)(n % 10);
	  n = n / 10;
	  sum = sum + num;
	}
	return sum;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	System.out.println("The sum of the digits of " + number + " is " + sumDigits(number));

	input.close();
	}
}