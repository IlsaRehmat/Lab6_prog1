import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random r = new Random();
    private ArrayList<String> responses;
    
    public RandomTester(){
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("ask again later");
    }
    
    public String getResponse(){
        return responses.get(r.nextInt(responses.size()));
    }
    
    public void printOneRandom(){
        System.out.println(" new integer:"+ r.nextInt(1000));
    }
    
    public void printMultiRandom(int howMany){
        for (int i = 0; i < howMany; i++){
            System.out.println(" new integer:"+ r.nextInt(1000));
        }
    }
    
    public int throwDice(){
        return r.nextInt(6)+1;
    }
    
    public int getRandom(int max){
        return r.nextInt(max)+1;
    }
}
