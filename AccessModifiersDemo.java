/*
 AIM: Write program to study access modifiers in java using packages.
Objective: To study the purpose of different access modifiers in java. .
*/
// Save this code in a file named AccessModifiersDemo.java

// Class with default access modifier
// Save this code in a file named AccessModifiersDemo.java

// Class with default access modifier
class DefaultClass {
    void display() {
        System.out.println("Default Access Modifier");
    }
}

// Class with private access modifier
class PrivateClass {
    private void display() {
        System.out.println("Private Access Modifier");
    }

    public void show() {
        // This will work because display() is accessed within the same class
        display();
    }
}

// Class with protected access modifier
class ProtectedClass {
    protected void display() {
        System.out.println("Protected Access Modifier");
    }
}

// Class with public access modifier
class PublicClass {
    public void display() {
        System.out.println("Public Access Modifier");
    }
}

// Main class to demonstrate access modifiers
public class AccessModifiersDemo extends ProtectedClass {
    public static void main(String[] args) {
        // Default Access Modifier
        DefaultClass defaultObj = new DefaultClass();
        // This will work because DefaultClass is in the same file
        defaultObj.display();

        // Private Access Modifier
        PrivateClass privateObj = new PrivateClass();
        // This will not work because display() has private access modifier
        // Uncommenting the following line will cause a compile-time error
        // privateObj.display();
        // However, we can access it via a public method within the same class
        privateObj.show();

        // Protected Access Modifier
        AccessModifiersDemo protectedObj = new AccessModifiersDemo();
        // This will work because AccessModifiersDemo is a subclass of ProtectedClass
        protectedObj.display();

        // Public Access Modifier
        PublicClass publicObj = new PublicClass();
        // This will work because display() has public access modifier
        // and can be accessed from any other class
        publicObj.display();
    }
}
