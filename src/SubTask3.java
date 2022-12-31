import java.util.Random;
import java.util.Scanner;

public class SubTask3 {

    public static void main(String[] args) {

            Scanner inputScanner = new Scanner(System.in);
            int hiddenNumber = new Random().nextInt(100) + 1;

            System.out.println("Угадайте число от 1 до 100: ");
            int inputNumber = inputScanner.nextInt();

             while(inputNumber != hiddenNumber){

                 if (inputNumber > hiddenNumber) {
                     System.out.println("Больше");
                     inputNumber = inputScanner.nextInt();
                 } else {
                     System.out.println("Меньше");
                     inputNumber = inputScanner.nextInt();
                 }
            }
             System.out.println("Молодец!");
    }
}
