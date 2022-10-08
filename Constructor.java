public class Constructor { 
    int a, b;

    Constructor() { 
        System.out.println("Zero argument constructor"); 
    } 

    Constructor(int a) { 
        this.a = a;
        System.out.println("One argument constructor " + a); 
    } 

    Constructor(int a, int b) { 
        this.a = a;
        this.b = b;
        System.out.println("Two arguments constructor " + a + " " + b); 
    }
    public static void main(String[] args) { 
        Constructor c = new Constructor();
        c = new Constructor(20);
        c = new Constructor(10,15);
    } 
}
