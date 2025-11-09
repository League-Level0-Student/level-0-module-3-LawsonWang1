
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  int r = 50;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int x = 0; x < 8; x++){
     ellipse(250,250,450 - r,450 - r); 
     r += 50;
     if (x % 2 == 0) {
       fill(0,0,0);
  }  else {
       fill(255,0,0);
  }
  
  
  //Use an if statement and remainder to alternate the color of your rings.

  
 }
}
