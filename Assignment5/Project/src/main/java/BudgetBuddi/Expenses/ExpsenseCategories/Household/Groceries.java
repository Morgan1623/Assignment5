package BudgetBuddi.Expenses.ExpsenseCategories.Household;

import java.util.Date;

public class Groceries
{
    private String items;
    private double price;
    private Date date;
    private double total;
    private double amount;

    public Groceries(String items, double price, Date date, double total, double amount) {
        this.items = items;
        this.price = price;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return "GroceriesFactory{" +
                "items='" + items + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}
