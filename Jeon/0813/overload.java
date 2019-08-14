import java.util.HashMap;

public class overload 
{
    public static void main (String args[])
    {   
        display disover = new display();
        disover.dis("Overloading");
        disover.dis("Overloading",10);
        disover.dis(10);
        

    }
}

/*class display
{
    public void dis (String c)
    {
        System.out.println("One parameter : " + c);
    }
    public void dis (String c , int num)
    {
        System.out.println("Two parameter : " + c + ","+ num);
        
    }
    public void dis (int c) { System.out.println("One parameter : "+c);}
}*/