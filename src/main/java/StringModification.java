/*Существуют три вида модифицирующих операций со строками: вставка
символа, удаление символа и замена символа. Напишите функцию, которая
проверяет, находятся ли две строки на расстоянии одной модификации (или
нуля модификаций).*/
public class StringModification {
    public boolean isModification(String str, String str2) {
        if((str.length() == str2.length()) || (str.length() - str2.length() == Math.abs(1))) {
            //добавить проверку, а точно ли разница в одном символе?
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        StringModification stringModification = new StringModification();
        System.out.println(stringModification.isModification("asdf", "asdf"));
    }
}
