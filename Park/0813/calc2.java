import java.util.ArrayList;
import java.util.HashMap;

public class calc2{
    private static ArrayList<String> name = new ArrayList<String>();
    private static ArrayList<Integer> num = new ArrayList<Integer>();
    public static void main(String args[]){
        int a=2,b=2;
        calc2 cal = new calc2();

        name.add("Enter : ");//arraylist 추가
        num.add(a);
        num.add(b);

        cal.add(a,b);//계산
        cal.sub(a,b);
        cal.mul(a,b);
        cal.div(a,b);

        cal.print();
    }
    public void add(int i, int j){//함수
        name.add("Addition : ");
        num.add(i+j);
    }
    public void sub(int i, int j){
        name.add("Subtraction : ");
        num.add(i-j);
    }
    public void mul(int i, int j){
        name.add("Multiplication : ");
        num.add(i*j);
    }
    public void div(int i, int j){
        name.add("Division : ");
        num.add(i/j);
    }
    public void print(){//출력
        HashMap<Object,Object> hmap = new HashMap<Object,Object>();//hashmap
        hmap.put("str",name);
        hmap.put("integer",num);

        ArrayList<String> out = new ArrayList<String>();//뽑기
        out = (ArrayList<String>) hmap.get("str");
        ArrayList<Integer> out2 = new ArrayList<Integer>();
        out2 = (ArrayList<Integer>) hmap.get("integer");

        System.out.print(out.get(0));
        System.out.println(out2.get(0) + " " + out2.get(1));
        for(int i = 1; i < out.size(); i++){
            System.out.print(out.get(i));
            System.out.println(out2.get(i+1));
        }
    }
}