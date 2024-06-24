import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ScannerExeption, NumberFormatException{
        Scanner scan = new Scanner(System.in);
        Math math = new Math();
        System.out.println("Введите данные: ");
        String str = scan.nextLine();
        try {
            math.action(str);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Первое выражение обязательно должно быть строкой и " +
                    "вводится в ковычках");
        }
        catch (NumberFormatException e) {
            System.out.println("Строка должна вводится в ковычках, а операторами могут являтся только +, -, *, / ");
        }
    }
}