import java.util.Scanner;

class Main {
    static int m, c;
    static int[][] price;
    static int[][] memo;

    // money left, garment index
    static int shop(int money, int g) {
        if (money < 0)
            return -1000000000;
        if (g == c)
            return m - money;
        if (memo[money][g] != -1)
            return memo[money][g];
        int bestRes = -1;
        for (int i = 1; i <= price[g][0]; i++) {
            bestRes = Math.max(shop(money - price[g][i], g + 1), bestRes);
        }
        memo[money][g] = bestRes;
        return bestRes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            m = scanner.nextInt();
            c = scanner.nextInt();
            price = new int[c][];
            memo = new int[210][c];
            for (int i = 0; i < c; i++) {
                price[i] = new int[scanner.nextInt() + 1];
                price[i][0] = price[i].length - 1;
                for (int j = 1; j < price[i].length; j++)
                    price[i][j] = scanner.nextInt();
            }
            for (int[] row : memo) {
                for (int i = 0; i < row.length; i++) {
                    row[i] = -1;
                }
            }
            int score = shop(m, 0);
            if (score < 0)
                System.out.println("no solution");
            else
                System.out.println(score);
        }
        scanner.close();
    }
}
