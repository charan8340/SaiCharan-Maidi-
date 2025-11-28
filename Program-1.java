import java.util.*;
class Calculator {
    int a, b;
    String op;

    public Calculator(int a, int b, String op){
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public int calculate(int a, int b, String op){
        switch(op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if(b != 0)
                    return a / b;
                else
                    System.out.println("division by zero error");
            default:
                System.out.println("choose either +, -, *, /");
        }
        return -0;
    }
}

class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        int result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);
    }
}