package TDD.mockito;

public class CalculatorApplication {
    private SimpleCalculatorServiceImpl simpleCalculatorService;

    //setter injection
    public void setSimpleCalculatorService(SimpleCalculatorServiceImpl simpleCalculatorService) {
        this.simpleCalculatorService = simpleCalculatorService;
    }
}
