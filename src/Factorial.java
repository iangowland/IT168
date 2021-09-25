import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        int n = 0;

        int nextFact = 0;

        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number \"n\" to be a factorial n! : ");

        n = input.nextInt();

        nextFact = n - 1;

        int total = n;
       
        while (counter < (n-1))
        {
            total = total * (nextFact);
            counter++;
            nextFact--;
        }
    
        System.out.println("The factorial of " + n + " = " + total);

    }
    
}
