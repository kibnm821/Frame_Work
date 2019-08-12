import java.util.Scanner;

public class If_Example{
    public static void main(String args[]){
        //Scanner scanner = new Scanner(System.in);
        System.out.printf("User Age : ");
        int user = 15;

        if(user < 19){//if
            if(user > 16 && user < 19){
                System.out.printf("You are 17 or 18");
            }else{
                System.out.printf("16 or younger");
            }
        }
    }
}