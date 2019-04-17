package BudgetBuddi.Expenses.Expense;

import java.util.ArrayList;
import java.util.Date;

public class RegularExpsenses
{
    ArrayList<String> regularExpsensesList = new ArrayList<String>();

    private double amount;
    private double total;
    private String expenseName;

    public RegularExpsenses(ArrayList<String> regularExpsensesList, double amount, double total, String expenseName) {
        this.regularExpsensesList = regularExpsensesList;
        this.amount = amount;
        this.total = total;
        this.expenseName = expenseName;
    }//closes constructor

    public ArrayList<String> getRegularExpsensesList() {
        return regularExpsensesList;
    }

    public void setRegularExpsensesList(ArrayList<String> regularExpsensesList) {
        this.regularExpsensesList = regularExpsensesList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    @Override
    public String toString() {
        return "RegularExpsenses{" +
                "regularExpsensesList=" + regularExpsensesList +
                ", amount=" + amount +
                ", total=" + total +
                ", expenseName='" + expenseName + '\'' +
                '}';
    }
}//closes class
