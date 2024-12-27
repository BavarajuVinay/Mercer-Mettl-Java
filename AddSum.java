import java.util.*;
class AddSub 
{
    public static int addSub(int input1,int input2)
    {
        if(input2==1)
        {
            return input1%2==0?input1/2:input1/2+1;
        }
        else
        {
            return input1+input1/2;
        }
    }
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        int result = addSub(n1,n2);
        System.out.println(result);
    }
}