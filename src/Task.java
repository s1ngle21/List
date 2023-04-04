import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    //    1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
    public static int countOccurance(List<String> words, String str) {
        int count = 0;
        for (String word : words) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }


//    2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
//    Конвертувати масив у список відповідного типу даних та повернути з методу.
//            Наприклад:
//    Було Array [1, 2, 3]
//    Стало List [1, 2, 3]

    public static List<Integer> toList(int[] ints) {
        List<Integer> list = new ArrayList<>();
        for (int number : ints) {
            list.add(number);
        }
        return list;
    }


//    3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень,
//    які можуть повторюватися в необмеженій кількості. Необхідно повернути новий числовий список, що містить тільки унікальні числа.

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqList = new ArrayList<>();
        List<Integer> CheckedNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!CheckedNumbers.contains(number)) {
                uniqList.add(number);
                CheckedNumbers.add(number);
            }
        }
        return uniqList;
    }


//    4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
//    Наприклад:
//    bird: 2
//    fox: 1
//    cat: 1

    public static void calcOccurance(List<String> words) {
        Collections.sort(words);
        int cnt = 1;
        String currWord = words.get(0);

        for (int i = 1; i < words.size(); i++) {
            String nextWord = words.get(i);
            if (currWord.equals(nextWord)) {
                cnt++;
            } else {
                System.out.println(currWord + ": " + cnt);
                currWord = nextWord;
                cnt = 1;
            }
        }
        System.out.println(currWord + ": " + cnt);
    }


//    5. *** Створити метод findOccurance, що приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Обчислити скільки разів трапляється кожне слово. Результат повернути у вигляді списку структур,
//    що описують повторення кожного окремого взятого слова.
//    Наприклад:
    //  [
//    {name: "bird", occurrence: 2},
//    {name: "fox", occurrence: 1},
//    {name: "cat", occurrence: 1}
    // ]

    public static List<WordOccurance> findOccurance(List<String> words) {
        List<WordOccurance> structure = new ArrayList<>();
        Collections.sort(words);
        int cnt = 1;
        String currWord = words.get(0);

        for (int i = 1; i < words.size(); i++) {
            String nextWord = words.get(i);
            if (currWord.equals(nextWord)) {
                cnt++;
            } else {
                structure.add(new WordOccurance(currWord, cnt));
                currWord = nextWord;
                cnt = 1;
            }
        }
        structure.add(new WordOccurance(currWord, cnt));
        return structure;
    }
}
