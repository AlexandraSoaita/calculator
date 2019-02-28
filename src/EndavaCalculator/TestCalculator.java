package EndavaCalculator;

public class TestCalculator {
    public static void main (String [] args){
        BasicCalculator basicCalculator = new BasicCalculatorImpl();
        ExpertCaculator expertCaculator = new ExpertCalculatorImpl();
        // Integer[] array={1, 2, 3}; cand pui ... nu mai trb sa declari array ul asta

        System.out.println(expertCaculator.evaluate("2+3"));
        System.out.println(expertCaculator.evaluate("4-2"));
        System.out.println(expertCaculator.evaluate("2+3+4"));
        System.out.println(expertCaculator.evaluate("3*4"));
        System.out.println(expertCaculator.evaluate("10/5"));
        System.out.println(expertCaculator.evaluate("10-2*3"));
        System.out.println("2+2*(2+8)=" + expertCaculator.evaluate("2+2*(2+8)"));


        }
    }

