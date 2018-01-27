PImage creeper;
int x = 985;
int y = 370;
PImage minecraft;



void setup(){
  size(1008,567);
  minecraft = loadImage("lol.jpg");
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(5,5);
}
void draw(){
  background(minecraft);
  image(creeper,x,y);
  //println("X: " + mouseX + " Y: " + mouseY); 
  if(mousePressed==true){
    fill(#FF0000);
   ellipse(mouseX,mouseY,15,15);
  } if(mousePressed==true&&mouseX>=-100&&mouseY>=-100&&mouseX<=200&&mouseY<=200){
   fill(#00FF00);
   ellipse(mouseX,mouseY,15,15);
  }
  if(mousePressed==true&&isNear(mouseX,x)&& isNear(mouseY,y)){
    fill(#00FF00);
   ellipse(mouseX,mouseY,15,15);
  } 
  if(mousePressed==true&&mouseX>=x-5&&mouseY>=y-5&&mouseX<=x+5&&mouseY<=y+5){
   println("Creeper spotted");
   x=420;
   y=420;
  }
}
boolean isNear(int a,int b) {
if (abs(a - b) < 15)
     return true;
else
     return false;
}