
class employe {
    private String name;
    String empID;
    long salary;
    String designation;
   

    public employe(String name, String empID, long salary, String designation) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
        this.designation = designation;
    }


    
   
    public String toString() {
        return "employe [name=" + name + ", empID=" + empID + ", salary=" + salary + ", designation=" + designation
                + "]";
    }

    public void display(){
        System.err.println("employe name=" + name + ", empID=" + empID + ", salary=" + salary + ", designation=" + designation
                );
    }


    public String getName() {
        return name;
    }




    public String getEmpID() {
        return empID;
    }




    public long getSalary() {
        return salary;
    }




    public String getDesignation() {
        return designation;
    }
    
}