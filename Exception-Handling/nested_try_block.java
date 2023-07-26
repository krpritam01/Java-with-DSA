                                        /*nested try block */
package Exception_Handling;

class nested_try_block {
    public static void main(String[] args) {
        try{

            try{
                int a[]={10,20,30};
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException i){
                System.out.println(i);
            }

            System.out.println(10/0);
        }
        catch(ArithmeticException o){
            System.out.println(o);
        }
        System.out.println("Kr Pritam");
    }
}
