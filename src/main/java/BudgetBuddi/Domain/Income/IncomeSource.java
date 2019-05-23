package BudgetBuddi.Domain.Income;

import java.util.Date;

public class IncomeSource
{
    private String description;
    private Date date;
    private double total;
    private double amount;

    public IncomeSource(Builder builder) {
        this.description = builder.description;
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }

    public String getDescription() {
        return description;
    }


    public Date getDate() {
        return date;
    }


    public double getTotal() {
        return total;
    }


    public double getAmount() {
        return amount;
    }

    public static class Builder
    {

        private String description;
        private Date date;
        private double total;
        private double amount;

        public Builder description(String description)
        {
            this.description=description;
            return this;
        }

        public Builder date(Date date)
        {
            this.date=date;
            return this;
        }


        public Builder total(double total)
        {
            this.total=total;
            return this;
        }

        public Builder amount(double amount)
        {
            this.amount=amount;
            return this;
        }

        public IncomeSource build()
        {
            return new IncomeSource(this);
        }
    }//builder
    @Override
    public String toString() {
        return "IncomeSource{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}
