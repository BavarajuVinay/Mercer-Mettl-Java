import java.util.*;
class SumOfSumsOfDigits
{
    public static int sumOfSumsOfDigits(int input1)
    {
        int sum = 0;
        int len = Integer.toString(input1).length();
        int temp = input1;
        int[] arr = new int[len];
        int i = len-1,j;
        while(temp!=0)
        {
            int r = temp%10;
            arr[i] = r;
            i--;
            temp/=10;
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            {
                sum+=arr[j];
            }
        }
        return sum;
    }
    public static void main (String[] args) 
    {
        Scanner read  = new Scanner(System.in);
        int n = read.nextInt();
        int result = sumOfSumsOfDigits(n);
        System.out.println(result);
    }
}

