import java.util.Scanner;

public class try1 {
    public static void main (String args[])
    {

        //Scanner scanner = new Scanner (System.in);
        //System.out.printf("User Age: ");
        int user = 15;//scanner.nextInt();
        if(user< 19)
        {
            if (user >16 && user < 19)
            {System.out.printf("You are 17 or 18");}
            else {System.out.printf("16 or younger");}
        }
    }
}