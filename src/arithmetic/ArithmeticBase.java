/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import arithmetic.ArithmeticGenerators.Operations;
import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 14/02/22
 */
public class ArithmeticBase 
{
    public enum Operations {PLUS,MINUS,TIMES,DIVIDE};
 public double x,y;
    double calculate(double x, double y) 
          
    public Operations operations ;
        {
        Scanner sc =new Scanner(System.in);
        ArithmeticGenerators a1 = new ArithmeticGenerators();
        System.out.println("Enter arithmetic operation to Perform: ");
        Operations operations = ArithmeticGenerators.Operations.operations();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
