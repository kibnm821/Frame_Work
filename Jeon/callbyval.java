import java.util.HashMap;

public class callbyval {
    static int global = 20;
    public static void main (String args[])
    {
        int localval = 50;
        System.out.println("before change "+ localval);
        callbyval callval = new callbyval();
        localval =  callval.change(500);
        System.out.println("after change "+ localval);
        System.out.println("global val : "+ global);    
    }
    public int change(int data)
    {
        int reval;
        reval = data +100;
        return reval;
    }
}