package TDD.mockito.part1;

import TDD.mockito.part1.SimpleCalculatorServiceImpl;

public class CalculatorApplication {
    private SimpleCalculatorServiceImpl simpleCalculatorService;

    //setter injection
    public void setSimpleCalculatorService(SimpleCalculatorServiceImpl simpleCalculatorService) {
        this.simpleCalculatorService = simpleCalculatorService;
    }
}
