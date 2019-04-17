package BudgetBuddi.Expenses.Expense;

import BudgetBuddi.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;

import java.util.ArrayList;
import java.util.Date;

public class Expense
{
    ArrayList<TotalCategoryExpense> totalAllExpsenses = new ArrayList<TotalCategoryExpense>();

   private double amount;
   private Date date;
   private double total;

    public Expense(ArrayList<TotalCategoryExpense> totalAllExpsenses, double amount, Date date, double total) {
        this.totalAllExpsenses = totalAllExpsenses;
        this.amount = amount;
        this.date = date;
        this.total = total;
    }//closes constructor

    public ArrayList<TotalCategoryExpense> getTotalAllExpsenses() {
        return totalAllExpsenses;
    }

    public void setTotalAllExpsenses(ArrayList<TotalCategoryExpense> totalAllExpsenses) {
        this.totalAllExpsenses = totalAllExpsenses;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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

    @Override
    public String toString() {
        return "Expense{" +
                "totalAllExpsenses=" + totalAllExpsenses +
                ", amount=" + amount +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}//closes class
