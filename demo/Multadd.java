import java.io.*;
import java.util.*;

public class Multadd {
  
  public static double multadd(double a, double b, double c) {
    return a * b + c;
  }

 public static double NegSum(double a, double b, double c) {
    return -multadd(a, b, c) 
  }
    public static void main(String[] args){
      double a =3.7;
      double b =1.0/4.0; double c =2.6;
        System.out.println(multadd(a, b, c));
    }
}