import java.util.Scanner;

public class reverseStr{

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  // Reading from System.in

    System.out.print("Enter a string: "); //Asking for input
    String s = in.nextLine(); //reading input

    String j = strreverse(s); //reversing input
    System.out.println(j); //printing the reversed string
  }

  public static String strreverse(String input){
    char[] in = input.toCharArray();
    int i = 0;
    int j = in.length - 1;
    char temp;

    while(i < j){
      temp = in[i];
      in[i] = in[j];
      in[j] = temp;
      i++;
      j--;
    }

    return new String(in);
  }
}
