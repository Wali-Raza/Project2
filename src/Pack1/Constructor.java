package Pack1;
public class Constructor
{
    String name;
    int Roll;

    public Constructor(String Name, int Roll_Number) {
        this.name = Name;
        System.out.print(name+" ");
        this.Roll = Roll_Number;
        System.out.println(Roll);
    }
}
