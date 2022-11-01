package TDD.mockito.part1;

public class SimpleCalculatorServiceImpl implements SimpleCalculatorService {

    @Override
    public long add(long num1, long num2) {
        return num1 + num2;
    }

    @Override
    public long subtract(long num1, long num2) {
        return num1 - num2;
    }

    @Override
    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    @Override
    public long divide(long num1, long num2) {
        long result = 0;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            result = num1;
        }
        return result;
    }
}
