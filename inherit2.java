public class Inherit2 {
    String name;
    int age;
    String department;

    public static void main(String[] args) {
        A obj = new A();
        obj.para("Keshav", 20, "ECE");

        Dog dog = new Dog();
    }
}

class A extends Inherit2 {
    public void para(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Department: " + this.department);
    }
}

class Animal {
    public Animal() {
        System.out.println("This is class Animal");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Derived class under base class");
    }
}
