public class StringEditor{

  public String reversedstr;

  public String strreverse(String input){
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
