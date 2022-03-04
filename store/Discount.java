// The visitor pattern is used when you have to perform repetitive actions on different object types
interface Discount {

    public double employee(Regular regularItem);
    public double employee(Electronic electronicItem);
    public double employee(Essential essentialItem);

}
