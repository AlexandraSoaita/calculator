package EndavaCalculator;

public interface ExpertCaculator extends BasicCalculator {
    Long pow(Integer x, Integer n);

    Double root(Integer x);

    Long factorial(Integer n);

    Double evaluate(String expression);
}
