public class Main {
    public static int climb(int N) {
        int prev1 = 1; // ways(1)
        int prev2 = 2; // ways(2)
        int current = 0;

        for (int i = 1; i <= N; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(climb(4));
    }
}