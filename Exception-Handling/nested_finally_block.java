                /* try catch finally block */

package Exception_Handling;

class nested_finally_block {
    public static void main(String[] args) {
        
        try {
            String a = "pritam";
            System.out.println(a.toUpperCase());
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
                System.out.println(10/0);
            } 
            catch (ArithmeticException a) {
                System.out.println("can't divide by zero");
            }
            finally{
                System.out.println("kumar");
            }
            
        }

        System.out.println("main method ended");
    }
    
}
