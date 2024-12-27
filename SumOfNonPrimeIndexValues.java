import java.util.*;
class SumOfNonPrimeIndexValues 
{
    public static int sumOfNonPrimeIndexValues(int[] input1,int input2)
    {
        int i,sum=0;
        for(i=0;i<input2;i++)
        {
            boolean isPrime = calcIsPrime(i);
            if(!isPrime)
            {
                sum+=input1[i];
            }
        }
        return sum;
	}
    public static boolean calcIsPrime(int n)
    {
        int i,flag=0;
        if(n==0 || n==1)
        {
            return false;
        }
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String strArr[] = str.split(" ");
        int[] arr = new int[strArr.length];
        for(int i=0;i<strArr.length;i++)
        {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int n = read.nextInt();
        int result = sumOfNonPrimeIndexValues(arr,n);
        System.out.println(result);
    }
}