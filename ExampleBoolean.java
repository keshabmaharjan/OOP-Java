import java.util.Scanner;

public class ExampleBoolean {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Number = ");
        num1 = input.nextInt();

        System.out.println("Enter the second Number = ");
        num2 = input.nextInt();

        boolean b = (num1 == num2);
        System.out.println("Number 1 and Number 2 is equal ? " + b);
    }
}

//output
/*
false
 */