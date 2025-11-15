import java.util.Scanner;

public class Lab8Task8{
	public static int countVowels(String letter){
	int count = 0;
	String lowercase = letter.toLowerCase();
	for (int i = 0; i < letter.length(); i++){
	  char ch = lowercase.charAt(i);
	  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
	     count++;
	  }
	}
	return count;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String letter = input.nextLine();
	System.out.println("The number of vowels in the string = " + countVowels(letter));
	
	input.close();
	}
}