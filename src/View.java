public class View {
    public static final String GREETING = "Computer has guessed a random number between ";
    public static final String INPUT_INT_DATA = "Input your guess as INT value: ";
    public static final String BIGGER = "The number you look for is larger!";
    public static final String SMALLER = "The number you look for is smaller!";
    public static final String GUESSES_SO_FAR = "Your previous guesses: ";
    public static final String INTERVAL = "The number you try to guess lies between ";
    public static final String AND = " and ";
    public static final String PREVIOUS_GUESS = "The number you tried a last time was ";
    public static final String CONGRATULATE = "Congratulations! You have guessed a number ";


    public void printMessage(String message){
        System.out.println(message);
    }
}
