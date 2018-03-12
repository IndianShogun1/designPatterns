package question2;

public class AverageScoreDisplay implements Observer{
    int currentRuns;
    int currentBowls;
    Subject subject;

    AverageScoreDisplay(Subject sub){
        this.subject=sub;
        subject.registerObserver(this);
    }

    @Override
    public void update(int runs, int bowls) {
        currentBowls=bowls;
        currentRuns=runs;

        averageScorePrint();
    }

    public void averageScorePrint(){
        System.out.println("average is :"+currentRuns/currentBowls);
    }

}
