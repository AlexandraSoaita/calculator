package EndavaCalculator;

public class BasicCalculatorImpl implements BasicCalculator {
    @Override
    public Long add(Integer... array) {   //poti pasa elementele selectate prin virgula
        Long sum = 0L;
        for (Integer number : array) {
            Long nr = null;
            sum = sum + number; //sau sum+= number;
        }
        return sum;
    }

    @Override
    public Long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Long multiply(Integer a, Integer b) {
        return Long.valueOf(a * b);
    }

    @Override
    public Long multiply(Long a, Long b) {
        return a * b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Long substract(Integer a, Integer b) {
        return Long.valueOf(a - b);
    }

    @Override
    public Long substract(Long a, Long b) {
        return null;
    }

    @Override
    public Double substract(Double a, Double b) {
        return a - b;
    }

    @Override
    public Long divide(Integer a, Integer b) {
        return Long.valueOf(a / b);
    }

    @Override
    public Long divide(Long a, Long b) {
        return a / b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return Double.valueOf(a / b);
    }
}
