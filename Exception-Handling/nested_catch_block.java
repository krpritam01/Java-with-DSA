package Exception_Handling;

class nested_catch_block {
    public static void main(String[] args) {
        
        try{
            System.out.println(10/0);
        }
        catch(Exception o){
            System.out.println(o);

            try {
                String a = "PRITAM";
                System.out.println(a.toLowerCase());
            } catch (NullPointerException i) {
                System.out.println("null value can't be converted");
            }
        }
        System.out.println("main method ended");
    } 
}
