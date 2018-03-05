
import java.util.Scanner;

public class MathAdditionProb {

    public static void main(String[] args) {
        //Create scanner
        Scanner s = new Scanner(System.in);
        //magic 1: generate the question
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        //make sure number 1 is greater than or equal to number 2
        if (num1<num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("What is " + num1 + " - " + num2 + " ?");
        

        //get input - user's answer to the question
        
        int ans = s.nextInt();

        //check the answer
        boolean isCorrect = ans == (num1 - num2);

        //display resultw
        if (isCorrect == true) {
            System.out.println("Your answer is correct.");
        } else {
            System.out.println("Your answer is not correct.");
        }

    }
}
