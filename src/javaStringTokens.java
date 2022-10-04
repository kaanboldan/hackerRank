import java.util.ArrayList;

public class javaStringTokens {

    static  void replaceUnderScore(String a)
    {

        a+=" ";
        a=a.replace('\'', ' ');
        a=a.replace(',', ' ');
        a=a.replace('!', ' ');
        a=a.replace('?', ' ');
        a=a.replace('.', ' ');
        a=a.replace('_', ' ');
        a=a.replace('@', ' ');

        ArrayList<String> words = new ArrayList<String>();
        String temp="";
        for (int i = 0; i < a.length(); i++) {

            boolean empty = a.substring(i, i + 1).trim().isEmpty();
            boolean trim= temp.trim().isEmpty();
            if (empty && !trim)
            {
                words.add(temp.trim());
                temp="";
            }
            else
                temp+=a.substring(i,i+1);
        }
        System.out.println(words.size());

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));

        }

    }

}
