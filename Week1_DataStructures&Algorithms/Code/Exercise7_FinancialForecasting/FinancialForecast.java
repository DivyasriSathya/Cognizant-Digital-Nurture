package financial;

import java.util.Scanner;

public class FinancialForecast {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;  
        }
        return calculateFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current value (e.g., investment): ₹");
        double currentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.1 for 10%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = calculateFutureValue(currentValue, growthRate, years);

        System.out.printf("Future value after %d years = ₹%.2f\n", years, futureValue);
        
        sc.close();
    }
}

