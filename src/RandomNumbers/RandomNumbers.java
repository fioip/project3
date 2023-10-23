package RandomNumbers;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int int_numbers;

        do{
            int_numbers = random.nextInt(100);
            System.out.println("Random number: " + int_numbers);
        }while (int_numbers != 42);

        if (int_numbers == 42)
            System.out.println("You found the number " + int_numbers + "!");
    }
}
