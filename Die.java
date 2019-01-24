/**
* Die.java
* @author Aisling Murran
* @version 01/18/19
*/

import java.util.*;

public class Die
{
  public Die()
  {
  }

  public int getRoll()
  {
      return (int) ((Math.random()*6) + 1);
  }

}
