import java.util.ArrayList;

public class Model {
    public static final int RAND_MAX = 100;
    private int min;
    private int max;
    private int guessed;
    private ArrayList<Integer> guessesBefore = new ArrayList<Integer>();



    public int rand(int min, int max){
        double rd = Math.floor(Math.random()*(max - min));
        return (int)rd + min;
    }
    public int rand(){
        return rand(0,RAND_MAX);
    }

    public void addToGuesses(int guess){
        guessesBefore.add(guess);
    }

    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }

    public String toString(){
        return guessesBefore.toString();
    }
}
