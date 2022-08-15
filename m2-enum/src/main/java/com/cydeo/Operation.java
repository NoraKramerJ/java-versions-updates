package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE,
    // each constant here is an object of Operation class
    ;

    Operation() {
        System.out.println("Constructor");
    }
}
