public class ProfitInfo {
    public static void main(String[] args) {
        // Create random item
        String itemName = "Computer";

        //Computer buying Price
        int buyPrice = 500;

        //Computer selling Price
        int sellPrice = 700;

        // Define profit
        System.out.println(sellPrice - buyPrice);

        // profit amount
        int profit = 200;

        // Percentage of the profit
        System.out.println(profit * 100 / buyPrice);
    }
}
