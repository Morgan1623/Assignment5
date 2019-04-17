package BudgetBuddi.Expenses.ExpsenseCategories.Car;

import java.util.Date;

public class Insurance
{
    private String insuranceName;
    private Date date;
    private double total;
    private double amount;

    public Insurance(String insuranceName, Date date, double total, double amount) {
        this.insuranceName = insuranceName;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }// constructor

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
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
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}//closes  class
