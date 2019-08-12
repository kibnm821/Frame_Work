public class Example1{
    public static void main(String args[]){
        int row,col;
        int total;
        for(row = 0; row < 5; row++){
            for(col = 0; col < 5; col++){
                total =(row+1)+(col*5);
                System.out.print(total+ " ");
            }
            System.out.println();
        }
    }

    public void EX1(){
        int row,col;
        for(row = 0; row < 7; row++){
            for(col = 0; col < 5; col++){
                if(row == 0 || row == 6){
                    System.out.print("~ ");
                }else if(col == 0 || col ==4){
                    System.out.print("! ");
                }else{
                    System.out.print(((row)+(col*5)-5)+ " ");
                }
            }
            System.out.println();
        }
    }
}