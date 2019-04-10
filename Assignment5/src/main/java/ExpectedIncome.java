import javafx.util.Builder;

import java.util.Set;

public class ExpectedIncome

{

    private double workIncome,allowance,otherIncome;
    private Set<ExpectedIncome> incomeSet;



    private ExpectedIncome(Builder builder)
    {

      this.workIncome = builder.workIncome;
      this.allowance  = builder.allowance;
      this.otherIncome = builder.otherIncome;
    }

    public double getWorkIncome()
    {
        return workIncome;
    }

    public double getAllowance()
    {
        return allowance;
    }

    public double getOtherIncome()
    {
        return otherIncome;
    }

    public static class Builder {

        private double workIncome, allowance, otherIncome;
        private Set<ExpectedIncome> incomeSet;

        public Builder workIncome(double workIncome) {

            this.workIncome = workIncome;
            return this;
        }

        public Builder allowance(double allowance) {

            this.allowance = allowance;
            return this;
        }

        public Builder otherIncome(double otherIncome) {

            this.otherIncome = otherIncome;
            return this;
        }


        @Override
        public String toString() {
            return "Builder{" +
                    "workIncome=" + workIncome +
                    ", allowance=" + allowance +
                    ", otherIncome=" + otherIncome +
                    ", incomeSet=" + incomeSet +
                    '}';
        }
    }


}
