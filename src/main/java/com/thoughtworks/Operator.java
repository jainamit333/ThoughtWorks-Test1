package com.thoughtworks;

/**
 * Created by amit on 21/1/17.
 */
public  class Operator {

    OperatorOverride operatorOverride;

    public Operator(OperatorOverride operatorOverride){
        this.operatorOverride = operatorOverride;
    }

    public  double execute(Operand operand){

        return operatorOverride.execute(operand);
    }

}
