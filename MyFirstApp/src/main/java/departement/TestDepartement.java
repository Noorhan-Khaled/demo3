package departement;

import employee.Employee;
import employee.TestEmployee;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDepartement {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\departement\\departement");
        PrintWriter output=new PrintWriter(file);
        //File fileEmplyee=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\employee\\employee");
       // Scanner inputEmployee=new Scanner("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\employee\\employee");
        ArrayList<Departement> list = new ArrayList<Departement>();
        for (int i = 1; i <= 10; i++) {
            Departement departement = new Departement(i);
            list.add(departement);
        }
        ArrayList<Employee> listEmp = TestEmployee.getEmployee();
        for (int i = 0; i < list.size(); i++) {
            Departement departement = list.get(i);
            Employee emp = listEmp.get(i);
           // emp.print();

           // System.out.print(" , ");
          //departement.print();
            //output.println(departement.print());
            output.println(departement.print()+" "+emp.printFile());
        }
        output.close();
    }
}
