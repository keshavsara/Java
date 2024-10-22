public class inherit
{
    String name;
    int age;
    String department;
}
public class A extends  inherit{
    public void para(String name ,int age ,String department)
    {
        String name=" ";
        int age=0;
        String department =" ";
    }
}
public class animal 
{
    public animal()
    {
    System.out.println("this is class animal");
    }
}
public class dog extends animal 
{
    public dog()
    {
    super();
    System.out.println("Derived class under base class");
    }
}
public static void main (String [] args)
{
    inherit obj = new inherit();
    obj.para(keshav,20,ECE);
    Dog dog = new Dog();

}