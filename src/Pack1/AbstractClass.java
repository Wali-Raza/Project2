package Pack1;

abstract class AbstractClass
{
    public abstract void m1();
    public abstract void m2();
}
class Sub1 extends AbstractClass
{
     public void m1()
     {
         System.out.println("M1 body");
     }
     public void m2()
     {
         System.out.println("M2 body");
     }
}
