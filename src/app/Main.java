package app;
public class Main {

    public static void main(String[] args) {

        String product;
        int no;
        int days;

        double price;
        String currency;
        int quantity;

        double totalAmount;
        double amountByDay;

        currency = "EUR";

        product = "smartphone";
        no = 1;
        days = 5;
        price = 810.2273333333333;
        quantity = 15;

        totalAmount = price * quantity;
        amountByDay = totalAmount / days;
        System.out.printf("Product No %d: %s,%ntotal sales for %d days is %s %.2f,%nsales by day is %s %.2f.%n",
                no, product, days, currency, totalAmount, currency, amountByDay);

        product = "laptop";
        no = 2;
        days = 7;
        price = 806.680769;
        quantity = 13;

        totalAmount = price * quantity;
        amountByDay = totalAmount / days;
        System.out.printf("Product No %d: %s,%ntotal sales for %d days is %s %.2f,%nsales by day is %s %.2f.%n",
                no, product, days, currency, totalAmount, currency, amountByDay);
    }
}
