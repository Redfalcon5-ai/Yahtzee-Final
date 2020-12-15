import java.util.*;
public class Yahtzee
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Player player1 = new Player(name);
        String firstRoll;
        String orderRoll;
        int turnNum = 0;
        for (int j = 0; j<13;j++)
        {
            turnNum++;
            System.out.println(name+"'s Turn # "+turnNum);
        
            firstRoll=player1.rollDice();
        
            orderRoll=player1.OrderRoll();
            System.out.println(orderRoll);
        
            String roll="";
        
            for(int l = 0;l<2;l++)
            {
                System.out.println("Which dice would you like to roll again?(Type all numbers you would like to change 1 - 5)");
                roll = scan.nextLine();
                for(int i = 0;i < roll.length();i++)
                {
                    String cur = roll.substring(i,i+1);
                    int newRoll = Integer.valueOf(cur);
                    player1.rollAgain(newRoll);
                }
                orderRoll=player1.OrderRoll();
                System.out.println(player1);
            }
            
            System.out.println("\n\n");
        
            int same = player1.countSame();
            
            int sumAll = player1.SumAll();
            
            boolean smSt;
            boolean lgSt;
            boolean fh;
            boolean yahtzee;
            int ones=player1.getOnes();
            int twos=player1.getTwos();
            int threes=player1.getThrees();
            int fours=player1.getFours();
            int fives=player1.getFives();
            int sixes=player1.getSixes();
            int chance = player1.getChance();
            int threeKind = player1.getThreeKind();
            int fourKind = player1.getFourKind();
            int fullHouse=0;
            int smallSt = 0;
            int largeSt = 0;
            int yaht=0;
            
            String stChecker=player1.StraightChecker();
            System.out.println("Straight Checker: "+stChecker);
            smSt=player1.SmStraight();
            lgSt=player1.LgStraight();
            fh=player1.FullHouseCheck();
            yahtzee=player1.Yahtzee();
        
            System.out.println("Small Straight: "+smSt);
            System.out.println("Large Straight: "+lgSt);
            System.out.println("Full House: "+ fh);
            System.out.println("Yahtzee: "+yahtzee);
            System.out.println("Ones : "+ones);
            System.out.println("Twos: "+twos);
            System.out.println("Threes: "+ threes);
            System.out.println("Fours : "+fours);
            System.out.println("Fives: "+fives);
            System.out.println("Sixes: "+ sixes);
            System.out.println("Chance: "+chance);
            System.out.println("3 of a Kind: "+threeKind);
            System.out.println("4 of a Kind: "+fourKind);
        
            System.out.println();
        
            System.out.println(player1.printMenu());
        
            System.out.println("Enter a Score");
            int setScore = scan.nextInt();
            switch(setScore)
            {
                case 1:
                    player1.setOnesScore(ones);
                    break;
                case 2:
                    player1.setTwosScore(twos);
                    break;
                case 3:
                    player1.setThreesScore(threes);
                    break;
                case 4:
                    player1.setFoursScore(fours);
                    break;
                case 5:
                    player1.setFivesScore(fives);
                    break;
                case 6:
                    player1.setSixesScore(sixes);
                    break;
                case 7:
                    player1.setChanceScore(chance);
                    break;
                case 8:
                    if (smSt==true)
                    {
                        smallSt=30;
                    }
                    player1.setSmallStraightScore(smallSt);
                    break;
                case 9:
                    if (lgSt==true)
                    {
                        largeSt=40;
                    }
                    player1.setLargeStraightScore(largeSt);
                    break;
                case 10:
                    player1.set3OfAKindScore(threeKind);
                    break;
                case 11:
                    player1.set4OfAKindScore(fourKind);
                    break;
                case 12:
                    if (fh==true)
                    {
                        fullHouse=25;
                    }
                    player1.setFullHouseScore(fullHouse);
                    break;
                case 13:
                    if (yahtzee=true)
                    {
                        yaht=50;
                    }
                    player1.setYahtzeeScore(yaht);
                    break;
                default:
                    System.out.println("You should have chosen a valid option you lose your points for that round.");
                    break;        
            }
        
            roll=scan.nextLine();
            System.out.println("Your score is: "+player1.getScore());
            String nextTurn = player1.resetVariables();
            System.out.println(); 
        }
    }
}
