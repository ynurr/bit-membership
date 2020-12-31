package syntax;

import java.util.Scanner;

// 전역 변수
// 전역 변수란, 해당 프로그램 전체에서 접근 가능한 변수를 말한다.
// 장점: 모든 메소드 접근 가능
// 단점: 모든 메소드 접근 가능

// 어떤 메소드이든 접근이 가능하기 때문에 전역 변수 사용은 권장하지 않는다.
// 그 값의 무결성(결점이 없음)을 검증하려면 여러 메소드를 다 확인해야 하는데
// 확인이 어렵고 정확하지 않을 수도 있기 때문이다.

public class Ex01GlobalVariable {
    // 전역 변수의 경우 유효범위가 프로그램 전체가 되어야 하기 때문에
    // 클래스의 바로 다음 줄에 나온다.
    int userNumber = 0;
    Scanner scanner = new Scanner(System.in);
    // 하지만 3세대 언어에서는 이 위치에 변수를 선언하면
    // 변수가 아닌 필드가 된다.
    
    // 모든 메소드가 사용할 몇 개의 변수를
    // private 선언하고, getter/setter 를 만들지 않으면?
    // 조금이나마 해당 변수의 무결성을 올려줄 수 있다.
    

}
