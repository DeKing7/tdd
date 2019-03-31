package Calculator;

public class Calculator {

    CalculatorService service;

    public Calculator(CalculatorService service){
        this.service = service;
    }

    public int perform_1 (int a, int b) {
        return service.add(a, b)+ 1;
    }
    public int perform_2 (int a, int b){
        return service.substract(a,b)+ 3;
    }
    public int perform_3 (int a, int b){
        return service.multiply(a, b)+ 2;
    }
    public double perform_4 (int a, int b){
        return service.divide(a, b)+ 4;
    }
}
