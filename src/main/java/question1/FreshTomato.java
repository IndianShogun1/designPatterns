package question1;

public class FreshTomato extends Toppings{
    FreshTomato(Pizza pizza){
        super(pizza);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" Tomato";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 10;
    }
}
