package question3;

public class Application {
    public static void main(String[] args) {

        ThreadExtend thread1 = new ThreadExtend();
        thread1.start();
        thread1.setName("thread1");

        ThreadExtend thread2 = new ThreadExtend();
        thread2.start();
        thread2.setName("thread2");
    }
}
