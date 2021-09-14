import java.util.Scanner;

public class Prak2B {
    public static void main(String[] args) {
        
        Scanner bebek = new Scanner(System.in);
        int A, B;
        A = bebek.nextInt();
        B = bebek.nextInt();

        int Total;
        Total = A + B;
        
        System.out.println(Total);
        bebek.close();
    }
}