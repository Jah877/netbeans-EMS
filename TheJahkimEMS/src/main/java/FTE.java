// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    public double yearlySalary;
    
    public FTE (int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate, double yearlySalary) {
        super (empNum, firstName, lastName, gender, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
    }
    
    public double getYearlySalary(){
        return yearlySalary;
    }
    
    public double calcNetAnnualIncome() {
        return (yearlySalary * (1.0 - deductRate));
    }
}
