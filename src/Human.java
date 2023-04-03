public class Human {
    void run(){
        System.out.println("Human can eat! ");
    }
}
class Ashen extends Human{
    void run(){
        System.out.println("Ashen can eat !");
    }

    public static void main(String[] args) {
        Ashen a = new Ashen();
        a.run();
    }
}
