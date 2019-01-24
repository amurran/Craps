/**
* Craps.java
* @author Aisling Murran
* @version 01/23/19
*/

import java.util.*;

public class Craps
{
  boolean play = true;
  Scanner in = new Scanner(System.in);
  Dice dice = new Dice();
  int sum = 0;
  boolean round = true;
  boolean firstRound = true;
  int point = 0;

  public Craps()
  {
    System.out.println("Craps is a game in which you roll two dice. If the sum of those dice adds up to 7, you win. If they add up to 12, 3 or 2 you loose. If you roll anything else, that number becomes your point. The goal then is to roll until you get your point, or die by rolling a seven.");
    System.out.println("Do you want to play a game of Craps? Y/n");
    String response = in.nextLine();
    if (response.equals("n") || response.equals("N"))
    {
      play = false;
    }

    while (play)
    {
        while (round)
        {
          System.out.println("Rolling two dice. Good luck.");
          int[] results = dice.getRolls();
          sum = results[0] + results[1];
          System.out.println("You rolled a " + results[0] + " and a " + results[1]);

          if ((sum == 7 && firstRound) || (sum == point))
          {
            System.out.println("You won! :)");
            round = false;
          }

          else if (((sum == 12 || sum == 3 || sum == 2) && firstRound) || sum == 7)
          {
            System.out.println("You lost! :(");
            round = false;
          }

          else if (firstRound)
          {
            point = sum;
            System.out.println("Your new point is " + sum);
            System.out.println("Click enter to roll again");
            response = in.nextLine();
          }

          else
          {
            System.out.println("Survived another round! Congrats. Click enter to roll again");
            response = in.nextLine();
          }

        }

      //Resetting everything for next loop
      sum = 0;
      round = true;
      firstRound = true;
      System.out.println("Do you want to play again? Y/n");
      response = in.nextLine();
      if (response.equals("n") || response.equals("N"));
      {
        play = false;
      }
    }
  }

  public static void main (String[] args)
  {
    Craps test = new Craps();
  }
}
