import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        float radius;
        float area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius = ");

        radius = input.nextFloat();

        if(radius<0) {
            System.out.println("Incorrect input");
        }
        else {
            area = (float) (radius * radius * 3.14159);
            System.out.println("Area of Circle with radius="+radius+" is "+area);
        }

        //area = (float) (radius * radius * 3.14159);
        //System.out.println("Area of Circle with radius="+radius+" is "+area);
    }
}

/* A. Misleading output
        Enter the value of radius =
        -40
        Area of Circle with radius=-40.0 is 5026.544

   B. Using if and else we can overcome this scenario
--when we input the negative value of radius
Enter the value of radius =
-40
Incorrect input

Process finished with exit code 0

--when we input the positive value of radius
Enter the value of radius =
40
Area of Circle with radius=40.0 is 5026.544

Process finished with exit code 0
*/
