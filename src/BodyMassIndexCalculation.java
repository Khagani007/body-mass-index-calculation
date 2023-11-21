import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters (like 1.72) : ");
        double height = input.nextDouble();

        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("You are healthy");
        } else if (bmi > 24.9 && bmi < 30) {
            System.out.println("You are overweight");
        } else if (bmi > 30) {
            System.out.println("You are obese");
        }
    }
}
