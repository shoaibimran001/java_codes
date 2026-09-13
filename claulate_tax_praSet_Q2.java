import java.util.Scanner;

public class claulate_tax_praSet_Q2 {

    public static void main(String[] args) {

        float income;
        float tax = 0;

        System.out.println("Enter your income in lakhs:");

        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat();

        if (income <= 2.5f) {
            tax = 0;
        }

        else if (income > 2.5f && income <= 5.0f) {
            tax = 0.05f * (income - 2.5f);
        }

        else if (income > 5.0f && income <= 10.0f) {
            tax = 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5.0f);
        }

        else if (income > 10.0f) {
            tax = 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (10.0f - 5.0f);
            tax = tax + 0.30f * (income - 10.0f);
        }
           System.out.println("The total tax to be paid is: " + tax + " lakhs");
    }
}


