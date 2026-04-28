
//1st class
class Base
{
  public int i;
  public int j;

  public Base()
  {
    System.out.println("Inside base constructor");

    this.i=0;
    this.j=0;     //this keyword is optional in this syntax
  }

  protected void finalize()        //work as destructor (finalize method should be protected always)
  {
    System.out.println("Inside finalize method of Base");
  }

  public void fun()
  {
    System.out.println("Inside fun of Base");
  }

}


//2nd class
class Derived extends Base
{
  public int x;

  public Derived()
  {
    System.out.println("Inside Derived constructor");
    this.x=0;
  }


  protected void finalize()
  {
    System.out.println("Inside finalize method of Derived");
  }

  public void gun()
  {
    System.out.println("Inside gun of Derived");
  }
}


//main class
class Single
{
  public static void main(String A[])
  {

    System.out.println("Inside main");

    Derived dobj= new Derived();

    System.out.println(dobj.i);        //0
    System.out.println(dobj.j);        //0
    System.out.println(dobj.x);        //0

    dobj.fun();
    dobj.gun();

    System.out.println("End of main");

  } 
}




//Compile: javac Single.java
//Run: java Single   java= interpreter, Single=class_name
//Compile + Run: java Single.java