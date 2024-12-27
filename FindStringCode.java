import java.util.Scanner;
class FindStringCode 
{
    public static int findStringCode(String input1)
    {
        input1 = input1.toLowerCase();
		String[] array = input1.split(" ");
        int i = 0,j = 0;
        String res = "";
        int sum;
        for(i=0;i<array.length;i++)
        {
            sum = 0;
            String str = array[i];
            int le = str.length();
            for(j=0;j<=le/2;j++)
            {
                int p = str.charAt(j);
                int val1 = p-96;
                int val2 = str.charAt(le-j-1)-96;
                if(p>=96 && p<=121)
                {
                    if(le%2==1)
                    {
                        if(j!=le-j-1 && j<le-j-1)
                        {
                            sum+=Math.abs(val1-val2);
                        }
                        else
                        {
                            sum+=val1;
                        }
                    }
                    else
                    {
                        if(j!=le-j-1 && j<le-j-1)
                        {
                            sum+=Math.abs(val1-val2);
                        }
                        else
                        {
                            continue;
                        }
                    }
                }
            }
            res+=sum;
        }
        return Integer.parseInt(res);
	}
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int result = findStringCode(str);
        System.out.println(result);
    }
}