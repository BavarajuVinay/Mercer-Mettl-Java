import java.util.*;
public class MonkeyBananaPeanut
{
    public static int howManyLeft(int n,int k,int j,int m,int p)
    {
        int total = n - ((m/k)+(p/j));
        return total;
    }
    public static void main (String[] args) 
    {
        int n,k,j,m,p;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of monkeys : ");
        n = read.nextInt();
        System.out.print("No of eatable bananas by single monkey : ");
        k = read.nextInt();
        System.out.print("No of eatable peanuts by single monkey : ");
        j = read.nextInt();
        System.out.print("No of available bananas : ");
        m = read.nextInt();
        System.out.print("No of available peanuts : ");
        p = read.nextInt();
        int left = howManyLeft(n,k,j,m,p);
        System.out.println("Total left on the tree is "+left);
    }
}