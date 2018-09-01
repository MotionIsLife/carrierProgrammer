/*Для двух строк напишите метод, определяющий, является ли одна строка
перестановкой другой.*/

public class StringTask {
    public static void main(String[] args) {
        String s1 = "asdf";
        String s2 = "fdsa";
        System.out.println(StringTask.checkAnagramm(s1, s2));
    }

    public static boolean checkAnagramm(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        boolean[] isCheck = new boolean[256];
        for (int i = 0; i < s1.length(); i++) {
            isCheck[s1.charAt(i)] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if(!isCheck[s2.charAt(i)]) {
                return false;
            }
        }
        return true;
    }
}
