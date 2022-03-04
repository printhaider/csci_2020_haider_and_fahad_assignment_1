interface Visitable {
    // This allows the visitor to pass the object so the correct operations can happen to the right object.
    // accept() method is passed the same EmployeeDiscount obj
    // then the right method employee() (in the EmployeeDiscount obj) is called with the help of overloading
    public double accept(Discount discount);
}
