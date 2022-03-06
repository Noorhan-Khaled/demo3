package employee;

import employee.Employee;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestEmployee {
   static File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\employee\\employee");
    public static void main(String[] args) throws IOException {

        //File file=new File("D:\\informatique\\work\\arr\\demo3\\MyFirstApp\\src\\main\\java\\employee\\employee");
      /*  if(file.exists()){
            System.out.println("File already exist");
            System.exit(1);
        }*/

        PrintWriter output=new PrintWriter(file);

        ArrayList<Employee> list=new ArrayList<Employee>();
        for (int i=1;i<=10;i++){
            Employee employee=new Employee(i);
            list.add(employee);
        }
        for (int i=0;i< list.size();i++){
            Employee employee=list.get(i);
           employee.println();
            output.print(employee.getEmployeeId()+" "+employee.getName()+" "+employee.getSalary());
            //output.println(employee.print());
        }
        //output.close();

    }

    public static ArrayList<Employee> getEmployee() throws FileNotFoundException {
        PrintWriter output=new PrintWriter(file);

        ArrayList<Employee> list=new ArrayList<Employee>();
        for (int i=1;i<=10;i++){
            Employee employee=new Employee(i);
            list.add(employee);
        }
        for (int i=0;i< list.size();i++){
            Employee employee=list.get(i);
            //employee.print();
            //output.print(employee.getEmployeeId()+" "+employee.getName()+" "+employee.getSalary());
            //output.println(employee.print());
        }


        return list;
    }


}
