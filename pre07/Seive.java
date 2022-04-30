import java.util.Arrays;

public class Seive {

    public static void main(String[] args) {
      int n=20;
      boolean[] primeIndeces = sieve(n);
      System.out.println(Arrays.toString(primeIndeces));
    }

    public static boolean[] sieve(int n) {
      boolean[] primeArray = new boolean[n];
      for(int i = 2; i < n-1; i++){
        if(isPrimeNumber(i)){
          primeArray[i] = true;
        }
        else{
          primeArray[i] = false;
        }
      }
      return primeArray;
    }

  public static boolean isPrimeNumber(int num){
    boolean flag = true;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
 
}