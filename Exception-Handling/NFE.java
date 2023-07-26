                        /* RuntimeException */
                         /* 2.NumberFormatException */
package Exception_Handling;                        
class NFE {
    public static void main(String[] args) {
        String str = "pritam";   //put value number "123" then not exception

        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("String "+str+" can't be Converted to Integer");
        }
        System.out.println("main method ended");
    }
}
