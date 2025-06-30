// Q6- Implement Bank base class and subclass (example SBI)

public class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) { this.headOfficeAddress = headOfficeAddress; }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) { this.personalLoanInterestRate = personalLoanInterestRate; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) { this.homeLoanInterestRate = homeLoanInterestRate; }

    public String toString() {
        return getName() + " " + getHeadOfficeAddress() + " " + getChairmanName() +
                " " + getBranchCount() + " " + getFdInterestRate() + " " +
                getPersonalLoanInterestRate() + " " + getHomeLoanInterestRate();
    }
}

public class SBI extends Bank {
    public SBI() {
        setName("SBI");
        setHeadOfficeAddress("Mumbai, India");
        setChairmanName("Dinesh Kumar");
        setBranchCount(220);
        setFdInterestRate(6.5);
        setPersonalLoanInterestRate(11);
        setHomeLoanInterestRate(15);
    }
}
