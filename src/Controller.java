public class Controller {
    public static final String BIGGER = "The number you look for is larger.";
    public static final String SMALLER = "The number you look for is smaller.";

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void playGame(){
        System.out.println(model.getPreviosGuesses());
    }
}
