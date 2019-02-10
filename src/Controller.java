public class Controller {




    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void playGame(){
        model.setRandomlyGuessed(model.rand());
        view.printMessage(View.GREETING + Model.RAND_MIN + View.AND + Model.RAND_MAX);
        playUntilGuessed();

    }

    private void playUntilGuessed(){
        while(true){
            view.printMessage(View.INPUT_INT_DATA);
            //get user input, game intervals, logic
            showGameState();
        }
    }


    private void showGameState(){
        view.printMessage(View.GUESSES_SO_FAR + model.getPreviosGuesses());
        view.printMessage(View.INTERVAL + model.getMinBarrier() + View.AND + model.getMaxBarrier());
        view.printMessage(View.PREVIOUS_GUESS + model.getLastGuess());
    }

}
