import java.lang.Object;

public class converter{

  public String result;

  public String toBase10(String input, int base){
    char[] in = input.toCharArray();
    int res = 0;
    int j = 0;
    String converted = "";
    for(int i = in.length - 1; i >= 0; i--){
      if(Character.getNumericValue(Character.toLowerCase(in[i])) >= base){
          converted = null;
          break;
      }
      res += Math.pow(base,i) * Character.getNumericValue(Character.toLowerCase(in[j]));
      //System.out.println(res);
      j++;
    }
    converted = converted == null?null:Integer.toString(res);
    //System.out.println(converted);
    return converted;
  }

  public String fromBase10(int input, int base){
    String res = "";

    while(input != 0){
      res += Character.toUpperCase(Character.forDigit((input %  base), base));
      input /= base;
    }

    StringEditor stredit = new StringEditor();

    res =  stredit.strreverse(res);

    return res;
  }
}
