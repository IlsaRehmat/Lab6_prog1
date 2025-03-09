import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> defaultResponses;
    private Random r;
    private HashMap<String,String> responsesMap;
    private String lastResponse = "";
       /**
     * Constructor: Initializes th list and fills it with responses
     */
    public Responder(){
        defaultResponses = new ArrayList<>();
        r = new Random();
        responsesMap = new HashMap<>();
        fillResponsesMap();
        fillDefaultResponses();
    }
    
    private void fillResponsesMap(){
        responsesMap.put("slow", "Try restarting your computer");
        responsesMap.put("error", "Check for software update");
        responsesMap.put("frozen", "no way other than reboot");
        responsesMap.put("crash", "Your system crashed. Try reinstalling.");
        responsesMap.put("network", "Check your router and network settings.");
        responsesMap.put("bug","Try reinstalling the software.");
        responsesMap.put("update","Make sure you have the latest update installed.");
        responsesMap.put("password","Try resetting your password.");
        responsesMap.put("wifi","Check if your Wi-FI router is working properly.");
    }
    
    /**
     * Populates the responses list
     */
    private void fillDefaultResponses(){
        defaultResponses.add("Have you trid restarting your computer?");
        defaultResponses.add("Please check if your software is up to date.");
        defaultResponses.add("Try reopening the application");
        defaultResponses.add("Make sure the internet connection is stable");
        defaultResponses.add("I need more details to help with this problem");
    }
    
    /**
     * Selects and returns a random response
     */
    public String generateResponse(HashSet<String> words){
        for (String word : words){
            String response = responsesMap.get(word);
            if (response != null){
                return response;
            }
        }
        return pickDefaultResponse();
    }
    
    public String pickDefaultResponse(){
        String response;
        do{
            int index = r.nextInt(defaultResponses.size());
            response = defaultResponses.get(index);
        } while (response.equals(lastResponse));
        
        lastResponse = response;
        return response;
    }
}
