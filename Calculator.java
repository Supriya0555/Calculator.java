import java.util.Scanner;

public class Calculator {
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Choose operation (+, -, *, /): ");
            String operation = scanner.next();
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operation) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.println("Result: " + result);
            }
            
            System.out.print("Do you want to perform another calculation? (y/n): ");
            String choice = scanner.next();
            
            if (!choice.equalsIgnoreCase("y")) {
                continueCalculating = false;
                System.out.println("Thank you for using the calculator!");
            }
        }
        
        scanner.close();
    }
}