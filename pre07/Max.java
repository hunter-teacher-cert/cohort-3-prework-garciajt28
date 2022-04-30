import java.util.Arrays;


public class Max {

    public static void main(String[] args) {
      int[] array = {2,3,14,5,6};
      System.out.println(Arrays.toString(array));
      int index = indexOfMax(array);
      System.out.println("The index of the element with max value  = " + index);
    }

    public static int indexOfMax(int[] elements) {  
        int max = Integer.MIN_VALUE;
        int count = 0, index = 0;
        for (int element : elements) {
            if (element > max) {
                max = element;
                index = count;
            }
            count++;
        }
        return index;
    }

}