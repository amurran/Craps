/**
* Die.java
* @author Aisling Murran
* @version 01/18/19
*/

import java.util.*;

public class Die
{
  int sides = 6;

  public Die()
  {
  }

  public Die(int sides)
  {
    this.sides = sides;
  }

  public int getRoll()
  {
      return (int) ((Math.random()*sides) + 1);
  }

}
