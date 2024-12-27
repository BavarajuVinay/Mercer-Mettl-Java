import java.util.*;
class UserIDGeneration 
{
    public static String userIDGeneration(String input1, String input2, int input3, int input4)
    {
        String small = "";
        String big = "";
        if(input1.length()>input2.length())
        {
            small = input2;
            big = input1;
        }
        else if(input1.length()<input2.length())
        {
            small = input1;
            big = input2;
        }
        else 
        {
            if(input1.compareTo(input2)>0)
            {
                small = input2;
                big = input1;
            }
            else if(input1.compareTo(input2)<0)
            {
                small = input1;
                big = input2;
            }
            else 
            {
                small = input1;
                big = input1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<big.length();i++)
        {
            char c = big.charAt(i);
            if(Character.isUpperCase(c))
            {
                sb.append(Character.toLowerCase(c));
            }
            else
            {
                sb.append(Character.toUpperCase(c));
            }
        }
        String res = sb.toString();
        String integer = Integer.toString(input3);
        String arr1[] = small.split("");
        String arr2[] = integer.split("");
        String result = arr1[arr1.length-1].toUpperCase()+res+arr2[input4-1]+arr2[arr2.length-input4];
        return result;
    }
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        String str1 = read.next();
        String str2 = read.next();
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        String result = userIDGeneration(str1,str2,n1,n2);
        System.out.println(result);
        
    }
}