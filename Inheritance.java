class A{
int i,j;
void showij()
{
System.out.println("i  and j:" +i +" "+ j );
}
}

class B extends A
{
int k;
void showk()
{
System.out.println("k:" +k);
}
void sum()
{
System.out.println(" i+j+k: " +(i+j+k));
}
}

class inheritance
{
public static void main(String arg[])
{
A superOb=new A();
B subOb=new B();

superOb.i=20;
superOb.j=30;

System.out.println(" Contents of superOb:" );
superOb.showij();

System.out.println();

subOb.i=2;
subOb.j=8;
subOb.k=3;
System.out.println("Contents of subOb: ");
subOb.showij();


subOb.showk();
System.out.println();


System.out.println(" Sum of i,j and k in subOb: ");
 subOb.sum();
}
}
