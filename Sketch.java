import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  size(500, 500);
}

/** 
 * Called once at the beginning of execution.  Add initial set up
 * values here i.e background, stroke, fill etc.
 */
public void setup() {
background(119, 252, 3);
}

/**
 * Called repeatedly, anything drawn to the screen goes here
 */


public void draw() {

  // Define poppy parameters

  drawPoppy(50, 40, 70);
  drawPoppy(130, 200, 20);
  drawPoppy(300, 400, 60);
  drawPoppy(200, 350, 70);
  drawPoppy(450, 80, 55);
  drawPoppy(400, 230, 40);
  drawPoppy(100, 460, 30);
  drawPoppy(250, 60, 50);

  // Define balloon parameters

  drawBalloon(250, 250, 50, 255, 255, 3);
  drawBalloon(200, 40, 30, 232, 1, 56);
  drawBalloon(450, 340, 80, 453, 23, 43);
  drawBalloon(180, 200, 70, 245, 185, 20);
  drawBalloon(80, 409, 75, 5, 250, 99);
  drawBalloon(350, 135, 54, 164, 5, 250);

}

// Define Method

/**
 * Determines where to draw the poppies according to parameters
 * @param poppyX X-coordinate of the poppy
 * @param poppyY Y-coordinate
 * @param petalSize Size of the petals
 */

void drawPoppy(float poppyX, float poppyY, float petalSize){
float petalDistance = petalSize / 2;

fill(252, 3, 3);

// Top left petal

ellipse(poppyX - petalDistance, poppyY - petalDistance, petalSize, petalSize);

// Top right petal

ellipse(poppyX + petalDistance, poppyY - petalDistance, petalSize, petalSize);

// Bottom left petal

ellipse(poppyX - petalDistance, poppyY + petalDistance, petalSize, petalSize);

// Bottom right petal

ellipse(poppyX + petalDistance, poppyY + petalDistance, petalSize, petalSize);

// Middle petal

fill(8, 7, 7);
ellipse(poppyX, poppyY, petalSize, petalSize);

}

// Define method for drawing smiley face

/**
 * Determines where to draw the balloon according to parameters
 * @param ballX the x-coordinate
 * @param ballY the y-coordinate
 * @param ballDia the diameter of the balloon
 * @param colour1 R value in RGB to determine colour
 * @param colour2 G value in RGB to determine colour
 * @param colour3 B value in RGB to determine colour
 */

public void drawBalloon(float ballX, float ballY, float ballDia, int colour1, int colour2, int colour3){

// Draw balloon
fill(colour1, colour2, colour3);
ellipse(ballX, ballY, ballDia, ballDia);

// Draw string
line(ballX, ballY, ballX, ballY + 120);

}
}








