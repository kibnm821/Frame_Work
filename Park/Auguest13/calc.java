public class calc{
    public static void main(String args[]){
        int a=2,b=2;

        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Print print = new Print();

        print.print(a,b,add.add(a,b),sub.sub(a,b),mul.mul(a,b),div.div(a,b));
    }
}
class Add{
    public int add(int i, int j){
        return i + j;
    }
}
class Sub{
    public int sub(int i, int j){
        return i - j;
    }
}
class Mul{
    public int mul(int i, int j){
        return i * j;
    }
}
class Div{
    public int div(int i, int j){
        return i / j;
    }
}
class Print{
    public void print(int a,int b,int i,int j,int k,int l){
        System.out.println("Enter : " + a + " " + b);
        System.out.println("Addition : " + i);
        System.out.println("Subtraction : " + j);
        System.out.println("Multiplication : " + k);
        System.out.println("Division : " + l);
    }
}