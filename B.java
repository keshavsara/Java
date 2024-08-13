class AB {
   
    private String name;
    private double salary;
    private int age;

    
    public AB() {
        this.name = "";
        this.salary = 0.0;
        this.age = 0;
    }

    
    public AB(String name, int age) {
        this.name = name;
        this.salary = 0.0;
        this.age = age;
    }

    
    public AB(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}

class B {
    private String department;
    private String degree;

    
    public B(String department, String degree) {
        this.department = department;
        this.degree = degree;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

   
    public void display() {
        System.out.println("Department: " + department);
        System.out.println("Degree: " + degree);
    }

   
    public static void main(String[] args) {
        
        AB obj = new AB("Keshav", 100000, 19);
        obj.display();
        System.out.println();

        
        B objB = new B("ECE", "Engineering");
        objB.display();
    }
}
