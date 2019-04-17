package BudgetBuddi.Expenses.ExpsenseCategories.School;

import java.util.Date;

public class Fees
{

    private Date date;
    private double total;
    private double amount;

    public Fees(Date date, double total, double amount) {
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fees{" +
                "date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}
