                         /* RuntimeException */
                         /* 2.NullPointerException */
package Exception_Handling;

class NPE {
    public static void main(String[] args) {
     
        String str = null;

        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException pr){
            System.out.println("null can't be casted");
        }
    }
}

                    /*Output
                    null can't be casted*/
                     