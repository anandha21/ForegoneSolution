import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer testCase=scanner.nextInt();
        ArrayList<String> values=new ArrayList<>();
        while (values.size()<testCase){
            Integer newValues=scanner.nextInt();
            values.add(newValues.toString());
        }

        values.forEach(value->Main.splitValue(value));

    }

    private static void splitValue(String value) {
        int intValue= Integer.parseInt(value);
        int divident1;
        int divident2;
        int randomNum = ThreadLocalRandom.current().nextInt(1, intValue-1);
        System.out.println(randomNum);
        divident1=intValue-randomNum;
        divident2=randomNum;


        }
}