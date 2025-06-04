import java.util.*;
import java.util.Random;
public class randomnumber {

    public static void guessinggame()
    {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        int number=1+r.nextInt(100);
        int c = 0; 
        int j = 5; 
        boolean guess= false;
        System.out.println("A random number is chosen between 1 and 100.");
        System.out.println( "You have " + j + " attempts per round to guess the correct number.");
        System.out.println( "Start guessing the correct number between 1 and 100");
        while (guess!=true) {
           
            for (int l=0; l<j; l++) 
            {
                System.out.print("Enter your guess: ");
                int guessnumber = sc.nextInt();
                c++; 

                if (guessnumber==number) {
                    System.out.println(
                        "Congratulations! You guessed the correct number in "+c+ " attempts.");
                    guess = true;
                    break;
                }
                else if (guessnumber < number) {
                    System.out.println(
                        "The number is greater than "+guessnumber);
                }
                else {
                    System.out.println(
                        "The number is less than "+guessnumber);
                }
            }

            if (guess!=true) {
                System.out.println("You have used all "+j+" attempts.");
                System.out.print("Do you want to continue guessing the number? (yes/no): ");
                String s=sc.next();
                if (s.equalsIgnoreCase("no")) 
                {
                    System.out.println("Game Over! The correct number was: "+number);
                    break;
                }
            }
        }
        sc.close();
    }
    
    public static void main(String args[])
    {
        guessinggame();
    }
}
