package ControllerTests.ExpenseControllerTests.ExpensesControllerTests;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Factory.ExpensesFactories.ExpenseFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ExpenseControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Expense";



    @Ignore
    public void create()
    {
        Expense expense = (Expense) ExpenseFactory.getExpense("", 23, 34, 35 );
        ResponseEntity<Expense> postResponse = restTemplate.postForEntity(baseURL + "/create", expense, Expense.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update()
    {
        int id = 23;
        Expense expense = restTemplate.getForObject(baseURL +  "/Expense/" + id, Expense.class);

        restTemplate.put(baseURL + "/regularExpenses/" + id, expense);
        Expense updatedExpense = restTemplate.getForObject(baseURL + "/Expense/" + id, Expense.class);
        assertNotNull(updatedExpense);
    }

    @Test
    public void delete()
    {
        int id = 24;
        Expense expense = restTemplate.getForObject(baseURL +  "/Expense/" + id, Expense.class);

        assertNotNull(expense);
        restTemplate.delete(baseURL + "/regularExpenses/" + id);
        try
        {
            expense = restTemplate.getForObject(baseURL + "/Expense/" + id, Expense.class);
        }

        catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }
    }


}