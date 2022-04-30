import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double celcius;
      double farhenheit;
      System.out.print("Input Celcius: ");
      celcius = in.nextDouble();
      farhenheit = celcius * ((double) 9/5) + 32;
      System.out.printf("%.1f C = %.1f F\n", celcius, farhenheit);
    }
}