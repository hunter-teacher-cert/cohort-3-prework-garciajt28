import java.util.Arrays;
import java.util.Random;

public class Array{
  public static void main(String[] args){
    //power
    double[] a = {1,2,3,4,5};
    System.out.println("powArray Input: " + Arrays.toString(a));
    int n = 2;
    double[] newArray = powArray(a, n);  
    System.out.println("powArray Output: " + Arrays.toString(newArray));
    System.out.println();

    //histogram
    int numValues = 8;
    n = 100;
    int[] array = randomArray(numValues, n);
    System.out.println("histogram input: " + Arrays.toString(array));
    int[] counts = histogram(array, n);
    System.out.println("histogram output: " + Arrays.toString(counts));
  }
  
 /**
     * Returns an array of random integers.
     */
    public static int[] randomArray(int size, int n) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(n);
        }
        return a;
    }

  public static double[] powArray(double[] a, int n){
    double[] result = a;
    for(int i=0; i< a.length; i++){
      result[i] = Math.pow(a[i],n);
    }
    return result;
  }

  public static int[] histogram(int[] scores, int numCounters){
    int[] counts = new int[numCounters];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }

}