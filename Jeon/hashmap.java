import java.util.HashMap;

public class hashmap {
    public static void main (String args[])
    {
        HashMap <Integer, String> hmap = new HashMap<Integer , String>();
        hmap.put(12,"Chaitanya");
        hmap.put(2,"Rahul");
        hmap.put(7,"Singh");
        hmap.put(49,"Ajeet");
        hmap.put(3,"Anuj");

        for (Integer key : hmap.keySet() )
        {
            System.out.println("key : "+key +"&Value : " + hmap.get(key));
        }
    }
}