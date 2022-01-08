package Pack1;

public class Super_This
{
    String s="Parent Class";
}
class C extends Super_This
{
    String s="Child class";
    public void m1()
    {
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
