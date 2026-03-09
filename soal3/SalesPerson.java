package soal3;

public class SalesPerson implements Comparable {
    private String firstName, lastName; 
    private int totalSales; 

  
    public SalesPerson(String first, String last, int sales) {
        firstName = first; 
        lastName = last; 
        totalSales = sales;
    }

   
    public String toString() {
  
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

 
    public boolean equals(Object other) {
       
        return (lastName.equals(((SalesPerson) other).getLastName()) &&
                firstName.equals(((SalesPerson) other).getFirstName()));
    }

   
    public int compareTo(Object other) {
        int result;
        SalesPerson otherSalesPerson = (SalesPerson) other;

        if (this.totalSales != otherSalesPerson.getSales()) {
            
            result = this.totalSales - otherSalesPerson.getSales();
        } else {
           
            int lastCompare = this.lastName.compareTo(otherSalesPerson.getLastName());
            
            if (lastCompare != 0) {
                result = lastCompare;
            } else {
             
                result = this.firstName.compareTo(otherSalesPerson.getFirstName());
            }
        }
        
        return result;
    }

    
    public String getFirstName() {
        return firstName; 
    }

  
    public String getLastName() {
        return lastName; 
    }


    public int getSales() {
        return totalSales;
}
}