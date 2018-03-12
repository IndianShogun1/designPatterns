package question4;

public class StreetFighter {

    Rollable rollable;
    Jumpable jumpable;

    public Rollable getRollable() {
        return rollable;
    }

    public void setRollable(Rollable rollable) {
        this.rollable = rollable;
    }

    public Jumpable getJumpable() {
        return jumpable;
    }

    public void setJumpable(Jumpable jumpable) {
        this.jumpable = jumpable;
    }

    public void kick() {
        System.out.println("This is kick method.");
    }

    public void punch() {
        System.out.println("This is punch method.");
    }
    public void roll(){
        rollable.roll();
    }
    public void jump(){
        jumpable.jump();
    }
    @Override
    public String toString() {
        return "StreetFighter{" +
                "rollable=" + rollable +
                ", jumpable=" + jumpable +
                '}';
    }
}
