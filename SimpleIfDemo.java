import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0)
            System.out.println("HiFive");
        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
/*output of program execution
Scenario 1 : when we enter the integer value 90
Enter an integer:
90
HiFive why 90/5 = 18 ,
since there is no decimal value ,
this means 90 is exactly divisible by 5, and there is no reminder, means reminder is 0

HiEven why 90/2 = 45
since there is no decimal value ,
this means 90 is exactly divisible by 2, and there is no reminder, means reminder is 0

Scenario 2 : when we enter the integer value as 15
Enter an integer:
15
HiFive
15 / 5 = 3
since there is no decimal value ,
this means 15 is exactly divisible by 5, and there is no reminder, means reminder is 0

15 / 2 = 7.5 = 14 + 1
since there is decimal value,
this means 15 is not exactly divisible by 2, and there is reminder, means reminder is 1

 */