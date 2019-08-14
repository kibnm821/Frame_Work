import java.util.HashMap;

public class over {
    static int a= 2;
    static int b= 2;
    public static void main (String args[])
    {   

    }
    public static int add (int num1, int num2)
    {return a+b;}
    public static int sub (int num1, int num2)
    {return a-b;}
    public static int mul (int num1, int num2)
    {return a*b;}
    public static int div (int num1, int num2)
    {return a/b;}
    public static void cal (int num1, int num2)
    {   
        System.out.println("Add : "+ add(a,b));
        System.out.println("Sub : "+ sub(a,b));
        System.out.println("Mul : "+ mul(a,b));
        System.out.println("Div : "+ div(a,b));
    }
}