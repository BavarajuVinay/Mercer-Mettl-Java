import java.util.*;
class IdentifyPossibleWords
{
    public static String identifyPossibleWords(String input1, String input2)
    {
        String[] arr1 = input1.toLowerCase().split("");
		String[] arr2 = input2.split(":");
        int len = input1.length();
        int targetLen = len-1;
        int i,j,count = 0;
        String res = "";
        for(i=0;i<arr2.length;i++)
        {
            count = 0;
            String str = arr2[i].toLowerCase();
            String[] strArr = str.split("");
            if(len!=str.length())
            {
                continue;
            }
            else
            {
                for(j=0;j<strArr.length;j++)
                {
                    if(arr1[j].equals(strArr[j]))
                    {
                        count+=1;
                    }
                }
                if(count==targetLen)
                {
                    res+=str.toUpperCase()+":";
                }
            }
        }
        if(res.length()==0)
        {
            return "ERROR-009";
        }
        else
        {
            String result = res.substring(0,res.length()-1);
            return result;
        }
    }
    public static void main (String[] args) 
    {
        Scanner read  = new Scanner(System.in);
        String str1 = read.next();
        String str2 = read.next();
        String result = identifyPossibleWords(str1, str2);
        System.out.println(result);
    }
}

