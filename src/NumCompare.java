import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userOne = 0;
        int userTwo = 0;
        String invalid = "You've entered an invalid number.";

        System.out.println("User, enter your first number:");
        if (in.hasNextInt()) {
            userOne = in.nextInt();
        }
        else
        {
            invalid = in.next();
            System.out.println("Your input was invalid.");
            return;
        }

        System.out.println("User, enter your second number:");
        if (in.hasNextInt())
        {
            userTwo = in.nextInt();
        }
        else {
            invalid = in.next();
            System.out.println("Your input was invalid.");
            return;
        }

        if (userOne > userTwo)
             {
                 System.out.println(userTwo + " is less than " + userOne);
             }
        else if (userOne == userTwo)
            {
                 System.out.println(userOne + " is equal to " + userTwo);
            }
        else
            {
            System.out.println(userOne + " is less than " + userTwo);
            }
    }
}

