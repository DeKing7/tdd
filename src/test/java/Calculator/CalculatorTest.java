package Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator calc = null;

  //  CalculatorService service = new CalculatorService() {
//        @Override
//        public int add(int a, int b) {
//            return 0;
//        }
//
//        @Override
//        public int substract(int a, int b) {
//            return 0;
//        }
//
//        @Override
//        public int multiply(int a, int b) {
//            return 0;
//        }
//
//        @Override
//        public double divide(int a, int b) {
//            return 0;
//        }
    CalculatorService service = mock(CalculatorService.class);

    @BeforeEach
    public void setUp() {calc = new Calculator(service);}

    @Test
    public void testAddition(){
        when(service.add(3,3)).thenReturn(6);
        assertEquals(7, calc.perform_1(3,3));
        verify(service, atLeastOnce()).add(3,3);

    }
    @Test
    public void testSubstraction(){
        when(service.substract(6,3)).thenReturn(3);
        assertEquals(6, calc.perform_2(3,3));
        verify(service, atLeastOnce()).substract(6,3);

    }
    @Test
    public void testMultipication(){
        when(service.multiply(3,3)).thenReturn(9);
        assertEquals(9, calc.perform_3(3,3));
        verify(service, atLeastOnce()).multiply(3,3);
    }
    @RepeatedTest(value = 56, name = "X {currentRepetition} z {totalRepetition) testów")
    public void testDivide(){
        System.out.println(System.currentTimeMillis());
        when(service.divide(5,2)).thenReturn(2.5);
        assertEquals(6.5, calc.perform_4(5,2));
        verify(service, atLeastOnce()).divide(5,2);

    }

}
