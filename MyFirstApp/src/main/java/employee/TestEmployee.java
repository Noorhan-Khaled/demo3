package employee;

import employee.Employee;

import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<Employee>();
        for (int i=1;i<=10;i++){
            Employee employee=new Employee(i);
            list.add(employee);
        }
        for (int i=0;i< list.size();i++){
            Employee employee=list.get(i);
            employee.print();
        }

    }
}
