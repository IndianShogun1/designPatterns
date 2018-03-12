package question1;

public class PeppyPaneer implements Pizza{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Peppy Paneer";
    }
}
