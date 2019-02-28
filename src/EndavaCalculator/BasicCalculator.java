package EndavaCalculator;

public interface BasicCalculator {

    Long add(Integer... array);
    Long add (Long a, Long b);                        //int e primitiva, nu e extensibil/ Integer e obiect, permite si null; long e tipul intors
    Double add(Double a, Double b);

    Long multiply (Integer a, Integer b);
    Long multiply (Long a, Long b);
    Double multiply (Double a, Double b);

    Long substract (Integer a, Integer b);
    Long substract (Long a, Long b);
    Double substract (Double a, Double b);

    Long divide (Integer a, Integer b);
    Long divide (Long a, Long b);
    Double divide (Double a, Double b);

}


