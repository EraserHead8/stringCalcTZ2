import java.lang.invoke.SwitchPoint;

public class Math {
    String[] mas, mas2;
    String str1, ope, str2;
    byte num, num2;

    void action(String str) throws ArrayIndexOutOfBoundsException, ScannerExeption {
        /*if (str.charAt(0) != '\"') {
            try{
                throw new ScannerExeption("первое");
            }
            catch(ScannerExeption e){
                System.out.println(e.getMessage());
            }

        }*/

        if (str.charAt(str.length() - 1) == '\"') {
            mas = str.split("\"");
            str1 = mas[1];
            ope = mas[2];
            str2 = mas[3];

            switch (ope) {
                case " + ":
                    System.out.println(str1.concat(str2));
                    break;
                case " - ":
                    System.out.println(str1.replace(str2, ""));
            }
        } else {
            mas = str.split("\"");
            str1 = mas[1];
            ope = mas[2];
            mas2 = ope.split(" ");
            ope = mas2[1];
            try{
                num = Byte.parseByte(mas2[2]);
            }
            catch (NumberFormatException e){
                System.out.println("Строка должна вводится в ковычках");
            }
            switch (ope) {
                    case "*":
                        if (num <= 1 || num >= 10) {
                            try {
                                throw new ScannerExeption("Допускаетс ввод чисел от 1 до 10");
                            }
                            catch (ScannerExeption e){
                                System.out.println(e.getMessage());
                                break;
                            }
                        }
                        String s1 = str1, s2 = str1;
                        for (int i = 0; i < num - 1; i++) {
                            s1 += s2;
                        }
                        if (s1.length() > 40) {
                            System.out.println(s1.substring(0, 40) + "...");
                        } else {
                            System.out.println(s1);
                        }
                        break;
                    case "/":
                        if (num <= 1 || num >= 10) {
                            try {
                                throw new ScannerExeption("Допускаетс ввод чисел от 1 до 10");
                            }
                            catch (ScannerExeption e){
                                System.out.println(e.getMessage());
                            }
                        }
                        num2 = (byte) str1.length();
                        num = (byte) (num2 / num);
                        System.out.println(str1.substring(0, num));
                }

        }
    }
}

