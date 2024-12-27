import java.util.*;
import java.math.*;

class AddUsingStrings 
{
    public static String addUsingStrings(String input1,String input2)
    {
        BigInteger p1 = new BigInteger(input1);
        BigInteger p2 = new BigInteger(input2);
        return ""+p1.add(p2);
    }
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        String str1 = read.next();
        String str2 = read.next();
        String result = addUsingStrings(str1,str2);
        System.out.println(result);
    }
}