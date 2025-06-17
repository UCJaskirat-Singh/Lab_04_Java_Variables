public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {

        double balance = 5000;
        double monthlyRate = 0.17 / 12;

        double interest1 = Math.round(balance * monthlyRate * 100.0) / 100.0;
        double newBalance1 = Math.round((balance + interest1) * 100.0) / 100.0;

        double interest2 = Math.round(newBalance1 * monthlyRate * 100.0) / 100.0;
        double newBalance2 = Math.round((newBalance1 + interest2) * 100.0) / 100.0;


        System.out.println("Month 1 interest: $" + interest1);
        System.out.println("Balance after 1 month: $" + newBalance1);
        System.out.println("Month 2 interest: $" + interest2);
        System.out.println("Balance after 2 months: $" + newBalance2);
    }
}
