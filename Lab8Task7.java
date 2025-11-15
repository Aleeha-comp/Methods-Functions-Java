import java.util.*;

public class Lab8Task7{
	public static void printMatrix(int n){
	int num;
	for (int r = 0; r < n; r++){
	    for (int c = 0; c < n; c++){
		num = (int)(Math.random() * 2);
		System.out.print(num + "   ");
	    }
	  System.out.println();
	}
	return;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n = input.nextInt();
	printMatrix(n);
	input.close();
	}
}