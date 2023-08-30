// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    public PTE (int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear){
        super (empNum, firstName, lastName, gender, workLoc, deductRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weeksPerYear;
    }
    
    public double calcNetAnnualIncome () {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) * (1.0 - deductRate));
    }
    
    public double getHourlyWage(){
        return hourlyWage;
    }
    
    public double getHoursPerWeek(){
        return hoursPerWeek;
    }
    
    public double getWeeksPerYear(){
        return weeksPerYear;
    }
}
