package soal1;

public class Executive extends Employee {
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; // bonus has yet to be awarded
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus; // Sebelumnya di PDF kurang tanda "=" [cite: 236]
    }

    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}