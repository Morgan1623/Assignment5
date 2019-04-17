package BudgetBuddi.Expenses.ExpsenseCategories.Tax;



public class IncomeTax
{
    private int year;
    private double total;

    public IncomeTax(int year, double total) {
        this.year = year;
        this.total = total;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "IncomeTax{" +
                "year=" + year +
                ", total=" + total +
                '}';
    }
}
