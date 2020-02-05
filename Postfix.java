import java.util.Scanner;

public class Postfix {

  public static void main(String[] args) {

    StringStack ss = new StringStackArray();
    System.out.println("Enter an expression to evaluate: ");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String[] parts = s.split("\\s+");

    for (int i=0; i<parts.length; i++) {

      // fill in the algorithm here!

    }
    System.out.println(ss.toString());

  }
}
