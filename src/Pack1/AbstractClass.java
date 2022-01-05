package Pack1;

abstract class AbstractClass
{
    public abstract void m1();
    public abstract void m2();
}
abstract class Sub1 extends AbstractClass
{
     public void m1()
     {
         System.out.println("M1 body");
     }
}
class Sub2 extends Sub1
{
    public void m2()
    {
        System.out.println("Sub2 M2");
    }
}
