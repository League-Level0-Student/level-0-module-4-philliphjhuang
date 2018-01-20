PImage creeper;


void setup(){
  size(1008,567);
  PImage minecraft = loadImage("lol.jpg");
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(5,5);
}
void draw(){
  image(creeper,mouseX,mouseY);
  
  
}