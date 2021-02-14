// CSE 110     : <Class 15817> / <meeting days and times>
// Assignment  : <assignment 03>
// Author      : <Glen Asare> & <1209416374>
// Description : <This program determines if a person should sell, hold or buy a stock buy collecting input and
// doing calculations>
//TA    : Sachin Chhabra
import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current_shares;
        double market_price;
        double purchase_price;
        double availabel_funds;


        System.out.println("What is your current shares? ");
        current_shares = scanner.nextInt();
        System.out.println("What is the market price? ");
        market_price = scanner.nextDouble();
        System.out.println("What is the purchase price? ");
        purchase_price = scanner.nextDouble();
        System.out.println("What is your available funds? ");
        availabel_funds = scanner.nextDouble();

        //Total cost of the shares we are buying
        double transactionFee = 10;

        //Shares we can afford
        int numberofSharesToBuy = (int) Math.floor(((availabel_funds - transactionFee)) / market_price);
        System.out.println(numberofSharesToBuy);

        double afterTransaction = availabel_funds - transactionFee;
        int totalBuyCost = (int) (transactionFee + market_price * numberofSharesToBuy);
        System.out.println(totalBuyCost);

        //potential per share
        double perShareBuyValue = (purchase_price - market_price);
        System.out.println(perShareBuyValue);
        double totalBuyValue = perShareBuyValue * numberofSharesToBuy;
        System.out.println(totalBuyValue);
        double perShareSellValue = market_price - purchase_price;
        System.out.println(perShareSellValue);
        double totalSellValue = (perShareSellValue * current_shares);
        System.out.println(totalSellValue);

        if (totalBuyValue > 0 && perShareBuyValue > 0) {
            System.out.println("Buy " + numberofSharesToBuy + " shares");
        } else if (totalSellValue > 0 && perShareSellValue > 0 &&totalBuyValue!=0&&totalBuyValue!=10) {
            System.out.println("Sell " + current_shares + " Shares");
        }
        if (totalBuyValue == 0||totalBuyValue==10) {
            System.out.println("Hold Shares");
        }

    }
}