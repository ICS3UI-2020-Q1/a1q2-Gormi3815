import java.util.Scanner;


/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter two numbers you would like to divide on seperate lines");
    int firstNumber =input.nextInt();
    int secondNumber =input.nextInt();
    int finalNumber =firstNumber/secondNumber;
    int remainderNumber= firstNumber % secondNumber;
   System.out.println("The number is " + finalNumber +  " with a remainder of " + remainderNumber + ".");
  }
}
