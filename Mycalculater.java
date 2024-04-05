
import java.lang.*;
import java.util.Scanner;
public class Mycalculater {
    public static void main(String[] args)
    {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        num1 = sc.nextDouble();
        System.out.print("Enter the Second Number:");
        num2 = sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        double opPer = 0;
        switch (op)
        {
            case '+':
                opPer = num1 + num2;
                break;
            case '-':
                opPer = num1 - num2;
                break;
           case '*':
                opPer = num1*num1;
                break;
            default:
                System.out.print("You enter wrong input");
        }
        System.out.print("The final result:");
        System.out.println();
        System.out.print(num1 + " " + op + " " + num2
                + " = " + opPer);
        System.out.println();

            Scanner scanner = new Scanner(System.in);
        System.out.println("--------For Other Operation like exponential-------");
            System.out.print("Enter the base number");
            double a= scanner.nextDouble();
            System.out.print("Enter the Exponent");
            double b=scanner.nextDouble();
            double result=Math.pow(a,b);

            System.out.println("Square of input digit:"+result);
            scanner.close();
    }
}
