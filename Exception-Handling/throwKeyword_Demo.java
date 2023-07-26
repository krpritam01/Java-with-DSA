package Exception_Handling;

class throwKeyword_Demo {
    public static void main(String[] args) {
        //JVM inplicitly/internal
        //System.out.println(10/0);

        //User defined on Costomized Exception object (JVM explicitly/External)
        throw new ArithmeticException("/ by zero");
    }
    
}
