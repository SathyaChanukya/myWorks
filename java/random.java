//Without user input
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class random {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Collections.shuffle(list);

        Integer[] shuffledArray = list.toArray(new Integer[0]);

        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

//With user input
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter " + numValues + " values:");
        for (int i = 0; i < numValues; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        Collections.shuffle(list);

        Integer[] shuffledArray = list.toArray(new Integer[0]);

        System.out.print("Shuffled Array: ");
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
