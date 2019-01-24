/**
* Dice.java
* @author Aisling Murran
* @version 01/18/19
*/

import java.util.*;

public class Dice
{
  int diceNum = 2;
  int[] results;
  Die die = new Die();

  public Dice()
  {
    results = new int[diceNum];
  }

  public Dice(int diceNum)
  {
    this.diceNum = diceNum;
    results = new int[diceNum];
  }

  public int[] getRolls()
  {
    for (int i = 0; i < diceNum; i++)
    {
      results[i] = die.getRoll();
    }
    return results;
  }

  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    Dice test = new Dice();
    int[] results = test.getRolls();
    System.out.println(results[0]);
    System.out.println(results[1]);
  }
}
