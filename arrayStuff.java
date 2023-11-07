import java.util.Random;
public class arrayStuff {
    public static void main(String[] args) {
        Random random = new Random();
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
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }
        average = (double) sum / dataPoints.length;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
    }
}