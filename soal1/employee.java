package soal1;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }

    @Override
    public double pay() {
        return payRate;
    }
}