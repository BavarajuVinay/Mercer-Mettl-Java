import java.util.*;
import java.lang.Math;
public class TicketFare
{
    public static int getFare(ArrayList<String> busstops,ArrayList<Integer> path, String source, String destination)
    {
        int totalDistance = 0;
        int sourceIndex = -1,destinationIndex=-1;
        for(int i=0;i<busstops.size();i++)
        {
            if(busstops.get(i).equals(source))
            {
                sourceIndex = i+1;
            }
            if(busstops.get(i).equals(destination))
            {
                destinationIndex = i;
            }
        }
        if(sourceIndex<destinationIndex)
        {
            for(int i=sourceIndex;i<=destinationIndex;i++)
            {
                totalDistance+=path.get(i);
            }
        }
        if(destinationIndex<sourceIndex)
        {
            for(int i=sourceIndex;i<busstops.size();i++)
            {
                totalDistance+=path.get(i);
            }
            for(int i=0;i<=destinationIndex;i++)
            {
                totalDistance+=path.get(i);
            }
        }
        return totalDistance;
    }
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int i,n;
        System.out.print("Enter the no of stations : ");
        n = read.nextInt();
        ArrayList<String> busstops = new ArrayList<String>();
        System.out.println("Enter the busstops");
        for(i=0;i<n;i++)
        {
            String str = read.next();
            busstops.add(str);
        }
        System.out.println("Enter the path");
        ArrayList<Integer> path = new ArrayList<Integer>();
        for(i=0;i<n;i++)
        {
            int stop = read.nextInt();
            path.add(stop);
        }
        System.out.print("Enter the source busstop : ");
        String source = read.next();
        System.out.print("Enter the destination busstop : ");
        String destination = read.next();
        int result = getFare(busstops,path,source,destination);
        System.out.println("Total ticket fare "+Math.round(result*0.005));
    }
}