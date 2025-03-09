import java.util.Arrays;
/**
 * Write a description of class SortingTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingTest
{
    public static void main(String[] args){
        int[] values = {9,3,4,7,1};
        sortAndPrintArray(values);
    }
    
    public static void sortAndPrintArray(int[] array){
        Arrays.sort(array);
        System.out.println("Sorted array;" + Arrays.toString(array));
    }
}
