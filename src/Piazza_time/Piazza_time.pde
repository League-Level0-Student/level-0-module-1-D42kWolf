import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
PImage pepperoni;
PImage Mushroom;
void setup() {
   size(500, 500);
  PImage pizzaBox = loadImage("sirbox.png");     //in setup method
  pizzaBox.resize(500, 500);
  
 
  background(pizzaBox);       //in setup method
  pepperoni = loadImage("pepper.png");
  pepperoni.resize(50, 50);
  Mushroom = loadImage("mush.png"); 
  Mushroom.resize(40, 40); 

  minim = new Minim(this);      //in the setup method
  sound = minim.loadFile("dingding.wav");      //in the setup method

  // Put next 2 lines where you want the sound to play
  sound.play();
  sound.rewind();
}

void draw() {
  fill(#D68316);
  ellipse(250, 200, 350, 350);
  fill(#F53B0C);
  ellipse(250, 200, 320, 320);
  fill(#F5CF0C);
  ellipse(250, 200, 300, 300);
  image(pepperoni, 140, 130);
  if (mousePressed) {
    image(Mushroom, mouseX, mouseY);
  }
}