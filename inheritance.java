class InheritanceBase {
    void m1() {
        System.out.println("This is method of class inheritance");
    }
}

class B extends InheritanceBase {
    void m2() {
        System.out.println("This is method of class B");
    }
}

class C extends B {
    void m3() {
        System.out.println("This is method of class C");
    }
}

public class inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
