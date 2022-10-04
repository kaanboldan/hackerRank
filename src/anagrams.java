import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class anagrams {

    public boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();

        boolean isAnagram = false;

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < string1.length(); i++) {
            list1.add(string1.substring(i,i+1));
            list2.add(string2.substring(i,i+1));
        }
        Collections.sort(list1);
        Collections.sort(list2);

        for (int i = 0; i < a1.length; i++) {
            if (list1.get(i).contains( list2.get(i))) {
                isAnagram = true;
            } else {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;

    }
}
