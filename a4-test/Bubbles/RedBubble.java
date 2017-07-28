public class RedBubble extends Bubble {

  /* constructor */
  public RedBubble(double x, double y, double speedX, double speedY, double radius, int health) {
    super(x, y, radius);
    this.speedX = speedX;
    this.speedY = speedY;
    this.health = health;
    this.colour = Bubble.COLOURS[0];
  }


  /** updates current bubble object */
  public void update(Bubble[] bubbles, int x1, int y1, int x2, int y2) {
    // if bubbles hits border of world then bounce off in a random direction
    if ( x<x1 ) {
      x=x1+1; 
      speedX = Math.random()*3.0;
      speedY = Math.random()*3.0-1.5;
    } else if ( x>x2 ) {
      x = x2-1;
      speedX = -Math.random()*3.0;
      speedY = Math.random()*3.0-1.5;
    }
    if ( y>y2 ) {
      y=y2-1;
      speedY = -Math.random()*3.0;
      speedX = Math.random()*3.0-1.5;
    } else if ( y<y1 ) {
      y=y1+1;
      speedY = Math.random()*3.0;
      speedX = Math.random()*3.0-1.5;
    }

    // steal health from any bubble it overlaps wth
    for (Bubble b : bubbles) {
      if ( this != b && b.getHealth() > 0 && collidesWith(b)) {
        health +=1 ;
        b.setHealth( b.getHealth() - 1);
      }
    }

    this.capSpeed(MAX_SPEED);
    this.x =  (this.x + this.speedX);
    this.y =  (this.y + this.speedY);
  }
}