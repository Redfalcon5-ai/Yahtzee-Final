import java.util.*;
public class Dice  //this is the superClass at the top of the heiarchy
{
    // You need to create a new Random object called rand from the Random class.
    //You need 5 ints that are not private that represent each dice called d1,d2,d3,d4,d5
    //You need 5 private instance variables to be used in this class that are temp dice called t1,t2....
    Random rand = new Random();
    public int d1,d2,d3,d4,d5;
    private int t1,t2,t3,t4,t5;
    private int temporaryNum;
    
    public Dice( ) 
    {
        //initialize the 5 dice variables setting them equal to rand.nextInt(6)+1.
        d1 = rand.nextInt(6)+1;
        d2 = rand.nextInt(6)+1;
        d3 = rand.nextInt(6)+1;
        d4 = rand.nextInt(6)+1;
        d5 = rand.nextInt(6)+1;
        
    }
    
    public String rollDice()
    {
        //return a string the has lables the dice and prints their values like this:
        //dice 1: 1 (the one is an example and should just be the value of the die)
        //dice 2: 3 (the three is an example and should just be the value of the die)
        //dice 3: 2 (the two is an example and should just be the value of the die)
        //dice 4: 6 (the six is an example and should just be the value of the die)
        //dice 5: 5 (the fiveis an example and should just be the value of the die)
        //you may need to use escape sequences in your return statement to get the statement to go multiple lines
        
        String a = "dice 1: " + d1 \n +
                   "dice 2: " + d2 \n +
                   "dice 3: " + d3 \n +
                   "dice 4: " + d4 \n +
                   "dice 5: " + d5 ; 
        
        return a;
               
        
    }
    
    public String rollAgain(int a)
    {
        /*This method should pass in an integer 
        and that integer should identify the die to 
        change the value to a random number between 1 and 6*/
        if(a == 1){
            d1 = rand.nextInt(6)+1;
        }
        if(a == 2){
            d2 = rand.nextInt(6)+1;
        }
        if(a == 3){
            d3 = rand.nextInt(6)+1;
        }
        if(a == 4){
            d4 = rand.nextInt(6)+1;
        }
        if(a == 5){
            d5 = rand.nextInt(6)+1;
        }
    }
     
    public String OrderRoll()
    {            
        /* This method should reorder the dice from
        smallest to largest a good tip is to set the
        temporrary dice equal to the actual dice reorder
        the temporrary dice and then set the value of 
        the actual dice back to the value of each 
        temporrar dice.
        Because it is a String Method it should return 
        a String just like rollDice() did.*/
        
        t1 = d1;
        t2 = d2;
        t3 = d3;
        t4 = d4;
        t5 = d5;
        
        
        for (int count = 0; count < 4; count++)
        {
            if ( t2 < t1)
            {
               temporaryNum = t1;
               t1 = t2;
               t2 = temporaryNum;
            }
        
            if ( t3 < t2)
            {
               temporaryNum = t2;
               t2 = t3;
               t3 = temporaryNum;
            }
        
            if ( t4 < t3)
            {
               temporaryNum = t3;
               t3 = t4;
               t4 = temporaryNum;
            }
        
            if ( t5 < t4)
            {
               temporaryNum = t4;
               t4 = t5;
               t5 = temporaryNum;
            }
        }
        
        d1 = t1;
        d2 = t2;
        d3 = t3;
        d4 = t4;
        d5 = t5;
        
        String a = "dice 1: " + d1 \n +
                   "dice 2: " + d2 \n +
                   "dice 3: " + d3 \n +
                   "dice 4: " + d4 \n +
                   "dice 5: " + d5 ; 
        
        return a;
        
    }
    
    public int getD1()
    {
        //return the value of d1
        return d1;
    }
    
    public int getD2()
    {
        //return the value of d2
        return d2;
    }
    
    public int getD3()
    {
        //return the value of d3
        return d3;
    }
    
    public int getD4()
    {
        //return the value of d4
        return d4;
    }
    
    public int getD5()
    {
        //return the value of d5
        return d5;
    }
    
    public String toString()
    {
        String a = "dice 1: " + d1 \n +
                   "dice 2: " + d2 \n +
                   "dice 3: " + d3 \n +
                   "dice 4: " + d4 \n +
                   "dice 5: " + d5 ; 
        
        return a; 
    }
    
}
