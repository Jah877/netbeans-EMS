public class EmployeeInfo {
    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender;
    public int workLoc;
    public double deductRate;
    
    //CONSTRUCTORS
    
    public EmployeeInfo (int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate){
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.workLoc = workLoc;
        this.deductRate = deductRate;
    }
    
    // METHODS
    
    public int getEmpNum() {
        return empNum;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getGender(){
        return gender;
    }
    
    public int getWorkLoc() {
        return workLoc;
    }
    
    public double getDeductRate() {
        return deductRate;
    }
    
    public double calcNetAnnualIncome() {
        System.out.println("You should never see this");
        return (-1.0);
        
    }
    
}
