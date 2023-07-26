package Exception_Handling;

/*public class exPropagation {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        m2();
    }
    public static void m2(){
        System.out.println(10/0);
    }   
}*/

public class exPropagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException a) {
            System.out.println("Exception Handled by main method..!");
        }
    }
    public static void m1() {
        m2();
    }
    public static void m2(){
        System.out.println(10/0);
    }   
}
