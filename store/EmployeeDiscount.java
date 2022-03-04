
import java.text.DecimalFormat;
class EmployeeDiscount implements Discount {
    DecimalFormat df = new DecimalFormat("#.##"); //formats item price
    //This allows the item to be sent to the right visitor interface
    public EmployeeDiscount() {
    }
        // Calculating discount + tax on a regular item (non - electronic)
    public double employee(Regular regularItem) {
        System.out.println("Regular Item: Price after discount ( plus tax)");
        return Double.parseDouble(df.format((regularItem.getPrice() * .70) +regularItem.getPrice()*.13 ));
    }
        // Calculating discount + tax on a electronic item
    public double employee(Electronic electronicItem) {
        System.out.println("Electronic Item: Price after discount ( plus tax)");
        return Double.parseDouble(df.format((electronicItem.getPrice() * .90) +electronicItem.getPrice()*.13));
    }
        // Since this is a necessity item, the item is does not come with a discount as the store is not making money from it, along with that no tax is being charged.
    public double employee(Essential essentialItem) {
        System.out.println("Essential Item: Price after discount");
        return Double.parseDouble(df.format(essentialItem.getPrice()));
    }

}