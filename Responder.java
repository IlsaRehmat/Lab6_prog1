import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    
    /**
     * Construct a Responder-initialize the response list
     */
    public Responder(){
    }
    
    /**
     * Generate a random response
     * @return A string that should be displayed as the response
     */
    public String generateResponse(){
        return " That sounds interesting. Tell me more...";
    }
}
