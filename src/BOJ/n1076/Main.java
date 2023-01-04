package BOJ.n1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        // 세번째 TC를 입력해보니, int의 최대값을 넘어 오버플로우가 났었다. 그래서 long 형으로 바꿔 주었다.
        long sum = 0;

        int count = 3;
        while (count > 0) {
            String color = br.readLine();
            for (int i = 0; i < colors.length; i++) {
                if (colors[i].equals(color)) {
                    if (count == 3) sum = i; // 첫번째 color
                    if (count == 2) sum = (sum * 10) + i; // 두번째 color
                    if (count == 1) sum *= Math.pow(10, i); // 세번째 color
                }
            }
            count--;
        } // while - end

        System.out.println(sum);
    } // main - end
} // class - end
