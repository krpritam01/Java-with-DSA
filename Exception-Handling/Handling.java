                            /* try-catch Exception */

package Exception_Handling;

class Handling {
    public static void main(String[] args) {
        int a = 20, b = 0, c;  //b=2 then can not be Exception
        try{
            System.out.println("Learn Coding");
            c=a/b;
            System.out.println(c);
            System.out.println("Kumar");
        }
        catch(ArithmeticException p){
            System.out.println("can't divide by zero");
        }
        finally{
            System.out.println("Pritam");
        }

        System.out.println("main method ended");
    }
    
}

                /*output */
                 /* Learn Coding
                    can't divide by zero
                    Pritam
                    main method ended*/