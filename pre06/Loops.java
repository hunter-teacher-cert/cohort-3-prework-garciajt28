public class Loops{
  public static void main(String[] args){
    double result;

    //square root
    int a = 16;
    result = squareRoot(a);
    System.out.println("The approximate squareroot of " + a + " is equals to " + result);
  

  //power
   double x = 3;
   int n = 3;
   result = power(x, n);
   System.out.println("The value of " + x + " to the power of " + n + " is equals to " + result);
  

  //factorial
  int result2;
  n = 4;
  result2 = factorial(n);
  System.out.println("Factorial of " + n + " is equals to " + result2);
}
  
  public static double squareRoot(double a){
    double x0 = a/2;
    double x1, difference;
    double prevValue = a;

    while (true){
      x1 = (x0 + a/x0) / 2;
      //System.out.print("x1: " + x1);
      
      difference = Math.abs(prevValue - x1);
      //System.out.println(" difference: " + difference);
      if (difference < 0.0001)
        break;
      
      prevValue = x1;
      x0 = x1;
    }

    return x1;  
  }

  public static double power(double x, int n){
    double result = x;

    if(n==0){
      return 1;
    }

    while(n > 1){
      result = result * x;
      n = n-1;
    }

    return result;
  }

  public static int factorial(int n){
    int result = n;
    if(n==0){
      return 1;
    }

    while(n>2){
      result = result * (n-1);
      n = n-1;
    }

    return result;
    
  }
  
}