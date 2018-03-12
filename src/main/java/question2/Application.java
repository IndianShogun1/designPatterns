package question2;

public class Application {
    public static void main(String[] args) {

        CricketApplication subject=new CricketApplication();

        Observer observer1=new CurrentScoreDisplay(subject);
        Observer observer2=new AverageScoreDisplay(subject);
        subject.changedScore(20,100);
    }
}
