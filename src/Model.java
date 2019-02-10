import java.util.ArrayList;

public class Model {
    public static final int RAND_MAX = 100;
    public static final int RAND_MIN = 0;
    private int min;
    private int max;
    private int randomlyGuessed;
    private String numberILookFor;
    private ArrayList<Integer> guessesBefore = new ArrayList<Integer>();



    public int rand(int min, int max){
        double rd = Math.floor(Math.random()*(max - min));
        return (int)rd + min;
    }
    public int rand(){
        return rand(0,RAND_MAX);
    }

    public void setRandomlyGuessed(int n){
        this.randomlyGuessed = n;
    }

    public void addToGuessesBefore(int guess){
        guessesBefore.add(guess);
    }

    public boolean numberIsHigher(int guess){
        return randomlyGuessed > guess;
    }

    public boolean iFoundTheNumber(int guess){
        return randomlyGuessed == guess;
    }



    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }

    public void setGuessFeedback(String higherLower){
        numberILookFor = higherLower;
    }



    public int getMinBarrier(){
        return min;
    }

    public int getMaxBarrier(){
        return max;
    }
    public String getPreviosGuesses(){
        return guessesBefore.toString();
    }

    public String getGuessFeedback(){
        return numberILookFor;
    }

    public int getLastGuess(){
        return guessesBefore.get(guessesBefore.size() - 1);
    }
}
