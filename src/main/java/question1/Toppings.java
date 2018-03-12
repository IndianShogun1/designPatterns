package question1;

public abstract class Toppings implements Pizza {
    Pizza tempPizza;

    Toppings(Pizza pizza){
        tempPizza=pizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
}
