import java.util.*;

public class Lab8Task1b{
	public static void reverse(int number){
	int j;
	while(number != 0){
	  j = number % 10;
	  System.out.print(j);
	  number = number / 10;
	}
	return;
}

	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	reverse(number);
	
	input.close();
	}
}
	