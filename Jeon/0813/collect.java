import java.util.ArrayList;
import java.util.HashMap;

public class collect {
    public static void main (String args[])
    {
        ArrayList<String> list1 = new ArrayList<String>(); 
        list1.add("Mango"); 
        list1.add("Apple"); 
        list1.add("Banana"); 
        list1.add("Melon"); 
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(39); 
        list2.add(20); 
        list2.add(30); 
        list2.add(12);
        list2.add(40);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(48); 
        list3.add(20); 
        list3.add(10); 
        list3.add(32);        
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(99); 
        list4.add(23); 
        list4.add(123); 
        ArrayList<Integer> list5 = new ArrayList<Integer>();
        list5.add(49); 
        list5.add(22); 
        list5.add(45); 
        list5.add(12);
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("name",list1);  hmap.put("Mango",list2); hmap.put("Apple",list3); hmap.put("Banana",list4); hmap.put("Melon",list5);
        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
         outlist01 = (ArrayList<Integer>) hmap.get("name");
        ArrayList<Integer> outlist02 = new ArrayList<Integer>();
         outlist02 = (ArrayList<Integer>) hmap.get("name");
        for (int i = 0; i < outlist01.size(); i++) 
        {
            ArrayList<Integer> outlist = new ArrayList<Integer>();
            outlist = (ArrayList<Integer>) hmap.get(outlist01.get(i));
            System.out.printf(outlist01.get(i)+" : ");
            for (int a = 0; a < list.size(); a++) 
            {
                
                outlist02 = (ArrayList<Integer>) hmap.get("val"); 
                System.out.printf(outlist02.get(a)+",");
            }
            System.out.println();   
        }
        
    }
}