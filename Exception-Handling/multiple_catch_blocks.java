package Exception_Handling;

class multiple_catch_blocks {
    public static void main(String[] args) {
        
        try{
            int a = 10,b = 2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[0]);

            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException p){
            System.out.println("Array Exception");
        }
        catch (ArithmeticException q) {
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException r){
            System.out.println("Number Exception");
        }
        catch(Exception s){
            System.out.println("All type Exception handled");
        }

    }

}