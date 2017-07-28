int size = 16;  // for text om the screen

Bubble[] bubbles = new Bubble[4];  // some bubbles


void setup() {
  size(600, 500);
  textSize(size-2);

  // make some red bubbles
  bubbles[0] = new GreenBubble(100, 100, (4*Math.random()-2), (4*Math.random()-2.), 20., 100);
  bubbles[1] = new GreenBubble(400, 100, (4*Math.random()-2), (4*Math.random()-2), 20., 100);
  bubbles[2] = new GreenBubble(100, 400, (4*Math.random()-2), (4*Math.random()-2), 20., 100);  
  bubbles[3] = new RedBubble(400, 400, (4*Math.random()-2), (4*Math.random()-2), 10., 10);
}



void drawBubbles(Bubble[] bubbles) {
  int count = 0;
  for (Bubble b : bubbles) { 
    if (b.getColour().equals(Bubble.COLOURS[2])) { 
      fill(20, 175, 21);
    } else if ( b.getColour().equals(Bubble.COLOURS[1])) { 
      fill(20, 15, 243);
    } else if ( b.getColour().equals(Bubble.COLOURS[0])) { 
      fill(250, 1, 2);
    } else { 
      fill(200, 0, 200);
    }
    ellipse( (float) b.getX(), (float)b.getY(), 2*(float)b.getRadius(), 2*(float)b.getRadius()); 

    // label each bubble
    fill(0);
    text(count, (float) (b.getX()-4), (float) (b.getY()+8));
    count += 1;
  }
}

void updateBubbles(Bubble[] bubbles) {
  for (Bubble b : bubbles) {
    b.update(bubbles, 0, 0, width, height);
  }
}

void message() {
  String out;
  int count = 0;
  for ( Bubble b : bubbles) {
    out = "Bubble["+count+"] : ";
    out += b.getColour() + " (x,y) = (" + (int)b.getX() + "," + (int)b.getY() + ")";
    text(out, 10, height-size*4+size*count); 

    out = "speed = (";
    out += String.format("%5.3f", b.getSpeedX()) + ",";
    out += String.format("%5.3f", b.getSpeedY()) + ")";
    text(out, 300, height-size*4+size*count);
    
    out = "health = " + b.getHealth();
    text(out, 500, height-size*4+size*count);
    
    count++;
  }
}

void draw() {
  background(222, 222, 22); // clears screen 
  fill(0); // black fill
  ellipse(width/2, height/2, 3, 3);

  updateBubbles(bubbles);   // update all bubbles
  drawBubbles(bubbles);     // draw all bubbles 
  message();                // info at bottom of screen


  text("mouse (x,y)=("+mouseX+","+mouseY+")", width-200, 16);
}