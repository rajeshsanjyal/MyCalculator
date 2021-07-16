package com.asterisk.calculator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Calculator implements Serializable {
    private Double op1;
    private Double op2;
    private String operator;
    private Double result;
}
