package sg.edu.nus.iss;

import java.util.List;

public class DBSBank extends Bank {
    private int cashBack;

    public int getCashBack() {
        return cashBack;
    }

    public void setCashBack(int cashBack) {
        this.cashBack = cashBack;
    }

    public DBSBank(String bankName, String location, List<String> branches, int loanInt, int cashBack) {
        super(bankName, location, branches, loanInt);
        this.cashBack = cashBack;
    }

    public DBSBank(int loanInt) {
        super(loanInt);
    }

    @Override
    public void findLoan (int loanAmt, int repayTime) {


            double dbsLoan = super.getLoanInt()*0.85;

            if (loanAmt >= 500000 && loanAmt < 800000) {
                
                double monthlyPayment = (loanAmt * ((100 + dbsLoan)/100)) / (repayTime * 12);
                double monthlySavings = ((loanAmt * ((100 + super.getLoanInt())/100)) / (repayTime * 12)) - monthlyPayment;
                System.out.println("Your loan interest will be " + dbsLoan + "%. Your monthly payment is " + String.format("%.2f", monthlyPayment) + ". You save " + String.format("%.2f", monthlySavings) + " per month thanks to DBS.");

            }

            else if (loanAmt >= 800000 && loanAmt < 1000000) {
                double newDBSLoan = dbsLoan + 2;
                double monthlyPayment = (loanAmt * ((100 + newDBSLoan) / 100)) / (repayTime * 12);
                double monthlySavings = ((loanAmt * ((100 + (super.getLoanInt() + 2)) / 100)) / (repayTime * 12)) - monthlyPayment;
                System.out.println("Your loan interest will be " + newDBSLoan + "%. Your monthly payment is "+ String.format("%.2f", monthlyPayment) + ". You save " + String.format("%.2f", monthlySavings) + " per month thanks to DBS. ");

            }

            else if (loanAmt >= 1000000) {
                double newDBSLoan = dbsLoan + 4;
                double monthlyPayment = (loanAmt * ((100 + newDBSLoan) / 100)) / (repayTime * 12);
                double monthlySavings = ((loanAmt * ((100 + (super.getLoanInt() + 4)) / 100)) / (repayTime * 12)) - monthlyPayment;
                System.out.println("Your loan interest will be " + newDBSLoan + "%. Your monthly payment is " + String.format("%.2f", monthlyPayment) + ". You save " + String.format("%.2f", monthlySavings) + " per month thanks to DBS. ");
           }
            

            else {
                System.out.println("LOL you trying your luck");

            }

    }

}
