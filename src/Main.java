//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
import greedy.sportswear;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while(true){


            System.out.println(" ");
            System.out.println("체육복 문제 - 종료 시 0 입력");

            System.out.print("전체 학생 수 n 입력: ");
            int n = sc.nextInt();

            if (n == 0)
                break;

            System.out.print("분실한 학생 수 입력: ");
            int lostCount = sc.nextInt();
            int[] lost = new int[lostCount];
            System.out.print(lostCount + "명의 번호 입력: ");
            for (int i = 0; i < lostCount; i++) {
                lost[i] = sc.nextInt();
            }

            System.out.print("여벌 체육복 학생 수 입력: ");
            int reserveCount = sc.nextInt();
            int[] reserve = new int[reserveCount];
            System.out.print(reserveCount + "명의 번호 입력: ");
            for (int i = 0; i < reserveCount; i++) {
                reserve[i] = sc.nextInt();
            }

            // Solution 객체 생성 후 메서드 호출
            sportswear sportswear = new sportswear();
            sportswear.Solution solution = sportswear.new Solution();

            int answer = solution.solution(n, lost, reserve);

            System.out.println("체육 수업에 참여 가능한 최대 학생 수: " + answer);


        }

        sc.close();





    }
}