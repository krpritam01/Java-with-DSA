                         /* RuntimeException */
                         /* 1.ArithmeticException */
package Exception_Handling;



                         
class AE{
    public static void main(String[] args) {
        System.out.println("main method started");

        int a=10,b=0,c;
        try{
            c=a/b; //c=10/0
            System.out.println(c);
        }
        catch(ArithmeticException p)
        {
            System.out.println("can't devide by zero");
        }

        System.out.println("main method ended");

    }
}

                  /*output */
            /*main method started
              can't devide by zero
              main method ended*/
