void setup(){
  PImage face = loadImage("sppoky.jpg");
image(face, 0, 0);
size(500, 500);
face.resize(100, 100);
}
void draw(){
  fill(mouseX, #FCFAFA, mouseY);

ellipse(140, 195, 50, 50);
ellipse(215, 165, 50, 50);
fill(0,0,0);
ellipse(140, 195, 20, 20);
ellipse(215, 165, 20, 20);
}