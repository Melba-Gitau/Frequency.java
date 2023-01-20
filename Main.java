import java.util.Random;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int [] num = new int[10];
	    //generate random n.o;
	    Random rand = new Random();
	    for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10) + 1;
        }
         // Print the array
        System.out.println("Numbers: " + Arrays.toString(num));
        
        // Calculate the average
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = sum / num.length;
        System.out.println("Average: " + average);
        
        // Count the number of times each number appears in the array
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == i) {
                    count++;
                }
            }
            System.out.println(i + " appears " + count + " times");
        }
    }
}





