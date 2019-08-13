import java.util.ArrayList;
import java.util.HashMap;

public class Collection_Ex1{
    static ArrayList<Integer> number;
    static ArrayList<Integer> number2;
    public static void main(String args[]){
        ArrayList<String> Name = new ArrayList<String>();//ArrayList Name
        Name.add("Mango");
        Name.add("Apple");
        Name.add("Banana");
        Name.add("Melon");

        ArrayList<Integer> list1 = new ArrayList<Integer>();//ArrayList Mango number
        list1.add(39);
        list1.add(20);
        list1.add(30);
        list1.add(12);
        list1.add(40);

        ArrayList<Integer> list2 = new ArrayList<Integer>();//ArrayList Apple number
        list2.add(48);
        list2.add(20);
        list2.add(10);
        list2.add(32);

        ArrayList<Integer> list3 = new ArrayList<Integer>();//ArrayList Banana number
        list3.add(99);
        list3.add(23);
        list3.add(123);

        ArrayList<Integer> list4 = new ArrayList<Integer>();//ArrayList Melon number
        list4.add(49);
        list4.add(22);
        list4.add(45);
        list4.add(12);

        HashMap<Object,Object> Hmap = new HashMap<Object,Object>();//hashmap 포함
        Hmap.put("str",Name);
        Hmap.put("list1",list1);
        Hmap.put("list2",list2);
        Hmap.put("list3",list3);
        Hmap.put("list4",list4);

        ArrayList<String> Show_Name = new ArrayList<String>();//fruit 이름
        Show_Name = (ArrayList<String>) Hmap.get("str");

        ArrayList<Integer> Show_Number1 = new ArrayList<Integer>();//fruit number
        Show_Number1 = (ArrayList<Integer>) Hmap.get("list1");

        ArrayList<Integer> Show_Number2 = new ArrayList<Integer>();//fruit number
        Show_Number2 = (ArrayList<Integer>) Hmap.get("list2");

        ArrayList<Integer> Show_Number3 = new ArrayList<Integer>();//fruit number
        Show_Number3 = (ArrayList<Integer>) Hmap.get("list3");

        ArrayList<Integer> Show_Number4 = new ArrayList<Integer>();//fruit number
        Show_Number4 = (ArrayList<Integer>) Hmap.get("list4");

        for(int i = 0; i < Show_Name.size(); i++){
            ArrayList<Integer> number22 = number2;
            number22 = chk2(i);
            int num = (int)number22;
            for(int j = 0; j < num; j++){
                number = chk(i);
                System.out.printf(Show_Name.get(i) + " " + number);
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> chk(int i){
        if(i == 0){
            return Show_Number1.get(j);
        }else if(i == 1){
            return Show_Number2.get(j);
        }else if(i == 2){
            return Show_Number3.get(j);
        }else if(i == 3){
            return Show_Number4.get(j);
        }
    }

    public static ArrayList<Integer> chk2(int i){
        if(i == 0){
            return Show_Number1.size();
        }else if(i == 1){
            return Show_Number2.size();
        }else if(i == 2){
            return Show_Number3.size();
        }else if(i == 3){
            return Show_Number4.size();
        }
    }
}