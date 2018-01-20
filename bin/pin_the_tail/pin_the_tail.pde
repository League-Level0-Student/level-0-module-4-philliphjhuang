import ddf.minim.*; 
PImage donkey; 
PImage tail;
PImage blank;
AudioSample sound1;
int tailx = 0;
int taily = 0;
boolean tailpinned = false;
boolean soundplayed = false;
void setup() {
  frameRate(300);
  donkey = loadImage("donkey.jpg");
  background(donkey);
  size(2710, 1814);
  tail = loadImage("tail.png");
  Minim minim = new Minim(this); 
  sound1 = minim.loadSample("homer-woohoo.wav");
}
void draw() {
  if (!tailpinned) {
    if (mouseX>=0&&mouseY>=0&&mouseX<=100&&mouseY<=100) {

      background(donkey);
    } else { 
      background(255);
    }
  } else { 
    background(donkey);
  }
  if (mousePressed) {
    tailpinned=true;
    tailx = mouseX-390;
    taily = mouseY-150;
    println("X: " + mouseX + " Y: " + mouseY);
  }
  if (tailx>0&&taily>0) {
    image(tail, tailx, taily);
  }
  if (tailx+390>700&&tailx+390<750&&taily+150>650&&taily+150<750) {
    if (!soundplayed) {
      soundplayed=true;
      sound1.trigger();
    }
  }
}