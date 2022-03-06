package departement;

import employee.Employee;
import employee.TestEmployee;

import java.io.File;
import java.util.ArrayList;

public class TestDepartement {
    public static void main(String[] args) {
        File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\departement\\departement");
        ArrayList<Departement> list = new ArrayList<Departement>();
        for (int i = 1; i <= 10; i++) {
            Departement departement = new Departement(i);
            list.add(departement);
        }
        ArrayList<Employee> listEmp = TestEmployee.getEmployee();
        for (int i = 0; i < list.size(); i++) {
            Departement departement = list.get(i);
            Employee emp = listEmp.get(i);
            emp.print();
            System.out.print(" , ");
            departement.print();
        }
    }
}
