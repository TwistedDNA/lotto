import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crafted by TwistedDNA on 10/26/2017.
 */
public class SetOfSix {
    private List<Integer> sixNumbers;

    public SetOfSix() {
        //generate six numbers on creation
        this.sixNumbers = generateSixRandomNumbers();
    }

    private List<Integer> generateSixRandomNumbers(){
        //create list with numbers from 1 to 49
        List<Integer> mold = new ArrayList();
        for (int i=0;i<49;i++)
            mold.add(i);
        //shuffle numbers to get random order
        Collections.shuffle(mold);
        //cut 6 first numbers, which should be random in 1..49 range
        return mold.subList(0,6);
    }

    @Override
    public String toString() {
        StringBuffer formattedNumbers = new StringBuffer();
        for (Integer number : sixNumbers)
            //this format ensures stable width of columns for single- and double- digit numbers
            formattedNumbers.append(String.format("%4d",number));
        return formattedNumbers.toString();
    }

}
