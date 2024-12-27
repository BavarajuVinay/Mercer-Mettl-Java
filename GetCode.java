import java.util.*;
public class GetCode 
{
    public static int getCode(String input1)
    {
        String[] arr = input1.split(" ");
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i].length();
        }
        return 1+(Math.abs(sum)-1)%9;
    }
    public static void main (String[] args) 
    {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int result = getCode(str);
        System.out.println(result);
    }
}