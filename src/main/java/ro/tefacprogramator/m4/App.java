package ro.tefacprogramator.m4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator c1 = new Calculator();

        int result = Calculator.add(5, 7);

        System.out.println("result = " + result);
    }
}
