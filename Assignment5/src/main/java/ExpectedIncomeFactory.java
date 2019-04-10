
public class ExpectedIncomeFactory

{

    public static ExpectedIncome getExpectedIncome(double workIncome,double  allowance, double otherIncome){
       return new ExpectedIncome.Builder().workIncome(workIncome)
               .allowance(allowance)
               .otherIncome(otherIncome)
               .build();

    }


}
