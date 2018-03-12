package question1;

public class Paneer extends Toppings {
    Paneer(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() +"Fresh Paneer";
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 50;
    }
}
