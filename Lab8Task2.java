import java.util.Scanner;

public class Lab8Task2{
	public static int reverse(int number){
	int reversed = 0;
	while(number != 0){
	   int digit = number % 10;
	   reversed = reversed * 10 + digit;
	   number = number / 10;
	}
	return reversed;
	}

	public static Boolean isPalindrome(int number){
	return number == reverse(number);
	}

	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = console.nextInt();
	
	if(isPalindrome(number)){
	  System.out.println(number + " is a palindrome.");
	}
	else{
	  System.out.println(number + " is not a palindrome.");
	}

	console.close();
	}
}
