import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        double scoreTotal = 0.0;
        double scoreCount = 0.0;
        double testScore = 0.0;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore < 999 || testScore > 999) {
            // get the input from the user
            System.out.print("Enter score: ");
            String input = sc.nextLine();
            testScore = Double.parseDouble(input);

            // accumulate score count and score total
            if (testScore<=100 && testScore>0) {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            } else if(testScore>100 && testScore != 999) {
            	
            System.out.println("Invalid entry; not counted");
            }
        }

        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}