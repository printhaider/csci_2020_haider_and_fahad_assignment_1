import java.text.DecimalFormat;
class OnSale implements Discount
{
        // This formats the item prices to 2 decimal places
    DecimalFormat df = new DecimalFormat("#.##");
    //This allows the item to be sent to the right visitor interface
    public OnSale() {
    }
        // Calculating tax
    public double employee(Regular regularItem)
    {
        System.out.println("Regular Item: Price plus Tax");
        return Double.parseDouble(df.format((regularItem.getPrice() * .13) + regularItem.getPrice()));
    }
        // Calculating tax
    public double employee(Electronic electronicItem)
    {
        System.out.println("Electronic Item: Price plus Tax");
        return Double.parseDouble(df.format((electronicItem.getPrice() * .13) + electronicItem.getPrice()));
    }
      // Since this is a necessity item, the item is not being taxed.
    public double employee(Essential essentialItem)
    {
        System.out.println("Essential Item: Price (no tax) ");
        return Double.parseDouble(df.format(essentialItem.getPrice()));
    }
}
