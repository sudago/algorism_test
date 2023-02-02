package leetcode.num07_reverse_integer;

class Solution {
    public static void main(String[] args) {
//        int testInt = 1234567809; // int 값 이상
        int testInt = 123;
        int result = reverse(testInt);
        System.out.println(result);
    }

    public static int reverse(int x) {
        // 입력값이 int 범위를 초과해도 받을 수 있도록 long 형으로 선언.
        long result = 0;
        boolean minus = false;

        if (x < 0) {
            x *= -1;
            minus = true;
        }

        while (x > 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }

        if (minus) result *= -1;
        if (-2147483648 > result || result > 2147483647) { // int 범위 이상이면
            result = 0;
        }
        return (int)result;
    }
}
