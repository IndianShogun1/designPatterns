package question1;

public class Jalapeno extends Toppings {
    Jalapeno(Pizza pizza){
        super(pizza);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" Jalapano";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 40;
    }
}
