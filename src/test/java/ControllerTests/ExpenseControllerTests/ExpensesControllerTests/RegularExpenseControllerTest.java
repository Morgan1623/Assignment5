package ControllerTests.ExpenseControllerTests.ExpensesControllerTests;


import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Factory.ExpensesFactories.RegularExpensiveFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import java.net.http.HttpHeaders;
import static org.junit.Assert.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class RegularExpenseControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/regularExpense";



    @Ignore
    public void create()
    {
        RegularExpsenses regularExpsenses = RegularExpensiveFactory.getRegularExpense("groceries", 23, 34 );
        ResponseEntity<RegularExpsenses> postResponse = restTemplate.postForEntity(baseURL + "/create", regularExpsenses, RegularExpsenses.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }


    @Ignore
    public void update()
    {
        int id = 23;
        RegularExpsenses regularExpsenses = restTemplate.getForObject(baseURL +  "/regularExpenses/" + id, RegularExpsenses.class);

        restTemplate.put(baseURL + "/regularExpenses/" + id, regularExpsenses);
        RegularExpsenses updatedRegularExpenses = restTemplate.getForObject(baseURL + "/regularExpenses/" + id, RegularExpsenses.class);
        assertNotNull(updatedRegularExpenses);
    }

    @Ignore
    public void delete()
    {
      int id = 24;
        RegularExpsenses regularExpsenses = restTemplate.getForObject(baseURL +  "/regularExpenses/" + id, RegularExpsenses.class);

        assertNotNull(regularExpsenses);
        restTemplate.delete(baseURL + "/regularExpenses/" + id);
        try
        {
        regularExpsenses = restTemplate.getForObject(baseURL + "/regularExpenses/" + id, RegularExpsenses.class);
        }

        catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }


}