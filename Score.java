public class Score extends Calculations //make sure that this is a subclass of Calculations and inherits all of the properties of Calculations
{ 
   
   /*Initialize all of the following instance variables 
    You should have 14 private integers with the following names
    onesScore, twosScore, threesScore, foursScore, fivesScore, sixesScore,
    chanceScore, smallStraightScore, largeStraightScore, threeOfAKindScore,
    fourOfAKindScore, fullHouseScore, yahtzeeScore, totalScore
    All of the integers should be set to -1 except totalScore
    totalScore should be set to 0.
    You will also need one more instance variable that is a String named menu*/
    private int onesScore = -1;
    private int twosScore = -1;
    private int threesScore = -1;
    private int foursScore = -1;
    private int fivesScore = -1;
    private int sixesScore = -1;
    private int chanceScore = -1;
    private int smallStraightScore = -1;
    private int largeStraightScore = -1;
    private int threeOfAKindScore = -1;
    private int fourOfAKindScore = -1;
    private int fullHouseScore = -1;
    private int yahtzeeScore = -1;
    private int totalScore = 0;
    public String menu;
    
    public String printMenu()
    {
        /*You should set the variable menu to an empty string.  Then you should create a menu
        that looks like the video of the final product example however the line should only show 
        up if it has not been scored.That is why all of the variables are set to -1 because if 
        they have a score of 0 or above they should not be in the menu.*/
        //This should return the String menu
        menu = "";
        System.out.println("Enter this round on your scoresheet.");
        System.out.println("press 1 to score this on the Ones Category.");
        System.out.println("press 2 to score this on the Twos Category.");
        System.out.println("press 3 to score this on the Threes Category.");
        System.out.println("press 4 to score this on the Fours Category.");
        System.out.println("press 5 to score this on the Fives Category.");
        System.out.println("press 6 to score this on the Sixes Category.");
        System.out.println("press 7 to score this on the Chance Category.");
        System.out.println("press 8 to score this on the Small Straight Category.");
        System.out.println("press 9 to score this on the Large Straight Category.");
        System.out.println("press 10 to score this on the 3 of a Kind Category.");
        System.out.println("press 11 to score this on the 4 of a Kind Category.");
        System.out.println("press 12 to score this on the Full House Category.");
        System.out.println("press 13 to score this on the Yahtzee Category.");
        return menu;
    }   
    public void setOnesScore(int a)
    {
        //This should pass in an integer that sets the score for the onesScore 
        onesScore = a;
        
        
    }
    public void setTwosScore(int a)
    {
        //This should pass in an integer that sets the score for the twosScore
        twosScore = a;
        
    }
    public void setThreesScore(int a)
    {
        //This should pass in an integer that sets the score for the threesScore 
        threesScore = a;
    }
    public void setFoursScore(int a)
    {
        //This should pass in an integer that sets the score for the foursScore
        foursScore = a;
    }
    public void setFivesScore(int a)
    {
        //This should pass in an integer that sets the score for the fivesScore
        fivesScore = a;
    }
    public void setSixesScore(int a)
    {
        //This should pass in an integer that sets the score for the sixesScore
    }
    public void setChanceScore(int a)
    {
        //This should pass in an integer that sets the score for the chanceScore 
        chanceScore = a;
    }
    public void setSmallStraightScore(int a)
    {
        //This should pass in an integer that sets the score for the smallStraightScore
        smallStraightScore = a;
    }
    public void setLargeStraightScore(int a)
    {
        //This should pass in an integer that sets the score for the largeStraightScore
        largeStraightScore = a;
    }
    public void set3OfAKindScore(int a)
    {
        //This should pass in an integer that sets the score for the threeOfAKindScore
        threeOfAKindScore = a;
    }
    public void set4OfAKindScore(int a)
    {
        //This should pass in an integer that sets the score for the fourOfAKindScore
        fourOfAKindScore = a;
    }
    public void setFullHouseScore(int a)
    {
        //This should pass in an integer that sets the score for the fullHouseScore
        fullHouseScore = a;
    }
    public void setYahtzeeScore(int a)
    {
        //This should pass in an integer that sets the score for the yahtzeeScore 
        yahtzeeScore = a;
    }
    
    public int getScore()
    {
        /*This method should set up total score and set it to zero
        it should proceed to check if each score or each variable is
        zero or over and then add it to total score*/
        //This should return the variable totalScore
        totalScore = 0;
        if(onesScore >= 0)
        {
        totalScore += onesScore;
        }
        if(twosScore >= 0)
        {
            totalScore += twosScore;
        }
        if(threesScore >= 0)
        {
            totalScore += threesScore;
        }
        if(foursScore >= 0)
        {
            totalScore += foursScore;
        }
        if(fivesScore >= 0)
        {
            totalScore += fivesScore;
        }
        if(sixesScore >= 0)
        {
            totalScore += sixesScore;
        }
        if(chanceScore >= 0)
        {
            totalScore += chanceScore;
        }
        if(smallStraightScore >= 0)
        {
            totalScore += smallStraightScore;
        }
        if(largeStraightScore >= 0)
        {
            totalScore += largeStraightScore;
        }
        if(threeOfAKindScore >= 0)
        {
            totalScore += threeOfAKindScore;
        }
        if(fourOfAKindScore >= 0)
        {
            totalScore += fourOfAKindScore;
        }
        if(fullHouseScore >= 0)
        {
            totalScore += fullHouseScore;
        }
        if(yahtzeeScore >= 0)
        {
            totalScore += yahtzeeScore;
        }
        return totalScore;
    }
}
