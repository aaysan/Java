import java.util.Scanner;

public class BaseConversion{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Scanner strin = new Scanner(System.in);

    System.out.print("Enter the base of the number: ");
    int frombase = in.nextInt();
    System.out.print("Enter the number: ");
    String number = strin.nextLine();
    System.out.print("Enter the base you want the number in: ");
    int tobase = in.nextInt();


    converter alp = new converter();
    alp.result = alp.toBase10(number,frombase);
    alp.result = alp.fromBase10(Integer.parseInt(alp.result),tobase);
    //System.out.println(number + " converted from base " + frombase + " to base " + tobase + " is " + alp.result);
    System.out.println(alp.result);
  }
}
