import java.util.Scanner;

public class Prak2F {
    public static void main(String[] args) {
        Scanner Matriks = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = Matriks.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[j][i]);
                if (j <= 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("\n");
                }
            }
        }

        Matriks.close();
    }
}
