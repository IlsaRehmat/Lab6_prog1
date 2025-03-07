
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * Question 1
 * Hash Map in Java is a part of the java.util package and is used to store key value pairs
 * A hashMap  uses a hash table to store the keys.
 * It provides a way to store and retrieve data using unique keys
 * 
 * Question 2
 * Methods
 * put, get, containsKey, containsValue, remove, entrySet, keySet, Values
 * 
 * Question 3
 * We can use the size() method.
 * 
 * Question 5
 * The existing value is replaced with the new value
 * 
 * Question 6
 * Both keys and their associated values are stored seperately
 * 
 * Question 7
 * we use a containsKey() method
 * Example
 * System.out.println(map.containsKey("ilsa"));
 * 
 * Question 8
 * The get() method returns null
 * 
 * Question 9
 * We use the keySet() method
 * 
 */
import java.util.HashMap;
public class MapTester
{
    private HashMap<String,String> phoneBook = new HashMap<>();
    
    public void enterNumber(String name, String number){
        phoneBook.put(name,number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
}
