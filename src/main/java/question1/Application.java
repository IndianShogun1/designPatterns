package question1;

public class Application {
    public static void main(String[] args) {
        Pizza myPizza=new Barbeque(new Capsicum(new Margherita()));

        System.out.println("The ingerdients are :");

        System.out.println(myPizza.getDescription());

        System.out.println("FINAL COST IS :");

        System.out.println(myPizza.getCost());
    }
}
