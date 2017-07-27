public abstract class Bubble{
  /* maximum speed */
	public static double MAX_SPEED = 2;
	
	/* colours avaialable */
	public static final String[] COLOURS = {"Red", "Blue", "Green"};
	
	/* attributes */
	protected String name;            // name of bubble
 	protected int    health;          // health of bubble
	protected int    treasure;        // treasure of bubble
	protected String colour;          // colour of bubble
	protected double radius;          // size of bubble
	protected int    x, y;            // position of bubble
	protected double speedX, speedY;  // speed of bubble

	protected int     count = 0;       // internal counter 
  
	
	/* constructor */
	public Bubble(int x, int y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.health = this.health = 0;
		this.speedX = this.speedY = 0.0;
	}
	
	/* getters */
	public String getName(){ return this.name; }
	public int    getHealth(){ return this.health; }
	public int    getTreasure(){ return this.treasure; }
	public String getColour(){ return this.colour; }
	public double getRadius(){ return this.radius; }
	public int    getX(){ return this.x; }
	public int    getY(){ return this.y; }
	public double getSpeedX(){ return this.speedX; }
	public double getSpeedY(){ return this.speedY; }
	
	/* setters */
	public void setName(String name){ this.name = name; }
	public void setHealth(int health){ this.health = health; }
	public void setTreasure(int treasure){ this.treasure = treasure; }
	public void setColour(String colour){ this.colour = colour; }
	public void setRadius(double radius){ this.radius = radius; }
	public void setX(int x){ this.x = x; }
	public void setY(int y){ this.y = y; }
	public void setSpeedX(double dx){ this.speedX = dx; }
	public void setSpeedY(double dy){ this.speedY = dy; }
	
	/* methods */
	
	/* make sure bubbles do not move too fast */
	public void capSpeed(double max){
		double s2 = speedX*speedX + speedY*speedY; // speed squared
		if( s2 > max*max ){
			double s = Math.sqrt(Math.sqrt(s2));
			speedX = speedX/s*max;
			speedY = speedY/s*max;
		}
	}
	
	/** checks if current bubble has collided with another bubble
	 *
   * @param other is a bubble object
   * @return true if this and other are overlapping in space, false otherwise	 
	 */
	public boolean collidesWith(Bubble other){
		// distance between centres of bubbles squared
		double distance2 = (x-other.x)*(x-other.x) + (y-other.y)*(y-other.y);
		return distance2 <= radius + other.radius;
	}

	/** checks if current bubble has collided with the border of its world.
	 *  <p>
	 *  The world is is a rectangle defined by it top-left corner and 
   *  bottom-right corner. Bubbles live in the interior of this world.	 
	 *  Treat a bubble like a box centred at the bubble's centre. Do not 
	 *  worry about the curvature of the bubble for this collision detection.
	 *
	 * @param x1 is x-coordinate of upper left corner boundary
	 * @param y1 is y-coordinate of upper left corner boundary
	 * @param x2 is x-coordinate of lower right corner boundary
	 * @param y2 is y-coordinate of lower right corner boundary 
	 * @return true if this has hit the wall, false otherwise	 
	 */
	public boolean hitsWall(int x1, int y1, int x2, int y2){
		return y-radius <= y1 || y+radius >= y2 || x-radius <= x1 || x+radius >= y2;
	}	
		

	/** the brain behind the bubble
	 *
	 * @param bubbles contains all bubbles in the world
	 * @param x1 is x-coordinate of upper left corner boundary
	 * @param y1 is y-coordinate of upper left corner boundary
	 * @param x2 is x-coordinate of lower right corner boundary
	 * @param y2 is y-coordinate of lower right corner boundary 
   */	 
	public abstract void applyLogic(Bubble[] bubbles, int x1, int y1, int x2, int y2);
	
	/** updates current bubble object */
	public void update(){
		this.capSpeed(MAX_SPEED);
		this.x = (int) (this.x + this.speedX);
		this.y = (int) (this.y + this.speedY);
	}
}