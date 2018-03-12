package question2;

import java.util.ArrayList;

public class CricketApplication implements Subject{
    private int runs;
    private int bowls;

    private ArrayList<Observer> observerArrayList;

    CricketApplication(){
        observerArrayList=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerArrayList.remove(o);
    }


    @Override
    public void notifyAllObserver() {
        for(Observer observer:observerArrayList){
            observer.update(runs,bowls);
        }
    }

    public void updateScore(){
        notifyAllObserver();
    }

    public void changedScore(int b,int r){
        runs=r;
        bowls=b;
        updateScore();

    }
}
