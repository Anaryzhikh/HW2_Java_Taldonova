
import java.util.Arrays;
import java.util.StringJoiner;

public class HW_2 {
    public static void main(String[] args) {
//        task1();
//        isReverse();
//        StringBuilder sb = new StringBuilder("Строка");
//        isReverseRecurs(sb);
        System.out.println(Arrays.toString(mathString(3, 56)));
        replaceSymbol(mathString(3, 56));
        replaceSymbol2(mathString(3, 56));
    }
        // 1. Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
        static void task1() {
            // Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
            String stringFirst = "найти наименьшее окно в строке";
            String stringSecond = "содержащей все символы окно другой строки";
            String[] arr1 = stringFirst.split(" ");
            String[] arr2 = stringSecond.split(" ");
            String[] arr3 = new String[arr1.length > arr2.length ? arr1.length : arr2.length];
            System.out.println(Arrays.toString(arr1));
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].compareTo(arr2[j]) == 0){
                        arr3[count++] = arr1[i];
                    }
                }
            }
            System.out.println(Arrays.toString(arr3));
            int minLength = 100;
            String result = null;
            for (String each: arr3) {
                if (each != null && each.length() < minLength){
                    minLength = each.length();
                    result = each;
                }
            }
            System.out.println(result);
        }

        // 2. Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
        static void isReverse() {
            String stringFirst = "найти наименьшее окно в строке";
            String stringSecond = "екортс в онко еешьнемиан итйан";
            StringBuilder sb = new StringBuilder(stringFirst);
            String stringTemp = sb.reverse().toString();
            System.out.println(stringSecond.compareTo(stringTemp) == 0);
        }

        // 3. Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
        static StringBuilder isReverseRecurs (StringBuilder sb) {
            System.out.print(sb.charAt(sb.length()-1));
            if (sb.length() == 0) {
                return sb;
            }
            return isReverseRecurs(sb.deleteCharAt(sb.length()-1));
        }

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append()
        static String[] mathString(int x, int y){
            String[] result = new String[3];

                StringBuilder summ = new StringBuilder();
                summ.append(x);
                summ.append(" + ");
                summ.append(y);
                summ.append(" = ");
                summ.append(x + y);
                // System.out.println(summ.toString());
                StringBuilder minus = new StringBuilder();
                minus.append(x);
                minus.append(" - ");
                minus.append(y);
                minus.append(" = ");
                minus.append(x + y);
                // System.out.println(minus.toString());
                StringBuilder mult = new StringBuilder();
                mult.append(x);
                mult.append(" * ");
                mult.append(y);
                mult.append(" = ");
                mult.append(x + y);
                // System.out.println(mult.toString());

                result[0] = summ.toString();
                result[1] = minus.toString();
                result[2] = mult.toString();
                return result;
        }

        //5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        static String[] replaceSymbol(String[] arr){
            String[] result = new String[arr.length];
            StringBuilder sb = new StringBuilder(arr[0]);
            int searchIndex = sb.indexOf("=");
            sb.deleteCharAt(searchIndex);
            sb.insert(searchIndex, "Равно");
            // System.out.println(sb.toString());
            return result;
        }

        // 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    static String[] replaceSymbol2(String[] arr){
        String[] result = new String[arr.length];
        StringBuilder sb = new StringBuilder(arr[0]);
        int searchIndex = sb.indexOf("=");
        sb.replace(0, sb.length(), "равно");
        System.out.println(sb.toString());
        return result;
    }

    }


