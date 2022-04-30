import java.util.Random;
import java.util.Scanner;

public class Craps{
  public static void main(String[] args){
  
    String roundResult = round();
  
    if (roundResult == "craps"){
        System.out.println("The shooter lose!");
    }

    else if (roundResult == "natural7" ||roundResult == "natural11" ){
       System.out.println("The shooter wins!");   
    }

    else if(roundResult == "point"){
      System.out.println("Its a Point!, Shooter continues to shoot (roll) ");     
      while(true){
        roundResult = round();
        if (roundResult == "point" || roundResult == "natural7"){
          break;
        }
        System.out.println("The shooter continues to roll until he gets Point to win or 7 to lose");  
      }
      
      if(roundResult == "point"){
        System.out.println("Its a Point, the shooter wins!");  
      } else if(roundResult == "natural7"){
        System.out.println("Its 7!, the shooter lose!");
      }
    }
  }

  public static int roll(int n) {
    Random random = new Random();
    int randomNumber = random.nextInt(n) + 1;
    return randomNumber;
  }

  public static int shoot(int numDice, int maxValue){
    int result = 0;

    for (int i=0; i<numDice; i++){
       int random = roll(maxValue);
       result = result + random;
    }

    System.out.println("# of Dice: " + numDice + " Dice Max Value: " + maxValue + " Result: " + result);
    return result;
  }

    public static String round() {

    Scanner in = new Scanner(System.in);
    System.out.print("Input number of dice: ");
    int numDice = in.nextInt();
    System.out.print("Input Max value of dice: ");
    int maxValue = in.nextInt();
    
    int result = shoot(numDice,maxValue);

    if (result == 2 || result == 3 || result == 12){
        return "craps";
    }
    else if (result == 7){
       return "natural7";
    }
    else if(result == 11){
      return "natural11";
    }
    else{
      return "point";
    }
  }
}