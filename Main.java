package be.vdab;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println(stock.toString());
        System.out.println("Change percent: " + stock.getChangePercent());
    }
}
