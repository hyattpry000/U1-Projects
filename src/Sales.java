public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    
    
       public static void main(String[] args) {

        double salePrice;
        double amount;
        double tax;
        double sale;

        salePrice = Double.parseDouble(JOptionPane.showInputDialog("What is the price?"));
        sale = Double.parseDouble(JOptionPane.showInputDialog("What is the discount?"));
        amount = Double.parseDouble(JOptionPane.showInputDialog("How many are you buying?"));
        tax = Double.parseDouble(JOptionPane.showInputDialog("What is the sales tax?"));

        double realTax = tax * .01;
        double realSale = 1 - (sale * .01);
        double subtotal = ((salePrice * realSale * amount) / 10) * 10;
        double taxTotal = ((subtotal * realTax) / 10) * 10;
        double totalCost = ((subtotal + taxTotal) / 10) * 10;


        System.out.println("SubTotal is: )" + subtotal);


        System.out.println("Tax total is : " + taxTotal);

        System.out.println("Total Cost is: " + totalCost);


    }
}
