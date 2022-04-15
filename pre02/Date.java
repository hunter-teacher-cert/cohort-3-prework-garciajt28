import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
        int day = 16;
        String dayWeek = "Thursday";
        String month = "July"; 
        int year = 2015;
         

        System.out.println("American format:");
        
        System.out.println(dayWeek + ", " +  month + " "+ day + ", " + year+ ".");
    

        System.out.println("European format:");
        
        System.out.println(dayWeek + " " + day + " " +  month + " " + year );
    }
}