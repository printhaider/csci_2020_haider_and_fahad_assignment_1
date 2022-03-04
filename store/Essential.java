class Essential implements Visitable
{
    private double priceOfItem;
    Essential(double item)
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
    }
}