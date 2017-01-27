package com.thoughtworks;

/**
 * Created by amit on 21/1/17.
 */
public class Operators {

    public static Operator times(double operand){

        return new Operator( leftOperator -> {

            double result = leftOperator.value();
            for (int i = 1; i < operand;i++){
                result = result * leftOperator.value();
            }
            return result;
        });

    }

    public static Operator plus(double operand){

        return new Operator(leftOperator -> operand+leftOperator.value());
    }

    public static Operator minus(double operand){

        return new Operator(leftOperator -> leftOperator.value() - operand);

    }

    public static Operator multiply(double operand){
        return new Operator(leftOperator -> leftOperator.value() * operand);
    }

    public static Operator divide(double operand){
        return new Operator(leftOperator -> leftOperator.value() / operand);
    }

}
