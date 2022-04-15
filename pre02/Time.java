import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
        
      int hour = 11;
      int minute = 17;
      int second = 5;
      int totalSeconds; 
      int totalSecondsInDay;
      int remainingSecondsInDay;
      float percentage;

      int nextHour = 11;
      int nextMinute = 54;
      int nextSecond = 2;
      int totalNextSeconds; 
      int elapsedTimeInSeconds;
      

      totalSeconds = (hour * 3600) + (minute * 60) + second; 
      System.out.println("The total seconds is " + totalSeconds + " secs." );

      totalSecondsInDay = 24 * 3600; //total seconds in day = 24hour * 3600

      remainingSecondsInDay = totalSecondsInDay - totalSeconds;

      System.out.println("The remaining seconds in the day is " + remainingSecondsInDay + " secs." );

      percentage = ((float)totalSeconds/(float)totalSecondsInDay) * 100; 
      System.out.println("The percentage of day has passed is " + percentage + "%." );  

      totalNextSeconds = (nextHour * 3600) + (nextMinute * 60) + nextSecond;
      elapsedTimeInSeconds = totalNextSeconds - totalSeconds;
      
      System.out.println("The total elapsed time after working in this exercise is " + elapsedTimeInSeconds + " secs." );  
      
      
    }
}