import java.util.Scanner;

public class Prak2D {
    public static void main(String[] args) {
        Scanner bagibebek = new Scanner(System.in);
        int a,b;
        a = bagibebek.nextInt();
        b = bagibebek.nextInt();
        System.out.println("masing-masing " +a / b);
        System.out.println("bersisa " +a % b);
        bagibebek.close();
    }
}
