import java.util.*;
class MoveRobot 
{
    public static String moveRobot(int input1, int input2, String input3, String input4)
    {
        String arr[] = input4.split(" ");
        int i;
        String directions[] = {"N","E","S","W"}; 
        String direc = "NESW";
        String current[] = input3.split("-");
        char face = current[current.length-1].charAt(0);
        int x = Integer.parseInt(current[0]), y = Integer.parseInt(current[1]);
        int max_x = input1, max_y = input2;
        String move = "";
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].equals("R"))
            {
                face = directions[(direc.indexOf(face)+1)%4].charAt(0);
            }
            else if(arr[i].equals("L"))
            {
                if(i-1<0)
                {
                    face = directions[3+direc.indexOf(face)].charAt(0);
                }
                else
                {
                    face = directions[direc.indexOf(face)-1].charAt(0);
                }
            }
            else if(arr[i].equals("M"))
            {
                if(Character.toString(face).equals("N") || Character.toString(face).equals("S"))
                {
                    if(y+1>=0 && y+1<=max_y)
                    {
                        y = Character.toString(face).equals("N")?y+1:y-1; 
                    }
                    else 
                    {
                        move = ""+x+"-"+y+"-"+face+"-ER";
                        return move;
                    }
                }
                if(Character.toString(face).equals("E") || Character.toString(face).equals("W"))
                {
                    if(x+1>=0 && x+1<=max_x)
                    {
                        x = Character.toString(face).equals("E")?x+1:x-1; 
                    }
                    else
                    {
                        move = ""+x+"-"+y+"-"+face+"-ER";
                        return move;
                    }
                }
            }
            else 
            {
                move = ""+x+"-"+y+"-"+face+"-ER";
                return move;
            }
        }
        move = ""+x+"-"+y+"-"+face;
        return move;
    }
    public static void main (String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        String s1 = read.next();
        read.nextLine();
        String s2 = read.nextLine();     
        String result = moveRobot(x,y,s1,s2);
        System.out.println(result);
    }
}

