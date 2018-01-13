PImage donkey; 
PImage tail;
PImage blank;
void setup(){
  donkey = loadImage("donkey.jpg"); 
  background(donkey);   
  size(2000,1500);
  tail = loadImage("tail.png");  
  blank =loadImage("blank background.jpg");
  blank.resize(2000,1500);
  donkey.resize(2000,1500);
}
void draw(){
  if(mouseX<=500&&mouseY<=500){
    loadImage("blank background");
  } else{
    loadImage("donkey.jpg");
  }
  if(mousePressed==true){
    background(donkey);
  image(tail, mouseX-390, mouseY-150); 
  }
}