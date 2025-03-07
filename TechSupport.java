
/**
 * Write a description of class TechSupport here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashMap;
public class TechSupport
{
    private HashMap<String,String> responses = new HashMap<>();
    
    public TechSupport(){
        fillResponsesMap();
    }
    
    private void fillResponsesMap(){
        responses.put("slow","Try restarting your computer.");
        responses.put("error","Check for software updates.");
    }
    
    public String generateResponse(String word){
        return responses.getOrDefault(word, "I don't understand");
    }
 
}
