int x1=mouseX-200;
int x2=mouseX+200;
void setup(){
  size(800,300);
  
}
void draw(){
  background(#000000);
  fill(#FFFFFF);
  ellipse(200,150,300,150);
  ellipse(600,150,300,150);
  
  fill(#000000);
  ellipse(x1,mouseY,75,75);
  ellipse(x2,mouseY,75,75);
  
  if(x1<100){
  x1=mouseX-200;
  x2=mouseX+200;
}
}