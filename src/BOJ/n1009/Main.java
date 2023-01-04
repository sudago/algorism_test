package BOJ.n1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int index = 0;
        String[] answer = new String[T];

        while (T > 0) {
            // 새로운 생성자를 가져오려고 해서 백준에서는 런타임 에러(NullPointer)가 떴다.
//            br = new BufferedReader(new InputStreamReader(System.in));
            String[] splitBr = br.readLine().split(" ");
            int a = Integer.parseInt(splitBr[0]);
            int b = Integer.parseInt(splitBr[1]);
            int computerNum = 10;
            int num = a;

            // 숫자를 표현할 수 있는 자릿수에 한계가 있기 때문에 Math.pow()를 이용하면 TC4, TC5가 오류가 났다.
            // int num = (int) Math.pow(a, b);

            for(int i = 2; i <= b; i++) { // 지수가 2 이상일 때만 실행된다.
                num = (num * a) % computerNum;
            }

            int result = (num % computerNum == 0) ? computerNum : num % computerNum;
            answer[index] = Integer.toString(result);

            index++;
            T--;
        }

        // 정답 출력
        for (String str : answer) {
            System.out.println(str);
        }
    } // main - end
} // class - end
