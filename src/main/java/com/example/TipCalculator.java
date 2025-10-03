package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double totaltip = (percent / 100.0) * cost;
        double totalcost = cost + totaltip;
        double beforetip = cost / people;
        double tipPerPerson = totaltip / people;
        double totalcostPerson = (totalcost / people);
        
        
         String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(totaltip * 100.0)/100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(totalcost*100.0)/100.0 + "\n" +
                       "Per person cost before tip: $" + Math.round(beforetip * 100.0)/100.0 + "\n" +
                       "Tip per person: $" + Math.round(tipPerPerson * 100.0)/100.0 + "\n" +
                       "Total cost per person: $" + Math.round(totalcostPerson*100.0)/100.0 + "\n" +
                       "-------------------------------\n";


        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        
        
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
                //DO NOT DELETE ANY OF THE CODE BELOW      
        double totaltip = (percent / 100.0) * cost;
        double totalcost = cost + totaltip;
        double beforetip = cost / people;
        double tipPerPerson = totaltip / people;
        double totalcostPerson = (totalcost / people);
        
        
         String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(totaltip * 100.0)/100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(totalcost*100.0)/100.0 + "\n" +
                       "Per person cost before tip: $" + Math.round(beforetip * 100.0)/100.0 + "\n" +
                       "Tip per person: $" + Math.round(tipPerPerson * 100.0)/100.0 + "\n" +
                       "Total cost per person: $" + Math.round(totalcostPerson*100.0)/100.0 + "\n" +
                       "-------------------------------\n" +
                       "Items ordered:\n";
                       



        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        Scanner scan = new Scanner(System.in);
        String item = "";

        while (!item.equals("-1")) {
            System.out.println("Enter an item name or type '-1' to finish:");
            //System.out.print("");
            item = scan.nextLine();
            if (!item.equals("-1")) {
                result += item + "\n";
            }
            
    
        }
        result += "-------------------------------\n";
        
        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=6; 
        int percent=25;
        double cost=52.27;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
