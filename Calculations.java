import java.util.*;
public class Calculations extends Dice
{
    /*Initialize all of the following instance variables
    You need 12 private integers with the following variable names
    ones,twos,threes,fours,fives,sixes,chance,threeKind,fourKind,
    sumAll, sameNum, maxSame, & numSame.
    Set all of those ints to zero
    You need two Strings with the following variable names:
    tempSS and smS (these will be used in identifying a small straight)
    Lastly you will need 4 booleans with the following variable names:
    smStraight, lgStraight, fullHouse, & yahtzee
    Set all of the booleans to false.*/
    private int ones = 0;
    private int twos = 0;
    private int threes = 0;
    private int fours = 0;
    private int fives = 0;
    private int sixes = 0;
    private int chance = 0;
    private int threeKind = 0;
    private int fourKind = 0;
    private int sumAll = 0;
    private int sameNum = 0;
    private int maxSame = 0;
    private int numSame = 0;
    private String tempSS;
    private String smS;
    private boolean smStraight = false;
    private boolean lgStraight = false;
    private boolean fullHouse = false;
    private bolean yahtzee = false;
   
    private int t1 = d1;
    private int t2 = d2;
    private int t3 = d3;
    private int t4 = d4;
    private int t5 = d5;
    
    private String temp1 = Integer.toString(t1);
    private String temp2 = Integer.toString(t2);
    private String temp3 = Integer.toString(t3);
    private String temp4 = Integer.toString(t4);
    private String temp5 = Integer.toString(t5);
    
    private String full = temp1 + temp2 + temp3 + temp4 + temp5;
 
    
    public int countSame()
    {
        /*This method should go through each of the dice, compare
        them to each other and count the number of dice that are the same number
        YOU DO NOT HAVE TO USE AN ARRAY TO DO THIS USE CONCEPTS WE HAVE
        ALREADY LEARNED.*/
        /*This is the method where you will use the variables 
        sameNum (adding the times the same number occures), 
        maxSame(storing the largest number of times 1 number occures multiple times),
        and numSame (the number that appears the most times)
        Think about the coin flip tracker exercise*/
        // return the variable maxSame
        if(d1 == 1) {
            ones++;
        } else if(d1 == 2) {
            twos++;
        } else if(d1 == 3) {
            threes++;
        } else if(d1 == 4) {
            fours++;
        } else if(d1 == 5) {
            fives++;
        } else if(d1 == 6) {
            sixes++;
        }
        if(d2 == 1) {
            ones++;
        } else if(d2 == 2) {
            twos++;
        } else if(d2 == 3) {
            threes++;
        } else if(d2 == 4) {
            fours++;
        } else if(d2 == 5) {
            fives++;
        } else if(d2 == 6) {
            sixes++;
        }
        if(d3 == 1) {
            ones++;
        } else if(d3 == 2) {
            twos++;
        } else if(d3 == 3) {
            threes++;
        } else if(d3 == 4) {
            fours++;
        } else if(d3 == 5) {
            fives++;
        } else if(d3 == 6) {
            sixes++;
        }
        if(d4 == 1) {
            ones++;
        } else if(d4 == 2) {
            twos++;
        } else if(d4 == 3) {
            threes++;
        } else if(d4 == 4) {
            fours++;
        } else if(d4 == 5) {
            fives++;
        } else if(d4 == 6) {
            sixes++;
        }
        if(d5 == 1) {
            ones++;
        } else if(d5 == 2) {
            twos++;
        } else if(d5 == 3) {
            threes++;
        } else if(d5 == 4) {
            fours++;
        } else if(d5 == 5) {
            fives++;
        } else if(d5 == 6) {
            sixes++;
        }
        
        if(ones > twos && ones > threes && ones > fours && ones > fives && ones > sixes) {
            maxSame = ones;
            numSame = 1;
        }
        if(twos > ones && twos > threes && twos > fours && twos > fives && twos > sixes) {
            maxSame = twos;
            numSame = 2;
        }
        if(threes > ones && threes > twos && threes > fours && threes > fives && threes > sixes) {
            maxSame = threes;
            numSame = 3;
        }
        if(fours > ones && fours > twos &&  fours > threes && fours > fives && fours > sixes) {
            maxSame = fours;
            numSame = 4;
        }
        if(fives > ones && fives > twos &&  fives > three && fives > four && fives > sixes) {
            maxSame = fives;
            numSame = 5;
        }
        if(sixes > ones && sixes > twos &&  sixes > three && sixes > four && sixes > fives) {
            maxSame = sixes;
            numSame = 6;
        }
        
        return maxSame;
    }
    
    public int numMaxSame(){
        //this one is short
        //return the variable numSame
        return numSame;
    }
    
    public String StraightChecker()
    {
        /*This method checks all of the dice to see if you can
        make a small straight (4 dice in sequencial order) or
        a large straight (5 dice in sequencial order)
        You should take each of the integer values from each of the dice
        and using the Integer.toString() method you should convert 5 
        dice values to one string that records values from least to greatest 
        and does not repeat any numbers.  So for example if the dice made a 
        full house of 22444 the string would only read 24. if the dice made a 
        Yahtzee then the string would only be 1 character long.  However if 
        the dice read 12334 your string would record 1234. This string will be 
        what you use to check if a straight is true.
         // you will use the variables tempSS and smS in this method
         //you will return the String valuse of smS
        */
        String first = temp1 + temp2 + temp3 + temp4 + temp5;
        String second = "";
        
        if(first.contains("1") == true){
            second = second + '1';
        }
        
        if(first.contains("2") == true){
            second = second + '2';
        }
        
        if(first.contains("3") == true){
            second = second + '3';
        }
        
        if(first.contains("4") == true){
            second = second + '4';
        }
        
        if(first.contains("5") == true){
            second = second + '5';
        }
        
        if(first.contains("6") == true){
            second = second + '6';
        }
        
        smS = second;
        
        return smS;
    
    public boolean SmStraight()
    {   
        /*A Small Straight is 4 consecutive numbers in a row.
        This should use the result of the straight checker 
        and compare it to all of the small straight options
        and if it meets one of those small straight options 
        it should return true for the variable smStraight*/
        if(full.contains("1234")) {
            smStraight = true;
        }
        
        if(full.contains("2345")) {
            smStraight = true;
        }
        
        if(full.contain("3456")) {
            smStraight = true;
        }
        
        return smStraight;
    }
    public boolean LgStraight()
    {
        /*A Large Straight is 5 consecutive numbers in a row
        This should use the result of the straight checker 
        and compare it to all of the Large straight options
        and if it meets one of those Large straight options 
        it should return true for the variable lgStraight*/
        if(full.contains("12345")) {
            lgStraight = true;
        }
        
        if(full.contains("23456")) {
            lgStraight = true;
        }
        
        return lgStraight;
    }
    public boolean FullHouseCheck()
    {
        /*A full house is 2 of a kind and 3 of a kind.  
        You should take the values of the different dice and comparing 
        them to each other in the right order, you should be able to determine
        if the roll is a full house.*/
        //You should return the boolean fullHouse 
        
        
    }
    public boolean Yahtzee()
    {
        /*A yahtzee is 5 of a kind.  
        You should take the values of the different dice and comparing 
        them to each other in the right order, you should be able to determine
        if the roll is a yahtzee.*/
        //You should return the boolean yahtzee
    }
    public int SumAll()
    {
        /*This method should add all of the dice together so that 
        it can return the correct points when the score requires all of 
        the dice to be added up. (chance, 3 of a Kind, 4 of a Kind,)*/
        //return int sumAll.        
    }
    public int getOnes()
    {
        /*The Ones Score will add up the value of only the 1s in your roll
        You should structure this method to check each dice and see if it is a 1, 
        and if it is you should add 1 to the ones variable.*/
        // You should return the int ones
    }
    public int getTwos()
    {
        /*The Twos Score will add up the value of only the 2s in your roll
        You should structure this method to check each dice and see if it is a 2, 
        and if it is you should add 2 to the twos variable.*/
        // You should return the int twos
    }
    public int getThrees()
    {
         /*The Threes Score will add up the value of only the 3s in your roll
        You should structure this method to check each dice and see if it is a 3, 
        and if it is you should add 3 to the threes variable.*/
        // You should return the int threes
    }
    
    public int getFours()
    {
         /*The Fours Score will add up the value of only the 4s in your roll
        You should structure this method to check each dice and see if it is a 4, 
        and if it is you should add 4 to the Fours variable.*/
        // You should return the int Fours
    }
     public int getFives()
    {
        /*The Fives Score will add up the value of only the 5s in your roll
        You should structure this method to check each dice and see if it is a 5, 
        and if it is you should add 5 to the Fives variable.*/
        // You should return the int Fives
    }
    public int getSixes()
    {
       /*The Sixess Score will add up the value of only the 6s in your roll
        You should structure this method to check each dice and see if it is a 6, 
        and if it is you should add 6 to the Sixes variable.*/
        // You should return the int Sixes
    }
    
    public int getChance()
    {
       /*The chance score simply is a one time score that will return
       all of the dice added together.  this is usually used when someone 
       misses going for a larger roll and has used up the socores that are in
       their roll so it simply adds up all of the dice and returns that.  luckly
       you already have this done and you simply need to return sumAll*/
       
    }
    
    public int getThreeKind()
    {   
        /*Three of a kind checks to see if you have 3 of the same number in your roll
        You should use the method you have already created CountSame()
        It should tell you if you have 3 of a kind and if you do you should 
        return sumAll and if you don't and have to use this score it should return
        a zero */
        //Three of a kind should always be true if four of a kind is true and can be
        //used if four of a kind has already been used.
    }
    
    public int getFourKind()
    {   
        /*Four of a kind checks to see if you have 4 of the same number in your roll
        You should use the method you have already created CountSame()
        It should tell you if you have 4 of a kind and if you do you should 
        return sumAll and if you don't and have to use this score it should return
        a zero */
    } 
    public String resetVariables()
    {
        /*This should reset all of your Integers back to 0
        and and your booleans back to false 
        and all of your Strings back to ""*/
        //This should return the String "Next Turn"
        
    }
}
