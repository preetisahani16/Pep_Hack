
import java.util.Scanner;
import java.util.TreeSet;

public class NKnight {
    private static int[] xInc = {-1, 1, -1, 1, -2, 2, -2, 2};
    private static int[] yInc = {-2, 2, 2, -2, -1, 1, 1, -1};
    private static long c = 0;
    private static TreeSet<String> set;

    private static boolean isSafe(int[][] board, int x, int y, int n) {
        for (int i = 0; i < 8; i++) {
            int x1 = x + xInc[i];
            int y1 = y + yInc[i];
            if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < n)
                if (board[x1][y1] == 1)
                    return false;
        }
        return true;
    }

    private static void printSoln(int[][] board, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1)
                    s = s  + i + "-" + j +", ";
            }
        }
        s +=".";
        set.add(s);
    }

    private static void solve(int[][] board, int x, int y, int count, int n) {
        if (board[x][y] == 0 && isSafe(board, x, y, n)) {
            board[x][y] = 1;
            if (count == n - 1) {
                c++;
                printSoln(board, n);
                board[x][y] = 0;
                return;
            }
            for (int i = x; i < n; i++) {
                for (int j = y + 1; j < n; j++) {
                    solve(board, i, j, count + 1, n);
                }
            }
            for (int i = x + 1; i < n; i++) {
                for (int j = 0; j <= y; j++) {
                    solve(board, i, j, count + 1, n);
                }
            }
            board[x][y] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        set = new TreeSet<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                solve(board, i, j, 0, n);
        for (String s : set)
            System.out.println(s + " ");
    }
}