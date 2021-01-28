/*
* This class creates a Carrier which is a type of Ship.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-20
*/

public class Carrier extends Ships {
    
  /**
   * Setting field values with a constructor. 
   */
  public Carrier() {
    super();
    this.shipSize = 5;
    this.shipHealth = shipSize;
    this.shotSegments = 0;
    this.positionX1 = -1;
    this.positionY1 = -1;
    this.positionX2 = -1;
    this.positionY2 = -1;
    this.positionX3 = -1;
    this.positionY3 = -1;
    this.positionX4 = -1;
    this.positionY4 = -1;
    this.positionX5 = -1;
    this.positionY5 = -1;
  }
}
