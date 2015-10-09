import java.util.Scanner
public class COMSC1_CLASS_NOTES_PROJECT1 {
	public static void main(String[] args) {
		System.out.println("Hello Class");
		//System.out.println("First number: " + numberOne);
		
		//Outline for addition problem.
		
		//Round 1
		// Generate 2 random numbers
		int numberOne = (int)(Math.random() *10);
		int numberTwo = (int)(Math.random() *10);
		
		// Ask the user to add these two numbers together
		System.out.println("What is " + numberOne + "Plus " + numberTwo + "?");
		
		// Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt ();
		// Check if the answer was correct
		//  If correct, display that it was correct
		int correctAnswer = numberOne + NumberTwo
		if (studentAnswer == correctAnswer){
			System.out.println("Answer was correct");
		}else{
			System.out.println("Answer was incorrect");
		}
		//   Give them points
		//   Make the next question harder
		//  If not correct, display it was incorrect
		//   Display the correct answer
		//   Do not give them points
		//   Restart round 1
		
		//Round 2
		
		//Round 3
		
		//Round 4


	}

}
