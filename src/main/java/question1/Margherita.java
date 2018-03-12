package question1;

public class Margherita implements Pizza{

    @Override
    public int getCost() {
        return 90;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
