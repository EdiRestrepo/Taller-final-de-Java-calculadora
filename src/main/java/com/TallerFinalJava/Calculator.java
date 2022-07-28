package com.TallerFinalJava;

import java.util.Scanner;

/**
 * The class Calculator is a calculator that performs the following operations: Addition, Subtraction, Multiplication, Division, and Division Module.
 * The calculator supports any number of both positive and negative numbers, including their decimal part.
 * @author Edison Estival Restrepo Ospina
 */
public class Calculator {
    /**
     * captures information from a variable
     */
    private static Scanner input = new Scanner(System.in);
    /**
     * number1, number2, result, counter and result represent 4 attributes of type real
     */
    private static double number1, number2, result, counter;
    /**
     * represents an attribute of type String
     */
    private static String mathematicalOperator;

    /**
     * represents the main method
     * 1. counter=0; => assigns counter = 0
     * 2. askNumber(); => prints "type number: "
     * 3. number1 = captureNumber(); => capture a number type double
     * 4. input.nextLine(); => Clear input buffer after reading a number
     * 5. do{}while(counter!=0); repeats the cycle as long as the counter is non-zero
     * 6. askMathematicalOperator(); => prints "type operator: "
     * 7. mathematicalOperator = captureMathematicalOperator(); => captures a data type  text
     * 8. result = evaluateOperator(mathematicalOperator); => evaluates the type of operator entered by the user
     * 9. askContinue(); => prints "do you wish to continue? "
     * 10. counter=captureNumber(); capture a number to continue or to exit of the calculator
     * 11. input.nextLine(); => Clear input buffer after reading a number
     *
     * @param args method main
     */
    public static void main(String[] args) {
        counter=0;
        mathematicalOperators();
        askNumber();
        number1 = captureNumber();
        input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
        do{
            askMathematicalOperator();
            mathematicalOperator = captureMathematicalOperator();
            result = evaluateOperator(mathematicalOperator);
            System.out.println("Result= "+result);
            askContinue();
            System.out.print("to continue type a number diferent to 0 (zero), otherwise type 0(zero) to exit: ");
            counter=captureNumber();
            input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
        }while (counter!=0);

    }

    /**
     * this method prints "type operator: ".
     */
    private static void askMathematicalOperator(){
        System.out.print("type operator: ");
    }

    /**
     * this method prints "type number: ".
     */
    private static void askNumber(){
        System.out.print("type number: ");
    }

    /**
     * this method prints "type number: ".
     */
    private static void askContinue(){
        System.out.println("do you wish to continue? ");
    }

    /**
     *
     * @return captures a data type  text
     */
    private static String captureMathematicalOperator(){
        return input.nextLine();
    }

    /**
     *
     * @return capture a number type double
     */
    private static double captureNumber(){
        return input.nextDouble();
    }

    /**
     * prints the menu to users
     */
    private static void mathematicalOperators(){
        System.out.println("-----Calculator------");
        System.out.println("addition       => [+]");
        System.out.println("subtraction    => [-]");
        System.out.println("multiplication => [*]");
        System.out.println("divide         => [/]");
        System.out.println("divide module  => [%]");
        System.out.println("");
    }

    /**
     *
     * @param mathematicalOperator according to the mathematical operator entered by the user, evaluates the operation
     * @return number type double
     */
    private static double evaluateOperator(String mathematicalOperator){
        switch (mathematicalOperator){
            case "+":
                if (counter==0){
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = number1 + number2;
                    counter++;
                    return result;
                }else {
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = result + number2;
                    counter++;
                    return result;
                }
            case "-":
                if (counter==0){
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = number1 - number2;
                    counter++;
                    return result;
                }else {
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = result - number2;
                    counter++;
                    return result;
                }
            case "*":
                if (counter==0){
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = number1 * number2;
                    counter++;
                    return result;
                }else {
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = result * number2;
                    counter++;
                    return result;
                }
            case "/":
                if (counter==0){

                    do{
                        askNumber();
                        number2 = captureNumber();
                        if(number2==0){
                            System.out.println("cannot be divided by zero");
                        }
                    }while (number2==0);
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = number1 / number2;
                    counter++;
                    return result;
                }else {
                    do{
                        askNumber();
                        number2 = captureNumber();
                        if(number2==0){
                            System.out.println("cannot be divided by zero");
                        }
                    }while (number2==0);
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = result / number2;
                    counter++;
                    return result;
                }
            case "%":
                if (counter==0){
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = number1 % number2;
                    counter++;
                    return result;
                }else {
                    askNumber();
                    number2 = captureNumber();
                    input.nextLine(); //Limpiar el buffer de entrada después de leer el número entero
                    result = result % number2;
                    counter++;
                    return result;
                }
            default:
                System.out.println("incorrect operator");
                return result;

        }
    }
}

