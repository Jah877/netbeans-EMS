import java.util.*;

public class MyHashTable {
    // ATTRIBUTES
    
    // buckets is an array of ArrayList. Each item is an ArrayList of an EmployeeInfo object.
    
    public ArrayList <EmployeeInfo> [] buckets;
    public int numInHashTable;
    
    // CONSTRUCTOR
    
    public MyHashTable (int howManyBuckets) {
        // construct the has table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.
        
        // instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];
        
        // For each element in the array, instatiate its ArrayList.
        
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>(); // Instantiate the ArrayList for bucket i  
        }
        
        numInHashTable = 0;
    }
    
    // METHODS
    
    public int getNumInHashTable() {
        return numInHashTable;
    }
    
    public int calcBucket (int keyValue) {
        // returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
        return (keyValue % buckets.length);
    }
    
    public boolean addEmployee (EmployeeInfo theEmployee) {
        
        // add the employee to the hash table. reurn true if employee is added sucessfully,
        // return false otherwise.
        
        if (theEmployee == null) {
            return(false);
        }
        
        int targetBucket = calcBucket (theEmployee.getEmpNum());
        ArrayList<EmployeeInfo> bucket = buckets[targetBucket];
        
        // check for duplicate EmpNum in the target bucket
        for (EmployeeInfo employee : bucket) {
            if (employee.getEmpNum() == theEmployee.getEmpNum()){
               return false; //  duplicate found 
            }
        }
        // No duplicate found, add the employee to the ArrayList for the targetBucket.
        boolean addStatus = bucket.add(theEmployee);
        numInHashTable++;
        return addStatus;

    } // end addEmployee
    
    public void displayContents() {
        
        System.out.println("n\nDISPLAYING THE CONTENTS OF A HASH TABLE!");
        System.out.println("\n This hash table contains " + numInHashTable + " entries.");
        
        // print the employee numbers for the employess stored in each bucket's Array List
        // starting with bucket 0, then bucket 1, and so on.
        
        for (int i = 0; i < buckets.length; i++) {
            // for the current bucket, print out the emp num for each item,
            // in its ArrayList.
            
            System.out.println("\n Examining the ArrayList for bucket " + i);
            int listSize = buckets[i].size();
            if (listSize == 0) {
                System.out.println("    Nothing is its ArrayList!");
            }
            else {
                for (int j = 0; j < listSize; j++) {
                    int theEmpNum = buckets[i].get(j).getEmpNum();
                    System.out.println("    Employee " + theEmpNum);
                }
            }
        }
    } // end displayContents
    
    public EmployeeInfo removeEmployee(int theEmpNum){
        int targetBucket = calcBucket(theEmpNum);
        ArrayList<EmployeeInfo> bucket = buckets[targetBucket];
        
        // Searches for the employee in the bucket
        for (int i = 0; i < bucket.size(); i ++) {
            EmployeeInfo employee = bucket.get(i);
            if (employee.getEmpNum()== theEmpNum){
                bucket.remove(i);
                numInHashTable--;
                return employee; // Returns the removed employee
            }
        }
        return null;
    }
    
    public EmployeeInfo getEmployee(int theEmpNum) {
        int targetBucket = calcBucket(theEmpNum);
        ArrayList<EmployeeInfo> bucket = buckets[targetBucket];
        
        // search for the employee in the bucket
        for (EmployeeInfo employee : bucket) {
            if (employee.getEmpNum() == theEmpNum) {
                return employee;
            }
        }
        return null; // employee is not found in the hash table
    }
}
