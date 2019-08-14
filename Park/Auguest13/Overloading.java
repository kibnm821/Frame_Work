public class Overloading{
    public static void main(String args[]){
        DisplayOverloading displayOverloading = new DisplayOverloading();
        displayOverloading.display("Overloading");
        displayOverloading.display("Overloading", 10);
        displayOverloading.display(10);
    }
}