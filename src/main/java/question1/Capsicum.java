package question1;

public class Capsicum extends Toppings {
    Capsicum(Pizza pizza){
        super(pizza);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" Capsicum";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 20;
    }

}
