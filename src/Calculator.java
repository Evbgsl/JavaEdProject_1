import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean isFirstInput = true;      // для первого числа
        boolean isFirstOperation = true;  // пока не было ни одной операции

        while (true) {
            if (isFirstInput) {
                // ввод первого числа
                // test_commit_2_3_4+new_branch+2+3
                System.out.print("Введите число: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка: нужно ввести число!");
                    scanner.next(); // очищаем неправильный ввод
                    System.out.print("Введите число: ");
                }
                result = scanner.nextDouble();
                isFirstInput = false;
            }

            // выводим сообщение про накопительный итог только после первой операции
            if (!isFirstOperation) {
                System.out.print("""
                        Желаете продолжить работу с накопительным итогом?
                        Если да – введите операцию (+, -, *, /),
                        иначе – введите C для сброса или S для выхода из программы:""");
            } else {
                System.out.print("Введите операцию (+, -, *, /) или C (сброс), S (выход): ");
            }

            String opInput = scanner.next().toLowerCase();
            char operation = opInput.charAt(0);

            // выход
            if (operation == 's') {
                System.out.println("Выход из программы...");
                break;
            }

            // сброс (латиница + кириллица)
            if (operation == 'c' || operation == 'с') {
                result = 0;
                isFirstInput = true;
                isFirstOperation = true; // сброс операций
                System.out.println("Результат сброшен.");
                continue;
            }

            // проверка допустимых операций
            if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                System.out.println("Ошибка: операция не поддерживается! Проверьте корректность введенных данных.");
                continue;
            }

            // ввод второго числа
            System.out.print("Введите следующее число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: нужно ввести число!");
                scanner.next(); // очищаем неправильный ввод
                System.out.print("Введите следующее число: ");
            }
            double secondOperand = scanner.nextDouble();

            double oldResult = result; // сохраняем предыдущий результат

            switch (operation) {
                case '+':
                    result += secondOperand;
                    break;
                case '-':
                    result -= secondOperand;
                    break;
                case '*':
                    result *= secondOperand;
                    break;
                case '/':
                    if (secondOperand != 0) {
                        result /= secondOperand;
                    } else {
                        System.out.println("Ошибка: деление на ноль!");
                        continue;
                    }
                    break;
            }

            isFirstOperation = false; // теперь уже была операция

            // вывод вычисления
            System.out.println("Вычисление: " + oldResult + " " + operation + " " + secondOperand + " = " + result);
            System.out.println("Текущий результат: " + result);
        }
    }
}
