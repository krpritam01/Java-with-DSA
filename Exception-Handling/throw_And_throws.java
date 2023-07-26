                                        /*throw Vs throws */

package Exception_Handling;

/*public class throw_And_throws {

    void div(int a,int b)
    {
        if (b==0) {
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        throw_And_throws p=new throw_And_throws();
        p.div(20,0);
    }
}*/

/*public class throw_And_throws {

    void div(int a,int b) throws ArithmeticException
    {
        if (b==0) {
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)//throw ArithmeticException
    {
        throw_And_throws p=new throw_And_throws();
        p.div(20,0);
    }
}*/

        

      /*best method */
public class throw_And_throws {

    void div(int a,int b) throws ArithmeticException
    {
        if (b==0) {
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        throw_And_throws p=new throw_And_throws();
        try {
            p.div(20,0);
        }
        catch (Exception e) {
            System.out.println("The value of b is zero");
        }
        
    }
}
