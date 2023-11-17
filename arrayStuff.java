import java.util.Random;
import java.util.Scanner;
public class arrayStuff {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%5d", dataPoints[i]);
            if (i % 20 == 0 && i != 0) {
                System.out.println("");
            }
        }
        System.out.println();
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        for(int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = (double) sum / dataPoints.length;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);

        int value = safeInput.getRangedInt(scanner, "Enter your number: ", 1, 100);
        int frequency = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == value)
            {
                frequency++ ;
            }
        }
        System.out.print("\nYour number appears " + frequency + " times.");
        int index = safeInput.getRangedInt(scanner, "Enter another number: ", 1, 100);
        boolean found = false;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == index)
            {
                System.out.println("Your number was found in array index: " + i);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Your number was not found in the array.");
        }

        int max = dataPoints[0];
        int min = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The maximum value of the array is: " + max);

        for(int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
        }
        System.out.println("The minimum value of the array is: " + min);
    }
}