package employee;

import employee.Employee;

import java.io.File;
import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {

        File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\employee\\employee");

        ArrayList<Employee> list=new ArrayList<Employee>();
        for (int i=1;i<=10;i++){
            Employee employee=new Employee(i);
            list.add(employee);
        }
        for (int i=0;i< list.size();i++){
            Employee employee=list.get(i);
            employee.println();
        }

    }

    public static ArrayList<Employee> getEmployee() {

        ArrayList<Employee> list=new ArrayList<Employee>();
        for (int i=1;i<=10;i++){
            Employee employee=new Employee(i);
            list.add(employee);
        }
        for (int i=0;i< list.size();i++){
            Employee employee=list.get(i);
            employee.print();
        }


        return list;
    }


}
