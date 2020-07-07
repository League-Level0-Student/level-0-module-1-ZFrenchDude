
void setup() {
PImage face = loadImage("Gimo-Cat-Big-Eyes-Instagram.jpg");
size(500,500);
face.resize(500,500);
image(face,0,0);
}

void draw() {
fill(mouseX,mouseY,0);
ellipse(155,165,65,65);
fill(mouseX,mouseY,0);
ellipse(312,209,69,69);

fill(0,0,0);
ellipse(155,165,20,20);
fill(0,0,0);
ellipse(312,209,20,20);
}
