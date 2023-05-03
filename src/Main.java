import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        Integer[] ints = randomInts(10, Integer.class);
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
        List<String> result = new ArrayList<>(Task.calcOccurance(words));
        System.out.println(result);


        List<String> result1 = new ArrayList<>(Task.findOccurance(words));
            System.out.println(result1);
    }



    public static <T> T[] randomInts(int size, Class<T> type) {
        T[] numbers = (T[]) Array.newInstance(type , size);
        for (int i = 0; i < size; i++) {
            if (type == Integer.class) {
                numbers[i] = (T) Integer.valueOf(ThreadLocalRandom.current().nextInt(size));
            } else if (type == Double.class) {
                numbers[i] = (T) Double.valueOf(ThreadLocalRandom.current().nextDouble(size));
            } else if (type == Long.class) {
                numbers[i] = (T) Long.valueOf(ThreadLocalRandom.current().nextLong(size));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return numbers;
    }

}
