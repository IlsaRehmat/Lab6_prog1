/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */

/*
 * Question 2
 * Class declaration: Shows which package it belongs to
 * Constructor summary: Lists available constructors
 * Method summary: List methods with short descriptions
 * Method details: detailed explanations of each method
 * Inherited methods: Methods inherited from parent classes.
 * Other classes start with the same structure.
 * 
 * Question 3
 * There are two versions:
 * 1. boolean startsWith(String prefix)
 * checks if the string starts with the given prefix
 * 2. boolean startsWith(String prefix, int toffset)
 * Checks if the substring  starting from toffset starts with the given prefix
 * 
 * 
 * Question 4
 * The method is endsWith(String suffix)
 * Return type: boolean
 * 
 * Question 5
 * The method is length()
 * It returns the number characters in a string
 * 
 * Question 6
 * Found using JavaDocs
 * Methods are easy to find if you know what to look for
 * 
 * Question 7
 * Signature; public String trim()
 * Removes leading and trailing spaces
 /* 
  /* 
   * Question 10 
   * Found in String documentation
   * Return type:boolean
   * Used to compare two strings
   * 
   * Question 12
   * Found in java.util package
   * Used for generating random numbers
   * 
   * Question 13
   * Random rand = new Random();
   * int randomNumber = rand.nextInt(100);
   * System.out.println(randomNumber);
   * 
   * Question 15
   * Generates a random number from o to 99
   * if you need 1 to 100: rand.nextInt(100)+1
   * 
   * Question 21
   * Found in java.security
   * More secure than Random for cryptographic applications
   * 
   * Question 23
   * -If you add more responses to the ArrayList, the random selection will still work properly because
   * r.nextInt(responses.size()) always picks an index within the available range.
   * -If you remove all responses,it will cause an error( because there's nothing to choose from). 
   * You could prevent this by checking if the list is empty before calling r.nextInt().
   * 
   * 
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            input = input.trim();
            input = input.toLowerCase();
            if(input.equals("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
