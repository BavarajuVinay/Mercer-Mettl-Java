import java.util.*;
public class FindKey
{
    public static int findKey(int input1,int input2,int input3)
    {
        int r1 = input1/1000;
        int r2 = (input2/100)%10;
        int[] input = Integer.toString(input3).chars().map(a->a-48).toArray();
        int r3 = Arrays.stream(input).min().getAsInt();
        return r1*r2+r3;
    }
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int n1 = read.nextInt();
		int n2 = read.nextInt();
		int n3 = read.nextInt();
		int result = findKey(n1,n2,n3);
		System.out.println(result);
	}
}