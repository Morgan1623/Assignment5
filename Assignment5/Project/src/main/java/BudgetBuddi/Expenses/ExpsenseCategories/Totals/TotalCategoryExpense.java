package BudgetBuddi.Expenses.ExpsenseCategories.Totals;
import java.util.Date;
public class TotalCategoryExpense
{

    private double carTotals;
    private double entertainmentTotals;
    private double healthcareTotals;
    private double householdTotals;
    private double personalTotals;
    private double taxTotals;
    private double schoolTotals;
    private double travelTotals;
    private Date date;

    public double getCarTotals() {
        return carTotals;
    }

    public void setCarTotals(double carTotals) {
        this.carTotals = carTotals;
    }

    public double getEntertainmentTotals() {
        return entertainmentTotals;
    }

    public void setEntertainmentTotals(double entertainmentTotals) {
        this.entertainmentTotals = entertainmentTotals;
    }

    public double getHealthcareTotals() {
        return healthcareTotals;
    }

    public void setHealthcareTotals(double healthcareTotals) {
        this.healthcareTotals = healthcareTotals;
    }

    public double getHouseholdTotals() {
        return householdTotals;
    }

    public void setHouseholdTotals(double householdTotals) {
        this.householdTotals = householdTotals;
    }

    public double getPersonalTotals() {
        return personalTotals;
    }

    public void setPersonalTotals(double personalTotals) {
        this.personalTotals = personalTotals;
    }

    public double getTaxTotals() {
        return taxTotals;
    }

    public void setTaxTotals(double taxTotals) {
        this.taxTotals = taxTotals;
    }

    public double getSchoolTotals() {
        return schoolTotals;
    }

    public void setSchoolTotals(double schoolTotals) {
        this.schoolTotals = schoolTotals;
    }

    public double getTravelTotals() {
        return travelTotals;
    }

    public void setTravelTotals(double travelTotals) {
        this.travelTotals = travelTotals;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TotalCategoryExpense{" +
                "carTotals=" + carTotals +
                ", entertainmentTotals=" + entertainmentTotals +
                ", healthcareTotals=" + healthcareTotals +
                ", householdTotals=" + householdTotals +
                ", personalTotals=" + personalTotals +
                ", taxTotals=" + taxTotals +
                ", schoolTotals=" + schoolTotals +
                ", travelTotals=" + travelTotals +
                ", date=" + date +
                '}';
    }

    public TotalCategoryExpense(double carTotals, double entertainmentTotals, double healthcareTotals, double householdTotals, double personalTotals, double taxTotals, double schoolTotals, double travelTotals, Date date) {
        this.carTotals = carTotals;
        this.entertainmentTotals = entertainmentTotals;
        this.healthcareTotals = healthcareTotals;
        this.householdTotals = householdTotals;
        this.personalTotals = personalTotals;
        this.taxTotals = taxTotals;
        this.schoolTotals = schoolTotals;
        this.travelTotals = travelTotals;
        this.date = date;




    }
}//closes class
