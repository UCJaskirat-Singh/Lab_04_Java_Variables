

    public class Lab_04_02_YearlyMaintenanceCost {
        public static void main(String[] args) {

            double springPrice = 550;
            double autumnPrice = 250;
            double summerPrice   = 400;
            double winterPrice = 450;

            double totalCost = springPrice + summerPrice + autumnPrice + winterPrice;

            System.out.println("Spring Maintenance Price: $" + springPrice);
            System.out.println("Autumn Maintenance Price: $" + autumnPrice);
            System.out.println("Summer Maintenance Price:   $" + summerPrice);
            System.out.println("Winter Maintenance Price: $" + winterPrice);
            System.out.println("Total Yearly Maintenance Cost: $" + totalCost);
        }
    }
