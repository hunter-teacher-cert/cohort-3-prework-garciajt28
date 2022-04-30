public class Methods {
  public static void main(String[] args){
    boolean result1, result2;
    int result3;

    result1 = isDivisible(5,2);
    if(result1 == true) {
       System.out.println ("n is divisible by m.");
    }
    else {
       System.out.println("n is not divisible by m!");
    }

    result2 = isTriangle(3,4,5);
    if(result2 == true) {
       System.out.println ("It is possible to form a triangle.");
    }
    else {
       System.out.println("It is not possible to form a triangle!");
    }
    

    result3 = ack(3,5);
    System.out.println ("The return value of Ackermann function is " + result3);
    
  } 
  
  public static boolean isDivisible(int n, int m) {
    if (n%m==0) {
      return true;
    }       
    else {
     return false;

    }
  }

  public static boolean isTriangle(int x, int y, int z)
  {
    int sumXY = x + y;
    int sumYZ = y + z;
    int sumXZ = x + z;

    if (x > sumYZ || y > sumXZ || z > sumXY )
    {
      return false;
    }
    else 
    {
      return true;
    }
  }

 public static int ack(int m, int n)
 { 
   int result=0;
   
    if (m == 0)
    {
      result =  n+1;
    }
    else if (m>0 && n == 0) 
    {
      result = ack (m-1,1);
    }
    else if (m>0 && n > 0) 
    {
      int a = m-1;
      int b = n-1;
      result = ack(a, ack(m,b));
    }

   return result;
}   

}
