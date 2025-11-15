import java.util.Scanner;

public class Lab8Task4{
	public static int numberOfDaysInAYear (int year){
	int days;
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
	  System.out.println(year + " is a leap year.");
	  days = 366;
	}
	
	else{
	  System.out.println(year + " is not a leap year.");
	  days = 355;
	}
	
	return days;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	for (int year = 2000; year <= 2020; year++){
	System.out.println("Year: " + year);
	int numberOfDays = numberOfDaysInAYear(year);
	System.out.println("Number of Days = " + numberOfDays);
	System.out.println();
	}
	input.close();
	}
}