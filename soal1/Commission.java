package soal1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    // Method untuk menambahkan total penjualan [cite: 16]
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay() {
       
        double payment = super.pay() + (totalSales * commissionRate);
        
        
        totalSales = 0.0;
        
        return payment;
    }

    @Override
    public String toString() {
        // Memanggil method toString() parent, lalu menambahkan total penjualan [cite: 19]
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}