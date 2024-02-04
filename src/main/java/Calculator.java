public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Addition : " + calculator.add(100, 90));
        System.out.println("Subtraction : " + calculator.subtract(100, 90));
        System.out.println("Multiplication : " + calculator.multiply(100, 90));
        System.out.println("Division : " + calculator.divide(100, 0));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Please give divisor bigger than 0");
            return -1;
        }
        return (a * 1.0) / b;
    }
}
