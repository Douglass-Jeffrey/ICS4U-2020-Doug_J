/*
* This class creates a ship object which holds methods for the other types of ships.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-20
*/

public class Ships {
  // Initializing fields

  int shipSize;
  int shipHealth;
  int shotSegments;
  int positionX1;
  int positionY1;
  int positionX2;
  int positionY2;
  int positionX3;
  int positionY3;
  int positionX4;
  int positionY4;
  int positionX5;
  int positionY5;

  /**
   * Sets hits on the ships and modifies their fields.
   */
  public String setHit(int attackY, int attackX, String shipType, String userVal) {
    shipHealth += -1;
    shotSegments += 1;
    String shootMessage = (userVal + " hit a " + shipType + ". It has "
                           + shipHealth + " health remaining.\n");

    if (shotSegments == shipSize && shipHealth == 0) {
      shootMessage = (shootMessage + "\n\n" + userVal
                      + " sunk the " + shipType + "!\n");
    }

    return (shootMessage);
  }
  
  /**
   * Assigns the positions of the ships at the beginning of the game.
   */
  public String assignPosition(int yVal1, int xVal1, int yVal2, int xVal2,
                               int yVal3, int xVal3, int yVal4, int xVal4,
                               int yVal5, int xVal5) {

    positionX1 = xVal1;
    positionY1 = yVal1;
    positionX2 = xVal2;
    positionY2 = yVal2;
    positionX3 = xVal3;
    positionY3 = yVal3;
    positionX4 = xVal4;
    positionY4 = yVal4;
    positionX5 = xVal5;
    positionY5 = yVal5;

    return "success";
  }
  
  /**
   * Checks ship health to determine if it is destroyed or not.
   */
  public int healthcheck() {
    return (shipHealth);
  }
}
