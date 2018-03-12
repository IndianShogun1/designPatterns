package question1;

public class Barbeque extends Toppings {

    Barbeque(Pizza pizza){
        super(pizza);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" Barbeque";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 50;
    }
}
