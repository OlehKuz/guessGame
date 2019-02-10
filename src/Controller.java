import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void playGame(){
        model.setRandomlyGuessed(model.rand());
        model.setMin(Model.RAND_MIN);
        model.setMax(Model.RAND_MAX);
        view.printMessage(View.GREETING + Model.RAND_MIN + View.AND + Model.RAND_MAX);
        playUntilGuessed();

    }

    private void playUntilGuessed(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int guess = getIntInRange(sc);
            model.addToGuessesBefore(guess);
            if(model.iFoundTheNumber(guess)){
                congratulate();
                break;
            }
            setNewInterval(guess);
            showGameState();
        }
        sc.close();
    }

    private void setNewInterval(int guess){
        if(model.numberIsHigher(guess)){
            model.setGuessFeedback(View.BIGGER);
            model.setMin(guess);
        }else{
            model.setGuessFeedback(View.SMALLER);
            model.setMax(guess);
        }
    }

    private void congratulate(){
        view.printMessage(View.CONGRATULATE + model.getLastGuess());//TO_DO
        view.printMessage(View.GUESSES_SO_FAR + model.getPreviosGuesses());
    }

    private void showGameState(){
        view.printMessage(View.GUESSES_SO_FAR + model.getPreviosGuesses());
        view.printMessage(View.INTERVAL + model.getMinBarrier() + View.AND + model.getMaxBarrier());
        view.printMessage(View.PREVIOUS_GUESS + model.getLastGuess());
        view.printMessage(model.getGuessFeedback());
    }

    private int getIntInRange(Scanner sc){// TO_DO
        int res=0;
        while( true ) {
            view.printMessage(View.INPUT_INT_DATA);
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.INTERVAL + model.getMinBarrier() + View.AND + model.getMaxBarrier());
                continue ;
            }
            break;
        }
        return res;
    }

}
