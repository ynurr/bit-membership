package branch;
// 사용자로부터 숫자를 입력 받아서
<<<<<<< HEAD
// 홀수일때만 "홀수입니다" 라고 출력되는 프로그램을 작성하시오.
// 단 짝수일때는 아무런 반응이 없습니다. (25분까지)
=======
// 홀수일 때만 "홀수입니다" 라고 출력되는 프로그램을 작성하시오.
// 단 짝수일 때는 아무런 반응이 없습니다. (25분)
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
import java.util.Scanner;
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        if(number % 2 == 1) {
            System.out.println("홀수입니다.");
        }
        
        
        scanner.close();
    }
}
