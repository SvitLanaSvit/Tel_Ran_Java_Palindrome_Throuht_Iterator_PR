import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeWith2ListIterators("dom"));
        System.out.println(palindromeWith2ListIterators("Madam"));
        System.out.println(palindromeWith2ListIterators("mama"));
        System.out.println(palindromeWith2ListIterators("moom"));
    }

    public static boolean palindromeWith2ListIterators(String str) {
        String s = str.toLowerCase();
        char[] charsArray = s.toCharArray();
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> linkedListCopy = new LinkedList<>();
        for (char charAr: charsArray) {
            linkedList.add(charAr);
            linkedListCopy.add(charAr);
        }

        ListIterator<Character> iteratorNext = linkedList.listIterator();
        ListIterator<Character> iteratorPrevious = linkedListCopy.listIterator(charsArray.length);

        for (int i = 0; i < linkedList.size() / 2; i++) {
            if (iteratorNext.next() != iteratorPrevious.previous()){
                return false;
            }
        }
        return true;
    }
}


