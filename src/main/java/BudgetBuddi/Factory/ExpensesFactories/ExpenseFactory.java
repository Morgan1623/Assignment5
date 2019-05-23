package BudgetBuddi.Factory.ExpensesFactories;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;

import java.util.ArrayList;
import java.util.Date;

public class ExpenseFactory
{
    public static Expense getExpense (String totalAllExpsenses, int date, double total, double amount)
    {
        return new Expense.Builder()
                .totalAllExpsenses(totalAllExpsenses)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}
