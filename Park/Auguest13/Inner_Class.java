import java.util.ArrayList;

public class Inner_Class{
    public static void main(String args[]){
        ArrayList<Fruits> mFruitList = new ArrayList<Fruits>();
        mFruitList.add(new Fruits("Good Fruits"));
        mFruitList.add(new Fruits("Bad Fruits"));
        System.out.println("fruit : " + mFruitList);

        mFruitList.get(0).setCaption("test");

        System.out.println("Fruit : " + mFruitList.get(0).getCaption());
    }
}