import com.sun.rowset.internal.Row;

public class for2{
    public static void main (String args[]) 
    {   
        int x =1;
        int y;
        int z;
        for (y = 0; y<5;y++)
        {  for (z= 0; z<5;z++)
            {  
               System.out.printf(x + " ");
               x=x+5;
            }
            System.out.printf("\n");
        }
    }
}