import java.util.*;
class SeriesN 
{
    public static int seriesN(int input1,int input2,int input3,int input4)
    {
        int i,iter = input3;
        for(i=0;i<input4-3;i++)
        {
            if(i%2==0)
            {
                iter+=(input2-input1);
            }
            else
            {
                iter+=(input3-input2);
            }
        }
        return iter;
    }
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        int n3 = read.nextInt();
        int n4 = read.nextInt();
        int result = seriesN(n1,n2,n3,n4);
        System.out.println(result);
    }
}