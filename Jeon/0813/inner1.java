import java.util.ArrayList;
import java.util.HashMap;
import com.woong.inner2;
public class inner1 
{
    public static void main (String args[])
    {   
        ArrayList<inner2> list = new ArrayList<inner2>();
        list.add(new inner2("Good Fruits"));
        list.add(new inner2("Bad Fruits"));        
        for(inner2 t : list){System.out.println("fruit : "+ list);}
    }
}