/*abstract class Abstract_methods // abstract methods cannot have a body
{
    abstract void method()
    {
        System.out.println("this is a user defined method");
    }

    public static void main(String[] args)
    {
        Abstract_methods obj= new Abstract_methods(); //Abstract_methods is abstract; cannot be instantiated
        obj.Abstract_methods(); // . symbol not used
    }
}
*/

//tries a second time
/*abstract class Abstract_methods 
{   abstract void print()
    {
        System.out.println("this is a user defined method");
    }
}*/
abstract class Abstract_methods { 
    // 1. Abstract methods CANNOT have a body. They must end with a semicolon.
    abstract void print(); 
}

//public class method extends Abstract_methods
public class method extends Abstract_methods  //Class names should start with a capital letter (changed from 'method')
{   //its not "o" its "capital Ogit"
    @Override
    //void print("hello from here")
    void print() {
        System.out.println("hello from here");
    }

    public static void main(String[] args)
    {
        method obj= new method(); 
        obj.print();
    }
}