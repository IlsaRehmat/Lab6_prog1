
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * Question 24
 * Hash Map in Java is a part of the java.util package and is used to store key value pairs
 * A hashMap  uses a hash table to store the keys.
 * It provides a way to store and retrieve data using unique keys
 * 
 * Question 25
 * Methods
 * put, get, containsKey, containsValue, remove, entrySet, keySet, Values
 * 
 * Question 26
 * We can use the size() method.
 * 
 * Question 28
 * The existing value is replaced with the new value
 * 
 * Question 29
 * Both keys and their associated values are stored seperately
 * 
 * Question 30
 * we use a containsKey() method
 * Example
 * System.out.println(map.containsKey("ilsa"));
 * 
 * Question 31
 * The get() method returns null
 * 
 * Question 32
 * We use the keySet() method
 * 
 * Question 34
 * Similarities:
 * Both store elements and allow iteration
 * Both can be modified dynamically
 * Differences:
 * HashSet doesnt allow duplicates, while ArrayLists does
 * HashSet is unordered, while ArrayList maintains insertion order
 * 
 * Question 35
 * It uses a regular expression to split a string
 * Split by space or tab
 * Split by colon(:)
 * 
 * Question 37
 * HashSet: Removes duplicates, unordered
 * ArrayList: Maintains order, allows duplicates
 * 
 * Question 38
 * Extra spaces are treated as seperate elements unless handled properly
 * 
 * Question 40
 * examples of other methods that the Array class provides
 * sort()
 * binarySearch()
 * copyOf()
 * equals()
 * fill()
 * toString()
 * asList()
 * 
 * 
 * 
 * 
 * 
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
