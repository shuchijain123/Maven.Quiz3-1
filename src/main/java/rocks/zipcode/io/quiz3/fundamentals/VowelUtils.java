package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {


        {
            int i = 0;
            Boolean ans = false;

            for (i = 0; i < word.length(); i++)
                if ("AEIOUaeiou".indexOf(word.charAt(i)) != -1) {
                    ans = true;
                } else {
                    ans = false;
                }
            return ans;

        }
    }



    public static Integer getIndexOfFirstVowel(String word) {


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1)
                return word.indexOf(c);
        }
        return -1;
    }



    public static Boolean startsWithVowel(String word) {


        String vowels = "aeiou";
        Boolean ans= false;
        // Iterator String
        if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
            ans = true;
        }
        return ans;
    }


    public static Boolean isVowel(Character character) {
        return "AEIOUaeiou".indexOf(character) != -1;
    }
}
