import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random r;
    private HashMap<String,String> responsesMap;
    
       /**
     * Constructor: Initializes th list and fills it with responses
     */
    public Responder(){
        responses = new ArrayList<>();
        r = new Random();
        responsesMap = new HashMap<>();
        fillResponsesMap();
    }
    
    private void fillResponsesMap(){
        responsesMap.put("slow", "Try restaring your computer");
        responsesMap.put("error", "Check for software update");
        responsesMap.put("frozen", "no way other than reboot");
    }
    
    /**
     * Populates the responses list
     */
    private void fillResponses(){
        responses.add("Have you trid restarting your computer?");
        responses.add("Please check if your software is up to date.");
        responses.add("Try reopening the application");
        responses.add("Make sure the internet connection is stable");
        responses.add("I need more details to help with this problem");
    }
    
    /**
     * Selects and returns a random response
     */
    public String generateResponseOld(){
        int choice = r.nextInt(responses.size());
        return responses.get(choice);
    }
    
    public String generateResponse(String word){
        String answer = responsesMap.get(word);
      if (answer==null){
            pickDefaultResponse();
        }
        return answer;
    }
    
    public String pickDefaultResponse(){
        return "default";
    }
}
