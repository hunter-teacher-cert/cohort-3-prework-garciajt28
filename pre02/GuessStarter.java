import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class GuessStarter {
    public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);// starter
      int inputNumber;

      
      System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
      
      System.out.print("Type a number: ");
      inputNumber = in.nextInt(); 
      System.out.println("Your guess is: " + inputNumber);

      // pick a random number
      Random random = new Random();
      int randomNumber = random.nextInt(100) + 1;
      System.out.println("The number I was thinking of is: " + randomNumber);

      int off = Math.abs(randomNumber - inputNumber);
      System.out.println("You were off by: " + off);
    }
}