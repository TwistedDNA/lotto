import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lottomat {
    public static void main(String[] args) {
        //read number of sets
        Scanner scanner = new Scanner(System.in);
        int numberOfSets = scanner.nextInt();

        for (int i = 1; i <= numberOfSets; i++) {
            List<Integer> sixNumbers = generateSixRandomNumbers();
            String numbersInColumns = formatNumbersIntoColumns(sixNumbers);
            System.out.println(i + "/" + numbersInColumns);
        }
    }

    private static List<Integer> generateSixRandomNumbers() {
        //create list with numbers from 1 to 49
        List<Integer> mold = new ArrayList();
        for (int i = 0; i < 49; i++) {
            mold.add(i);
        }
        //shuffle numbers to get random order
        Collections.shuffle(mold);
        //cut 6 first numbers, which should be random in 1..49 range
        return mold.subList(0, 6);
    }

    public static String formatNumbersIntoColumns(List<Integer> numbers) {
        StringBuffer formattedNumbers = new StringBuffer();
        for (Integer number : numbers)
        //this format ensures stable width of columns for single- and double- digit numbers
        {
            formattedNumbers.append(String.format("%4d", number));
        }
        return formattedNumbers.toString();
    }
}
