public class Model {
    private int min;
    private int max;
    private int guessed;


    public int rand(int min, int max){
        double rd = Math.floor(Math.random()*(max - min));
        return (int)rd + min;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }
    
}
