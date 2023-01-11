package departement;

import employee.Employee;
import employee.TestEmployee;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestDepartment {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\departement\\departement");
        PrintWriter output=new PrintWriter(file);
        ArrayList<Departement> list = new ArrayList<Departement>();
        for (int i = 1; i <= 10; i++) {
            Departement departement = new Departement(i);
            list.add(departement);
        }
        ArrayList<Employee> listEmp = TestEmployee.getEmployee();
        for (int i = 0; i < list.size(); i++) {
            Departement departement = list.get(i);
            Employee emp = listEmp.get(i);
            output.println(emp.printFile()+" , "+departement.print());
        }
        output.close();
    }
}
