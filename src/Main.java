import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int[] ints = randomInts(10);
        System.out.println("Array: " + Arrays.toString(ints));

        List<Integer> numbersList = new ArrayList<>(Task.toList(ints));
        System.out.println("List: " + numbersList);


        System.out.println("Uniq list: " + Task.findUnique(numbersList));


        List<String> words = new ArrayList<>();
        words.add("bird");
        words.add("cat");
        words.add("bird");
        words.add("cat");
        words.add("dog");
        words.add("bird");
        Task.calcOccurance(words);


        List<WordOccurance> list = new ArrayList<>(Task.findOccurance(words));
        
            System.out.println(list);
    }



    public static int[] randomInts(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(size);
        }
        return ints;
    }
}
