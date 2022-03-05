package employee;

import departement.Departement;

public class Employee {
    int employeeId;
    String name;
    int salary;

    Departement departement;
     Employee(int employeeId, String name, int salary){
        this.employeeId=employeeId;
        this.name="name_"+name;
        this.salary=salary*1000;

    }
    Employee(int employeeId,String name,int salary,Departement departement){
        this.employeeId=employeeId;
        this.name="name_"+name;
        this.salary=salary*1000;
        this.departement=departement;
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
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public void print(){
        System.out.print(getEmployeeId()+" "+getName()+" "+getSalary());
    }
    public void println(){
        System.out.println(getEmployeeId()+" "+getName()+" "+getSalary());
    }
}
