package BudgetBuddi.Expenses.ExpsenseCategories.Personal;

import java.util.Date;

public class Clothes
{
    private String description;
    private Date date;
    private double total;
    private double amount;

    public Clothes(String description, Date date, double total, double amount) {
        this.description = description;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}
