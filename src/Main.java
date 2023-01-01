import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberTestCases = input.nextInt();
        int caseNumber = 1;
        while (numberTestCases != 0) {
            BigInteger jamCoins = input.nextBigInteger();
            String jamCoinsAsString = jamCoins.toString();
            String checkAmountA = "";
            String checkAmountB = "";

            for (int i = 0; i < jamCoinsAsString.length(); i++) {
                if (jamCoinsAsString.charAt(i) == '4') {
                    checkAmountA += '3';
                    checkAmountB += "1";
                }else{
                    checkAmountA += jamCoinsAsString.charAt(i);
                    checkAmountB += "0";
                }

            }
            System.out.println("Case #" + caseNumber + ": " + checkAmountA + " " + checkAmountB);

            caseNumber++;
            numberTestCases--;
        }
    }
}


