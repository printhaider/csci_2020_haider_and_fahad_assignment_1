
class Electronic implements Visitable
{
    private double priceOfItem;
    Electronic(double item)
    {
        priceOfItem = item;
    }
    public double accept(Discount discount)
    {
        return discount.employee(this);
    }
    public double getPrice()
    {
        return priceOfItem;
    } //getting price of item
}
