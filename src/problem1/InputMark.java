package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMark {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isCorrectNumber = false;
		while(isCorrectNumber == false){
			try {
				System.out.println("Please enter a number: ");
				int input = scan.nextInt();
				if (input < 0 | input > 100)
					throw new MyExceptions(input);
				else
					isCorrectNumber = true;
			} catch (MyExceptions e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Input value should be a number!");
				scan.nextLine();
			}
		}
		System.out.println("End");
		scan.close();
	}

}
