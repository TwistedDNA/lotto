import java.util.Scanner;

/**
 * Crafted by TwistedDNA on 10/26/2017.
 */
public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSets = scanner.nextInt();
        printSetsOfNumbers(numberOfSets);
    }

    private static void printSetsOfNumbers(int times){
        for (int i=1;i<=times;i++){
            SetOfSix sixDistinctNumbers = new SetOfSix();
            //numbers are already formatted in toString() method
            System.out.println(i+"/"+sixDistinctNumbers);
        }
    }
}
