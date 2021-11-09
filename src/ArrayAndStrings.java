import java.util.ArrayList;

public class ArrayAndStrings {

    ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w : words) sentence.add(w);
        for(String w: more) sentence.add(w);
        return sentence;
    }

    String joinWords(String[] words){
        StringBuilder sentence = new StringBuilder();
       for(String w: words) sentence.append(w);

       return sentence.toString();

    }

    public static void main(String[] args) {

        String[] words = {"Hola", "Hello"};
        String[] more = {"Pineda"};
        ArrayAndStrings arr = new ArrayAndStrings();

        ArrayList<String> arreglo  = arr.merge(words, more);
        System.out.println(arreglo);

        String word = arr.joinWords(words);
        System.out.println(word);

    }

}
