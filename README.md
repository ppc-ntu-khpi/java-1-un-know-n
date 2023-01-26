### Customer class code
```java
package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private float total;
    
    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 999.9F;
    }
    
    public void displayCustomerInfo() {
        System.out.println("ID: " + this.ID);
        System.out.println("Is customer new - " + this.isNew);
        System.out.println("Total amount of purchase: " + this.total);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
```

### Program
![Image alt](https://github.com/ppc-ntu-khpi/java-1-un-know-n/blob/main/Solution/advanced.png)