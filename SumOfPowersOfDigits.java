import java.util.*;
class SumOfPowersOfDigits 
{
    public static int sumOfPowersOfDigits(int input1)
    {
		int temp = input1;
        int i,sum = 0;
        int le = Integer.toString(temp).length();
        int arr[] = new int[le];
        for(i=0;temp!=0;i++)
        {
            int r = temp%10;
            arr[i] = r;
            temp/=10;
        }
        for(i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                sum+=Math.pow(arr[i],0);
            }
            else
            {
                sum+=Math.pow(arr[i], arr[i-1]);
            }
        }
        return sum;
    }
    public static void main (String[] args) 
    {
        Scanner read  = new Scanner(System.in);
        int n = read.nextInt();
        int result = sumOfPowersOfDigits(n);
        System.out.println(result);
    }
}