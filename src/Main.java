public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 200.54;
        final double SALES_TAX_RATE = .05;
        double salesTax = 0;
        double totalPrice = 0;

        System.out.println("You said the price is " + purchasePrice);

        salesTax = purchasePrice + SALES_TAX_RATE;
        totalPrice = salesTax + purchasePrice;

        System.out.println("the sales tax is " + salesTax);
        System.out.println("the total cost is " + totalPrice);

        System.out.printf("Sales tax rounded is %6.2f", salesTax);
    }
}