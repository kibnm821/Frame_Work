class DisplayOverloading{
    public void display(String c){
        System.out.println("One parameter : " + c);
    }
    public void display(String c, int num){
        System.out.println("Two paraameters Method : " + c + "," + num);
    }
    public void display(int c){
        System.out.println("One parameter : " + c);
    }
}
class Overloading{
    public static void main(String args[]){
        DisplayOverloading displayOverloading = new DisplayOverloading();
        displayOverloading.display("Overloading");
        displayOverloading.display("Overloading", 10);
        displayOverloading.display(10);
    }
}