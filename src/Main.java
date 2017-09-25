import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1, number2, number3, sum;
        System.out.print("num1:");
        number1=input.nextInt();
        System.out.print("num2:");
        number2=input.nextInt();
        System.out.print("num3:");
        number3=input.nextInt();
        sum=number1+number2-number3;
        System.out.printf("%d+%d-%d=%d", number1,number2,number3,sum);
        input.close();
    }
}