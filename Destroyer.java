/*
* This class creates a Destroyer which is a type of Ship.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-20
*/

public class Destroyer extends Ships {

  /**
   * Setting field values with a constructor. 
   */
  public Destroyer() {
    super();
    this.shipSize = 2;
    this.shipHealth = shipSize;
    this.shotSegments = 0;
    this.positionX1 = -1;
    this.positionY1 = -1;
    this.positionX2 = -1;
    this.positionY2 = -1;
  }
}
