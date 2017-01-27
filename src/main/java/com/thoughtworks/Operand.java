package com.thoughtworks;

import com.thoughtworks.Operator;

/**
 * Created by amit on 21/1/17.
 */
public abstract class Operand {

    abstract public double value();

    public double evaluate(Operator operator) {
        return operator.execute(this);
    }
}
