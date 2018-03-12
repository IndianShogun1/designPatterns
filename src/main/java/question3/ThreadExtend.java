package question3;

public class ThreadExtend extends Thread {

    public void run() {
        ReadFile.getInstance().calculate();
    }
}
