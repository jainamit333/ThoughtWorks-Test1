package com.thoughtworks;

/**
 * Created by amit on 21/1/17.
 */
public  final class Operands {

    public static double one(){
        return OperandValue.ONE;
    }
    public static double two(){
        return OperandValue.TWO;
    }
    public static double three(){
        return OperandValue.THREE;
    }
    public static double four(){
        return OperandValue.FOUR;
    }
    public static double five(){
        return OperandValue.FIVE;
    }
    public static double six(){
        return OperandValue.SIX;
    }
    public static double seven(){
        return OperandValue.SEVEN;
    }
    public static double eight(){
        return OperandValue.EIGHT;
    }
    public static double nine(){
        return OperandValue.NINE;
    }


    public static  double one(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return one();
            }
        });
    }
    public static double two(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return two();
            }
        });
    }
    public static double three(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return three();
            }
        });
    }
    public static double four(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return four();
            }
        });
    }
    public static double five(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return five();
            }
        });
    }
    public static double six(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return six();
            }
        });
    }
    public static double seven(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return seven();
            }
        });
    }
    public static double eight(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return eight();
            }
        });
    }
    public static double nine(Operator operator){
        return operator.execute(new Operand() {
            @Override
            public double value() {
                return nine();
            }
        });
    }




}
