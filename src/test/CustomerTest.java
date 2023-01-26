package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String args[]) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        
        System.out.println("\n<------------------->\n");
        
        customer.setID(2);
        customer.setIsNew(false);
        customer.setTotal(104.1F);
        customer.displayCustomerInfo();
    }
}
