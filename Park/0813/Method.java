public class Method{
    static int globalValue = 20;
    public static void main(String args[]){
        int localValue = 50;
        Method met = new Method();

        System.out.println("before change" + localValue);
        localValue = met.change(500);
        System.out.println("after change" + localValue);
        System.out.println("global " + globalValue);
    }

    public int change(int data){
        int returnValue;
        returnValue = data + 100;
        return returnValue;
    }
}