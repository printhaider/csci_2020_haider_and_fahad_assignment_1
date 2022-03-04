/**
 * This assignment was made to help us understand a design pattern of our choice
 * For this assignment, me and my partner chose to implement a Visitor pattern.
 * We decided to implement a employee discount system where it can calculate the discount + tax on
 * different items based on what the employers rules are. We chose this example as we experience this in our
 * day-to-day lives. We have 3 different categories on which the discount is applied on: Essential, Regular, and Electronics.
 * This is a perfect example to use the visitor pattern as we have to perform the same action (being the categorized discount) on
 * many objects of different types.
 *
 * @author Haider Bajwa , Fahad Fauzan
 * @version: 1.0

 */
public class visitorTest {
    public static void main(String[] args) {
        EmployeeDiscount taxAndDiscCalc = new EmployeeDiscount();
        OnSale onSaleDiscount = new OnSale();
        Essential sanitaryPads = new Essential(10.99);
        Regular gum = new Regular(2.99);
        Electronic camera = new Electronic(199.99);
        System.out.println(sanitaryPads.accept(taxAndDiscCalc) + "\n");
        System.out.println(camera.accept(taxAndDiscCalc) + "\n");
        System.out.println(gum.accept(taxAndDiscCalc) + "\n");
        System.out.println("Items on sale price: \n");
        System.out.println("(When an item is on sale, the employee recieves no discount)\n");
        System.out.println(gum.accept(onSaleDiscount) + "\n");
        System.out.println(sanitaryPads.accept(onSaleDiscount) + "\n");
        System.out.println(camera.accept(onSaleDiscount) + "\n");
    }
}
