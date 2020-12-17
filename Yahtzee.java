import java.util.*; //Imports utilities such as Scanner and Random.
public class Yahtzee //Class name set as Yahtzee that contains all the methods.
{
    public static void main(String[] args) //Java main method.
    {
        Scanner scan = new Scanner(System.in); //Scanner setup to take input as System.in.
        System.out.println("What is your name?"); //Prints out to the user "What is your name?"
        String name = scan.nextLine(); //Scanner initialized by user input and stored as a string called "name".
        Player player1 = new Player(name); //Initialize player to take in input.
        String firstRoll; //String initialized as "firstRoll".
        String orderRoll; //String initialized as "orderRoll".
        int turnNum = 0; //Variable type int initialized to 0.
        for (int j = 0; j<13;j++) //For loops that repeats the loop 13 times.
        {
            turnNum++; //Adds one to every loop onto turnNum int.
            System.out.println(name+"'s Turn # "+turnNum); //Prints to the screen the name and the turn number.
        
            firstRoll=player1.rollDice(); //First roll from rollDice method.
        
            orderRoll=player1.OrderRoll(); //Roll occurs sequentially.
            System.out.println(orderRoll); //Prints out the roll selection.
        
            String roll=""; //Sets the string "roll" set to "".
        
            for(int l = 0;l<2;l++) //For loop that only runs once.
            {
                System.out.println("Which dice would you like to roll again?(Type all numbers you would like to change 1 - 5)"); //Prints to the screen whether the user wants to roll again and also choose a number between 1 through 5.
                roll = scan.nextLine(); //Option selected is taken into the scanner.
                for(int i = 0;i < roll.length();i++) //For loop runs depending on the roll.lenght in comparison to i. 
                {
                    String cur = roll.substring(i,i+1); //The String named cur is equal to roll.substring in the loop as it increases by 1.
                    int newRoll = Integer.valueOf(cur); //The int newRoll takes on the value of the int cur.
                    player1.rollAgain(newRoll); //Player 1 roll again method is considered as newRoll.
                }
                orderRoll=player1.OrderRoll(); //orderRole takes use of player1.OrderRoll to finish the loop.
                System.out.println(player1); //Prints to the user the values of player1.
            }
            
            System.out.println("\n\n"); //Prints to users screen the linebreak
        
            int same = player1.countSame(); //The int same is initialized to be equal to the value of player1.countSame.
            
            int sumAll = player1.SumAll(); //The int sumAll is initialized to player1.SumAll
            
            boolean smSt; //The boolean smSt is initialized.
            boolean lgSt; //The boolean lgSt is initialized.
            boolean fh; //The boolean fh is initialized.
            boolean yahtzee; //The boolean yah is initialized.
            int ones=player1.getOnes(); //The int ones is initialized to the value of player1.getOnes.
            int twos=player1.getTwos(); //The int twos is initialized to the value of player1.getTwos.
            int threes=player1.getThrees(); //The int threes is initialized to the values of player1.getThrees.
            int fours=player1.getFours(); //The int fours is initialized to the value of player1
            int fives=player1.getFives(); //The int fives is initialized to the value of player1.getFives.
            int sixes=player1.getSixes(); //The int sixes is initialized to the value of player1.getSixes.
            int chance = player1.getChance(); //The int chance is initialized to the value of player1.getChance.
            int threeKind = player1.getThreeKind(); //The int threeKind is initialized to the value of player1.getThreeKind.
            int fourKind = player1.getFourKind(); //The int fourKind is initialized to the value of player1.getFourKind.
            int fullHouse=0; //The int fullHouse is initialized to a value of 0.
            int smallSt = 0; //The int smallSt is initialized to a value of 0 too.
            int largeSt = 0; //The int largeSt is initialized to a value of 0.
            int yaht=0; //The int yaht is initialized to the value of 0.
            
            String stChecker=player1.StraightChecker(); //The String "stChecker" is set equal to the value of player1/StraightChecker.
            System.out.println("Straight Checker: "+stChecker); //Prints "Straight Checker" and the value stChecker to the user.
            smSt=player1.SmStraight(); //The boolean smSt is set equal to the value of player1.SmStraight.
            lgSt=player1.LgStraight(); //The boolean lgSt is set equal to the value of player1.LgStraight.
            fh=player1.FullHouseCheck(); //The boolean fh is set equal to the value of player1.FullHouseCheck.
            yahtzee=player1.Yahtzee(); //The boolean yahtzee is set equal to the value of player1.Yahtzee.
        
            System.out.println("Small Straight: "+smSt); //Prints out to the user "Small Straight" and then the value of smSt.
            System.out.println("Large Straight: "+lgSt); //Prints out to the user "Large Straight" and then the value of lgSt.
            System.out.println("Full House: "+ fh); //Prints out to the user "Full House" and then the value of fh.
            System.out.println("Yahtzee: "+yahtzee); //Prints out to the user "Yahtzee" and then the value of yahtzee.
            System.out.println("Ones : "+ones); //Prints out to the user "Ones" and then the value of ones.
            System.out.println("Twos: "+twos); //Prints out to the user "Twos" and then the value of twos.
            System.out.println("Threes: "+ threes); //Prints out to the user "Threes" and the value of threes.
            System.out.println("Fours : "+fours); //Prints out to the user "Fours" and then the value of Fours.
            System.out.println("Fives: "+fives); //Prints out to the user "Fives" and then the value of fives.
            System.out.println("Sixes: "+ sixes); //Prints out to the user "Sixes" and then the value of sixes.
            System.out.println("Chance: "+chance); //Prints out to the user "Chance" and then the value of chance.
            System.out.println("3 of a Kind: "+threeKind); //Prints out to the user "3 of a Kind" and then the value of threeKind. 
            System.out.println("4 of a Kind: "+fourKind); //Prints out to the user "4 of a Kind" and the the value of fourKind.
        
            System.out.println(); //Adds a line break by printing an empty line. 
        
            System.out.println(player1.printMenu()); //Prints out to the user the value of player1.printMenu.
        
            System.out.println("Enter a Score"); //Prints out to the user "Enter a score";
            int setScore = scan.nextInt(); //Scanner object takes in user input.
            switch(setScore) //setScore is set as a switch to allow comparison of values of each induvidual value.
            {
                case 1: //Set for case 1
                    player1.setOnesScore(ones); //case 1 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 2: //Set for case 2
                    player1.setTwosScore(twos); //case 2 takes the results of player1.setTwosScoreScore.
                    break; //Break to end case.
                case 3: //Set for case 3
                    player1.setThreesScore(threes); //case 3 takes the results of player1.setThreesScore.
                    break; //Break to end case.
                case 4: //Set for case 4
                    player1.setFoursScore(fours); //case 4 takes the results of player1.setFoursScore.
                    break; //Break to end case.
                case 5: //Set for case 5
                    player1.setFivesScore(fives); //case 5 takes the results of player1.setFivesScore.
                    break; //Break to end case.
                case 6: //Set for case 6
                    player1.setSixesScore(sixes); //case 6 takes the results of player1.setSixesScore.
                    break; //Break to end case.
                case 7: //Set for case 7
                    player1.setChanceScore(chance); //case 7 takes the results of player1.setChanceScore.
                    break; //Break to end case.
                case 8: //Set for case 8
                    if (smSt==true) //If statement with boolean logic setup.
                    {
                        smallSt=30; //Boolean true if smallSt is equal to the value of 30.
                    }
                    player1.setSmallStraightScore(smallSt); //case 8 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 9: //Set for case 9
                    if (lgSt==true) //If statement with boolean logic setup.
                    {
                        largeSt=40; //Boolean true if largeSt is equal to the value of 40.
                    }
                    player1.setLargeStraightScore(largeSt); //case 9 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 10: //Set for case 10
                    player1.set3OfAKindScore(threeKind); //case 10 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 11: //Set for case 11
                    player1.set4OfAKindScore(fourKind); //case 11 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 12: //Set for case 12
                    if (fh==true) //If statement with boolean logic setup.
                    {
                        fullHouse=25; //Boolean true if fullHouse is equal to the value of 25.
                    }
                    player1.setFullHouseScore(fullHouse); //case 12 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                case 13: //Set for case 13
                    if (yahtzee=true) //If statement with boolean logic setup.
                    {
                        yaht=50; //Boolean true if yaht is equal to the value of 50.
                    }
                    player1.setYahtzeeScore(yaht); //case 13 takes the results of player1.setOnesScore.
                    break; //Break to end case.
                default: //Keyword set to access any modifiers.
                    System.out.println("You should have chosen a valid option you lose your points for that round.");
                    break; //Break to end case.        
            }
        
            roll=scan.nextLine(); //Value created by roll is taken by the user input.
            System.out.println("Your score is: "+player1.getScore()); //Prints to the user "Your score is: " and adds the users value at the end as player1.getScore.
            String nextTurn = player1.resetVariables(); //The String nextTurn is set equal to the value of player1.resetVariables.
            System.out.println(); //Prints a blank line at the end.
        } 
    }
}
