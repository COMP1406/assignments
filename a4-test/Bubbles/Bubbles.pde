int size = 16;  // for text om the screen

Bubble[] bubbles = new Bubble[4];  // some bubbles


void setup() {
  size(800, 600);
  textSize(size-2);
  
  // make some red bubbles
  bubbles[0] = new RedBubble(100, 100, 36);
  bubbles[1] = new RedBubble(300, 100, 26);
  bubbles[2] = new RedBubble(width/3, height/3, 36);
  bubbles[3] = new RedBubble(width/2, height/2, 26);
  for (Bubble b : bubbles) {
    b.setColour("Red");
    b.setSpeedX(6*Math.random()-3);
    b.setSpeedY(6*Math.random()-3);
  }
}



void drawBubbles(Bubble[] bubbles) {
  int count = 0;
  for (Bubble b : bubbles) { 
    if (b.getColour().equals("Red")) { 
      fill(250, 2, 2);
    }
    ellipse( b.getX(), b.getY(), (int)b.getRadius(), (int)b.getRadius()); 

    // label each bubble
    fill(0);
    text(count,b.getX()-4, b.getY()+8);
    count += 1;
  }
}

void updateBubbles(Bubble[] bubbles) {
  for (Bubble b : bubbles) {
    b.applyLogic(bubbles, 0, 0, width, height);
    b.update();
  }
}

void message() {
  String out;
  int count = 0;
  for( Bubble b: bubbles){
    out = "Bubble["+count+"] : ";
    out += b.getColour() + " (x,y) = (" + (int)b.getX() + "," + (int)b.getY() + ")";
    text(out, 10, height-size*4+size*count); 
    
    out = "speed = (";
    out += String.format("%5.3f", b.getSpeedX()) + ",";
    out += String.format("%5.3f", b.getSpeedY()) + ")";
    text(out, 300, height-size*4+size*count);
    count++;
  }
}

void draw() {
  background(222, 222, 22); // clears screen 
  
  updateBubbles(bubbles);   // update all bubbles
  drawBubbles(bubbles);     // draw all bubbles 
  message();                // info at bottom of screen
  
  
  text("mouse (x,y)=("+mouseX+","+mouseY+")", width-200, 16);
}