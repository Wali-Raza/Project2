package Pack1;

public class Inheritance_Cons
{
//    Inheritance only applicable for non Argumented constructor only
//    Inheritance not applicable for parametrized constructor,Super use to call that constructor
//    in child class
    Inheritance_Cons()
    {
        System.out.println("Parent Constructor");
    }
}
class C2  extends Inheritance_Cons
{
    C2()
    {
        //super(3);
        System.out.println("Child Constructor");
    }
}
