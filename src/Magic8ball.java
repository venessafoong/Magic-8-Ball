import java.util.Random;
import java.util.Scanner;

/*Ways to make it better:
 ensure input is a string
 allow for multiple questions without resetting program
 */

//A toy that outputs a random fortune each time it executes.
public class Magic8ball
{
    //main method
    public static void main(String args[])
    {
        //welcome message and question input
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8-ball! Before we start, what is your name?");
        String name = input.next();
        System.out.printf("Hello %s! What do you want to ask me? (Yes or no questions only)%n", name);
        String question = input.next();

        //generate random int
        Random rand = new Random();
        int intRandom = rand.nextInt(8);

        //conditional statement
        switch (intRandom)
        {
            case 1:
                System.out.println("Ya la!");
                break;
            case 2:
                System.out.println("Duh~");
                break;
            case 3:
                System.out.println("Erm...");
                break;
            case 4:
                System.out.println("Maybe lor.");
                break;
            case 5:
                System.out.println("I dunno.");
                break;
            case 6:
                System.out.println("WTF no!");
                break;
            case 7:
                System.out.println("Siao ah you?!");
                break;
            case 8:
                System.out.println("Yea boi!");
                break;
        }
    }
}
