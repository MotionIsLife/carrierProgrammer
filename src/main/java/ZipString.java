/*
* Реализуйте метод для выполнения простейшего сжатия строк с использова­
нием счетчика повторяющихся символов. Например, строка ааЬсссссааа пре­
вращается в а2b1с5а3. Если •сжатая� строка не становится короче исходной,
то метод возвращает исходную строку. Предполагается, что строка состоит
только из букв верхнего и нижнего регистра (a-z).
* */
public class ZipString {
    public static void main(String[] args) {
        System.out.println(compress("aasssff"));
    }

    static String compress(String str) {
        int finalLength = countCompression(str);
        if(finalLength >= str.length()) return str;

        StringBuilder compressed = new StringBuilder(finalLength);
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }

    static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {

        }
    }
}
