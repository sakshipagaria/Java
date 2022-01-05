class Box {
int width; 
int height; 



Box(Box ob)
 {
  width = ob.width;
height = ob.height; 


}


Box(int w, int h)
 {
 width = w;
height = h; 


}
 Box()
 {

width = -1;
 height = -1; 
 

}

 Box(int len)
 {

width = height = len;

}
int area() 
{

return width * height ;

}

}
 class BoxWeight extends Box
 {
int weight; 

BoxWeight(int w, int h,int m) 
{
 width = w;
height = h; 
 weight = m;

}

}

class boxinheritance
 {

public static void main(String args[]) {

BoxWeight mybox1 = new BoxWeight(10, 20, 34);

BoxWeight mybox2 = new BoxWeight(2, 3, 6);
int area;

area = mybox1.area();
 System.out.println("Area of mybox1 is " + area);

System.out.println("Weight of mybox1 is " + mybox1.weight);
 System.out.println();
area = mybox2.area();
 System.out.println("Area of mybox2 is " +area);

System.out.println("Weight of mybox2 is " + mybox2.weight);
}

}
