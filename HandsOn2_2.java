import java.util.Scanner;

public class HandsOn2_2 {
    public static void main (String[] args){
    Scanner input;
    int age;
    double income;
    String name;
    
    input = new Scanner(System.in);
    System.out.println("What is your age? ");
    age = input.nextInt();
    System.out.println("What is your annual income? ");
    income = input.nextDouble();
    input.nextLine();
    System.out.println("What is your name ");
    name = input.nextLine();
    System.out.println("Hello " + name + "." + "Your age is " + age + 
    String.format(" and your income is $%.2f" , income));
    input.close();
    }
 
}