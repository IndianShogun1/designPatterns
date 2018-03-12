package question2;

public class CurrentScoreDisplay implements Observer{
    int currentRuns;
    int currentBowls;
    Subject subject;

    CurrentScoreDisplay(Subject sub){
        this.subject=sub;
        subject.registerObserver(this);
    }

    @Override
    public void update(int runs, int bowls) {
        currentRuns=runs;
        currentBowls=bowls;
        print();
    }


    public void print(){
        System.out.println("Current runs : "+currentRuns +"and current bowls : "+currentBowls );

    }
}
