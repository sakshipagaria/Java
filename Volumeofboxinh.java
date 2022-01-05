class Box {
int width; 
int height; 
int depth;


Box(Box ob)
 {
  width = ob.width;
height = ob.height; 
depth = ob.depth;

}


Box(int w, int h, int d)
 {
 width = w;
height = h; 
depth = d;

}
 Box()
 {

width = -1;
 height = -1; 
 depth = -1; 

}

 Box(int len)
 {

width = height = depth = len;

}
int volume() 
{

return width * height * depth;

}

}
 class BoxWeight extends Box
 {
int weight; 

BoxWeight(int w, int h,int d,int m) 
{
 width = w;
height = h; 
depth = d;
 weight = m;

}

}

class boxinheritance
 {

public static void main(String args[]) {

BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34);

BoxWeight mybox2 = new BoxWeight(2, 3, 4, 6);
int vol;

vol = mybox1.volume();
 System.out.println("Volume of mybox1 is " + vol);

System.out.println("Weight of mybox1 is " + mybox1.weight);
 System.out.println();

vol = mybox2.volume();
 System.out.println("Volume of mybox2 is " + vol);

System.out.println("Weight of mybox2 is " + mybox2.weight);
}

}
