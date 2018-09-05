/*
* Напишите функцию, которая проверяет, является ли заданная строка переста­
новкой палиндрома. (Палиндром - слово или фраза, одинаково читающиеся
в прямом и обратном направлении; перестановка - строка, содержащая те
же символы в другом порядке.) Палиндром не ограничивается словами из
словаря.
Пример:
Ввод: Tact Соа
Вывод: True ( пе рестановки : "taco cat " , " atco cta " , и т . д . )
* */
public class Palindrom {
    boolean isPermutationOfPalindrome(String phrase) {
        int [] table = buildCharFrequencytable(phrase) ;
        return checkMaxOneOdd(table) ;
    }

    //Проверяем, что с имволов с нечетным количеством вхождений не более 1 . •/
    boolean checkMaxOneOdd ( int [ ] table) {
        boolean foundOdd = false;
        for ( int count : table) {
            if ( count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
     }

     int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z) {
            return val - a;
        } else if(A <= val && val <= Z) {
            return val - A;
        }
        return -1;
     }

     int[] buildCharFrequencytable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
         for (char c : phrase.toCharArray()) {
             int x = getCharNumber(c);
             if(x != -1) {
                table[x]++;
             }
         }
         return table;
     }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.isPermutationOfPalindrome2("sdfhasdf"));
    }

    //вариант 2
    boolean isPermutationOfPalindrome2( String phrase) {
        int countOdd = 0 ;
        int [] table = new int[ Character.getNumericValue ('z' ) - Character.getNumericValue ('a' ) + 1] ;
        for (char c : phrase.toCharArray()) {
            int х = getCharNumber(c) ;
            if (х != - 1) {
                table[х]++;
                if (table[х] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1 ;
    }


}
