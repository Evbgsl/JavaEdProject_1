import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите оператор: ");
        char str = input.next().charAt(0);

        switch (str) {
            case '+':
                System.out.println("Считан плюс");
                break;
            case '=':
                System.out.println("Считано равно");
                break;
            default:
                System.out.println("Неизвестный оператор");
        }

        input.close();
    }
}
