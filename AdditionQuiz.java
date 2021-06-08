import java.util.Scanner;

public class AdditionQuiz {
 public static void main(String[] args) {

     //single digit random number generation style
     int number1 = (int)(System.currentTimeMillis() % 10); //7
     int number2 = (int)(System.currentTimeMillis() * 7 % 10); //9

// Create a Scanner
         Scanner input = new Scanner(System.in);
         System.out.print("What is " + number1 + " + " + number2 + "? ");
         // "What is 7 + 9 ? "
         int answer = input.nextInt();
         System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
         }
 }

/*
main idea about this program lies on (number1 + number2 == answer) which is nothing but "boolean b = ( (7+9)== 10 )"
//scenario 1
//when we input the correct answer
 What is 3 + 1? 4
        3 + 1 = 4 is true

//scenario 2
//when we input the incorrect answer
What is 9 + 3? 10
9 + 3 = 10 is false
*/
