package BudgetBuddi.Expenses.ExpsenseCategories.Healthcare;

import java.util.Date;

public class MedicalAid
{
    private String medicalAidID;
    private String medicalAidScheme;
    private Date date;
    private double total;
    private double amount;

    public MedicalAid(String medicalAidID, String medicalAidScheme, Date date, double total, double amount) {
        this.medicalAidID = medicalAidID;
        this.medicalAidScheme = medicalAidScheme;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }// constructor

    public String getMedicalAidID() {
        return medicalAidID;
    }

    public void setMedicalAidID(String medicalAidID) {
        this.medicalAidID = medicalAidID;
    }

    public String getMedicalAidScheme() {
        return medicalAidScheme;
    }

    public void setMedicalAidScheme(String medicalAidScheme) {
        this.medicalAidScheme = medicalAidScheme;
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
        return "MedicalAid{" +
                "medicalAidID='" + medicalAidID + '\'' +
                ", medicalAidScheme='" + medicalAidScheme + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}//constructor
