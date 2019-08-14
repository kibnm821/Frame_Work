public class forchar{
    public static void main (String args[]) 
    {
        int x,y;
        int num =1;
        for (y=1; y<7; y++)
        {   num = y;
            if (y==1 || y==7){ System.out.println("~ ~ ~ ~ ~");}
            
            for (x=1; x<6;x++)
            {
                if(x==1 || x==5) {System.out.printf("!");}
                else{
                        System.out.printf(num+ " ");
                        num=num+5;
                    }
            }
            System.out.println();
        }
        
        System.out.println("~ ~ ~ ~ ~");
        
    }
}