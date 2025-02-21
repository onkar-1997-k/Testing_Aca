package calculator;

public class Table_using_printF {   // Concept of concatenation

    public static void main(String[] args) {

        int a = 10 ;        // only changing this top value we can get any table

        System.out.printf(" %d * %d = %d " , a , 1 , a*1 );   // printf() --> replace the value with %d
        System.out.println();                                 // %d = a / 1 / a respectively
        System.out.printf(" %d * %d = %d " , a , 2 , a*2 );
        System.out.println();                                 // Here a = 10
        System.out.printf(" %d * %d = %d " , a , 3 , a*3 );
        System.out.println();
        System.out.printf(" %d * %d = %d " , a , 4 , a*4 );
        System.out.println();
        System.out.printf(" %d * %d = %d " , a , 5 , a*5 );

    }
}        /*  " Printf() " -->> Replace the value with %
             ( Concept of concatenation )
             %d - int , byte , long , short
             %f - float , double
             %s - string
             %x - Hex
             %b - Boolean

         */
