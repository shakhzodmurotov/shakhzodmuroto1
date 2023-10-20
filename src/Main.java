import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        float result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a first number");
        float firstNumber = scan.nextInt();
        System.out.println("Please enter a second number");
        float secondNumber = scan.nextInt();
        result = firstNumber + secondNumber;
        System.out.println("Your sum is: "+ result);
        scan.close();
    }
}