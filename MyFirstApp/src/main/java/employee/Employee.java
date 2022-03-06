package employee;

public class Employee {
    int employeeId;
    String name;
    int salary;


    Employee(int employeeId){
        this.employeeId=employeeId;
        this.name="name" + employeeId;
        this.salary=employeeId * 1000 ;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.print(getEmployeeId()+" "+getName()+" "+getSalary());
    }


}
