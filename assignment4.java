/*
 * Kevin Kantono (02/01/2020)
 * Assignment 4
 * User will be asked to input 2 parameters (string and an integer) then it will return repetition of string based on the number is inputted
 */

//importing scanner class to get user input
import java.util.Scanner;

//The class name is assignment4, this contains repl() method
public class assignment4 {

	//the main method to call any method inside the class
	public static void main(String[] args) {
		repl();
	}

	
	//this is repl method that prompts user inputs to be passed as parameters to the method
	public static void repl() {
		Scanner console = new Scanner(System.in);
		System.out.print("Please type a word: ");
		String word = console.nextLine();
		System.out.print("How many times would you like to print that word ? ");
		int reps = console.nextInt();
		
		//initializing the outcome 
		String output = "";
		//when the reps is more than 0 performs this loop
		if (reps > 0) {
			for (int i = 1; i <= reps; i++) {
				System.out.print(output + word);
			}
			//when the reps isn't more than 0 returns empty string
		} else if (reps < 0) {
			System.out.print(output);
		}

	}
}
