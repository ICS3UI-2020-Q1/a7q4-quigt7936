import java.util.Scanner;
/**
 *
 * @author Thomas Quigley
 */
public class Main {
  public static void lastDigit(int userNumber) {
    // create the without the last digit variable
    int withoutLast = userNumber;
    
    // divide the final digit by 10 then multiple by 10 to create the userNumber without the final digit
    withoutLast = withoutLast / 10;
    withoutLast = withoutLast * 10;

    // use the % to find the remainder of the userNumber / withoutLast (remainder is the last digit)
    int finalDigit = userNumber % withoutLast;
    System.out.println("The last digit of " + userNumber + " is " + finalDigit);

  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // get the users number
    System.out.println("What number would you like the last digit of?");
    int userNumber = input.nextInt();

    // call upon method lastDigit 
    lastDigit(userNumber);
  }
}
