# 객체지향적 문자열 계산기를 만들어보자. 

### 당신은 계산기를 어떻게 만들 것인가? 

아마도 당장 떠오르는 방법을 찾아보자면, 단순히 if-else로 계속 분기처리하는 형태가 떠오를 것이다. 

```
public class Calculator {
  
  public static int calculate(int x, int y, String operator) {
     
     if(operator.equals("+") {
        return x + y; }
     
     else if 
     (....)
     
```

그러나 이런 방법은 **객체지향적이지 않은, 전형적인 씨자바의 모습**이라고 생각된다.

이번 예제에서 간단한 문자열 계산기를 만들어보며, 그동안의 절차지향적 습관을 벗어던지고 코드를 OOP style로 바꿔본다.
이 과정에서 TDD 또한 적용하며 새로운 코드에 대한 확신을 갖는다.
