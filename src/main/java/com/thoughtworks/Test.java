package com.thoughtworks;

import static com.thoughtworks.Operands.eight;
import static com.thoughtworks.Operands.seven;
import static com.thoughtworks.Operators.plus;
/**
 * Created by amit on 21/1/17.
 */
public class Test {


    public static void main(String[] args) {


        System.out.println(eight(plus(seven())));
    }
}
