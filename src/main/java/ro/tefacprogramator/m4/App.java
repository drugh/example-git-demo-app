package ro.tefacprogramator.m4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        int result = Calculator.add(5, 7);

        System.out.println("result = " + result);

        result = Calculator.subtract(5, 7);
        System.out.println("result = " + result);


        result = Calculator.multiply(5, 7);
        System.out.println("result = " + result);

        double rez;
        rez = Calculator.divide(5, 7);
        System.out.println("result = " + rez);



    }
}
