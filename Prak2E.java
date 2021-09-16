import java.util.Scanner;

public class Prak2E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float t = scan.nextFloat();
        float Luas = a*t/2;

        System.out.printf("%.2f", Luas);

        scan.close();
    }
}