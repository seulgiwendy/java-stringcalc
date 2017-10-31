package main.domain;

import main.exception.MultipleOperatorsException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public enum Operator{
        SUM("+"){
            @Override
            public int compute(int a, int b){
                return a + b;
            };
        }, DIVIDE("/"){
            @Override
            public int compute(int a, int b){
                return a / b;
            };
        }, MULTIPLY("*"){
            @Override
            public int compute(int a, int b){
                return a * b;
            }
        }, SUBTRACT("-"){
            @Override
            public int compute(int a, int b){
                return a - b;
            }
        };

        private String operator;

        private Operator(String operator){
            this.operator = operator;
        }

        public boolean equals(String s){
            return s.equals(this.operator);
        }

        public abstract int compute(int a, int b);
    }



    public int calculate(String numbers){
        String[] values = numbers.split(" ");
        return compute(values[0], values[2], findOperator(values[1]));
    }


    private int compute(String a, String b, Operator o){
        return o.compute(Integer.parseInt(a), Integer.parseInt(b));
    }


    private Operator findOperator(String s){
        List<Operator> operator = Arrays.asList(Operator.values()).stream().filter(o -> o.equals(s)).collect(Collectors.toList());
        if(operator.size() > 1){
            throw new MultipleOperatorsException(MultipleOperatorsException.STANDARD_OPERATOR_ERROR_MSG);
        }
        return operator.get(0);
    }
}
