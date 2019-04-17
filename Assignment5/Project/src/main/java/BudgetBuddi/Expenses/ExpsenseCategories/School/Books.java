package BudgetBuddi.Expenses.ExpsenseCategories.School;

import java.util.Date;

public class Books
{
    private String description;
    private Date date;
    private double total;
    private double amount;

    public Books(String description, Date date, double total, double amount) {
        this.description = description;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Books{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}
