public class SymbolCount {
    /*Реализуйте алгоритм, определяющий, все л и символы в строке встречаются
    только один раз. А если при этом запрещено использование дополнительных
    структур данных?*/
    public static void main(String[] args) {
        String target = "asdff";
        char[] masSymbol = target.toCharArray();
        System.out.println(SymbolCount.isTrue(masSymbol));

        System.out.println(SymbolCount.isTrue2(target));

    }
    public static boolean isTrue(char[] mas) {
        int count = 0;
        for (int j = 0; j < mas.length; j++) {
            char findChar = mas[j];
            for (int i = 0; i < mas.length; i++) {
                if(mas[i] == findChar) {
                    if(++count > 1) {
                        return false;
                    }
                }
            }
            count = 0;
        }
        return true;
    }

    public static boolean isTrue2(String str) {
        boolean[] check = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(check[c]) {
                return false;
            }
            check[c] = true;
        }
        return true;
    }
}
