package main.exception;

public class MultipleOperatorsException extends RuntimeException{

    public final static String STANDARD_OPERATOR_ERROR_MSG = "두 개 이상의 연산자가 한 수식에 있습니다.";
    public MultipleOperatorsException(String msg){
        super(msg);
    }
}
