import java.util.Scanner;

public class FloatingPointAnalysis {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        float total = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter floating-point value #" + (count + 1) + ": ");
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                scanner.next(); 
            }
        }

        float average = total / 5;
        float interest = total * 0.20f;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

    }
}