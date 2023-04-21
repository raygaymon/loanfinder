package sg.edu.nus.iss;

import java.util.List;

public class Bank {

    private String bankName;
    private String location;
    private List<String> branches;
    private double loanInt;
    
    public Bank() {
    }

    

    public Bank(int loanInt) {
        this.loanInt = loanInt;
    }

    public Bank(String bankName, String location, List<String> branches, int loanInt) {
        this.bankName = bankName;
        this.location = location;
        this.branches = branches;
        this.loanInt = loanInt;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLoanInt () {
        return loanInt;
    }

    public void setLoanInt(int loanInt) {
        this.loanInt = loanInt;
    }

    

    @Override
    public String toString() {
        return "Bank [bankName = " + bankName + ", location = " + location + ", branches = " + branches + ", loanInt =" + loanInt + "]";
    }

    public void findLoan (int loanAmt, int repayTime) {

            if (loanAmt >= 500000 && loanAmt < 800000) {
                double interest = (100 + loanInt) / 100;
                int paymentPeriod = repayTime * 12;
                double monthlyPayment = (loanAmt * interest)/paymentPeriod;
                System.out.println("Your loan interest will be " + loanInt + "%. Your monthly payment is " + String.format("%.2f", monthlyPayment));

            }

            else if (loanAmt >= 800000 && loanAmt < 1000000) {
                double newLoanInt = (loanInt + 2);
                double interest = (100 + newLoanInt) / 100;
                int paymentPeriod = repayTime * 12;
                double monthlyPayment = (loanAmt * interest) / paymentPeriod;
                System.out.println("Your loan interest will be " + newLoanInt + "%. Your monthly payment is " + String.format("%.2f", monthlyPayment));

            }

            else if (loanAmt >= 1000000) {
                double newLoanInt = loanInt + 4;
                double interest = (100 + newLoanInt) / 100;
                int paymentPeriod = repayTime * 12;
                double monthlyPayment = (loanAmt * interest) / paymentPeriod;
                System.out.println("Your loan interest will be " + newLoanInt + "%. Your monthly payment is " + String.format("%.2f", monthlyPayment));

            }

            else {
                System.out.println("LOL you trying your luck");

            }
       
    }
    
}
