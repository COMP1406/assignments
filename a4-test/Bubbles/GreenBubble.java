public class GreenBubble extends Bubble {

  /* constructor */
  public GreenBubble(double x, double y, double speedX, double speedY, double radius, int health) {
    super(x, y, radius);
    this.speedX = speedX;
    this.speedY = speedY;
    this.health = health;
    this.colour = Bubble.COLOURS[2];
  }



  /** updates current bubble object */
  public void update(Bubble[] bubbles, int x1, int y1, int x2, int y2) {

    if ( this != bubbles[0] && collidesWith(bubbles[0]) ) {
      // stop moving if you are touching bubble[0] and decrease radius
      // (also make bubbless[0] bigger!)
      speedX = 0.0;
      speedY = 0.0;
      radius -= 0.1;
      bubbles[0].setRadius( bubbles[0].getRadius() + 0.1 );
    } else {
      // check if we hit any wall
      if ( hitsWall(x1, y1, x2, y2) ) {
        // decrease radius if bubble hits wall
        radius -= 0.1;
      }
      // move towards the centre of the graphics window if health is positve
      if ( health > 0) {
        if ( x > (x1+x2)/2.0 ) {
          speedX -= Bubble.MAX_SPEED/250.0;
        } else if ( x < (x1+x2)/2.0) {
          speedX += Bubble.MAX_SPEED/250.0;
        }
        if ( y > (y1+y2)/2.0 ) {
          speedY -= Bubble.MAX_SPEED/250.0;
        } else if ( y < (y1+y2)/2.0) {
          speedY += Bubble.MAX_SPEED/250.0;
        }
      }else{
         speedX = speedY = 0.0; 
      }
    } 

    

    // don't let radius become too small or big
    if ( radius < 1.0 ) { 
      radius = 1.0;
    }else if (radius > 35){
       // pop!!!
       radius = 1.0;
    }



    // make sure speed is not too great 
    this.capSpeed(MAX_SPEED);

    // update position 
    this.x = this.x + this.speedX;
    this.y = this.y + this.speedY;
  }
}