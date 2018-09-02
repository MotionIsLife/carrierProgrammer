/*
* Напишите метод, заменяющий все пробелы в строке символами ' %20 ' . Можете
считать, что длина строки позволяет сохранить дополнительные символы,
а фактическая длина строки известна заранее. ( Примечание: при реализации
метода наj ava для выполнения операции •на месте• используйте символьный
массив.)
Пример:
Ввод: "Mr John Smith",
Вывод: "Mr%20John%20Smith"
*/
public class ReplaceSpace {
    public static void main(String[] args) {
        String target = "asdf asdf asdf      ";
        int length = 14;
        String symbol = "%20";
        System.out.println(target);
        System.out.println(ReplaceSpace.replaceSpaces(target.toCharArray(), length));
    }

    public static String replace(String target, String symbol) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = target.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i] == 32 ? symbol : chars[i]);
        }
        return stringBuilder.toString();
    }

    public static String replace2(String target, String symbol) {
        int spaceCount = (target.length() - target.replaceAll(" ", "").length()) * (symbol.length()-1);
        char[] chars = target.toCharArray();
        char[] symbols = symbol.toCharArray();
        char[] result = new char[chars.length + spaceCount];
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                result[j] = symbols[0];
                result[j+1] = symbols[1];
                result[j+2] = symbols[2];
                j+=3;
            } else {
                result[j] = chars[i];
                ++j;
            }
        }
        return String.valueOf(result);
    }

    public static String replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newlength , i ;
        for ( i = 0; i < length ; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newlength = length + spaceCount * 2 ;
        str[newlength] = '\n';
        for (i = length - 1 ; i >= 0 ; i--) {
            if ( str [i] == ' ') {
            str[newlength - 1] = '0';
            str[newlength - 2] = '2';
            str[newlength - 3] = '%';
            newlength = newlength - 3;
        } else {
            str[newlength - 1] = str [i] ;
            newlength = newlength - 1 ;
        }
    }
        return String.valueOf(str);
    }
}
