/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;
import java.util.*;
/**
 *
 * @author sourav.mondal
 */
public class DoSomethingWithEmployee {
    public static void main(String args[]){
        
        //Employee emp=new Employee(232,"Sourav","","Mondal","Development","ML","9933965393",1000000);
        //now set the values for properties
        /*
        emp.setContact("9933965393");
        emp.setDesignation("Development");
        emp.setFirstName("Sourav");
        emp.setLastName("Mondal");
        emp.setTeam("ML");
        emp.setSalary(1000000);
        emp.setEmployeeId(2);
        */
        //display details
        /*
        System.out.println("First Name: \t"+emp.getFirstName());
        System.out.println("Last Name : \t"+emp.getLastName());
        System.out.println("Emploee Id : \t"+emp.getEmployeeId());
        System.out.println("Contact No : \t"+emp.getContact());
        System.out.println("Salary : \t"+emp.getSalary());
        System.out.println("Team : \t\t"+emp.getTeam());
        System.out.println("Designation : \t"+emp.getDesignation());
                */
        //double incSal=emp.provideIncrement(10);
        //System.out.println("New Salry : "+incSal);
        //System.out.println("FullName : "+emp.fullName());
        //System.out.println("New Salary : "+emp.provideIncrement(20, emp.getSalary()));
        //System.out.println(emp.toString());
       // Scanner scan=new Scanner(System.in);
        
        /*
        ArrayList<Employee> arr=new ArrayList<Employee>();
        HashMap<Integer,Double> map=new HashMap<Integer, Double>();
        while(true){
            System.out.println("Create another Employee");
            if(scan.nextLine().equals("no"))
                break;
            System.out.println("First Name");
            String firstName=scan.nextLine();
            System.out.println("Middle Name");
            String middleName=scan.nextLine();
            System.out.println("Last Name");
            String lastName=scan.nextLine();
            System.out.println("Designation");
            String desgn=scan.nextLine();
            System.out.println("Team");
            String team=scan.nextLine();
            System.out.println("Contact");
            String contact=scan.nextLine();
            System.out.println("Salary");
            double salary=scan.nextDouble();
            System.out.println("employee Id");
            int id=scan.nextInt();
            Employee emp=new Employee(id, firstName, middleName, lastName, desgn, team, contact, salary);
            //arr.add(emp);
            
            boolean response=DatabaseOperations.insertEmployee(emp);//insert into database
            if(response){
                System.out.println("Data Inserted");
            }
            else{
                System.out.println("Some problem Occured");
            }
            
            scan.nextLine(); 
            //map.put(emp.getEmployeeId(),emp.getSalary());
        }
        */
        /*
        Iterator it=arr.iterator();
        while(it.hasNext()){
            Employee emp=(Employee)it.next();
            System.out.println(emp.toString());
            System.out.println("New Salary : "+emp.provideIncrement(10));
            System.out.println();
        }
                */
       // System.out.println("Enter the employee to be searched");
        //int search=scan.nextInt();
        //SearchEmployees sEmp=new SearchEmployees();
        //double newSal=sEmp.searchedEmployeeSalary(map, search);
        //Employee emp=new Employee();
        //System.out.println(emp.provideIncrement(10,newSal));
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter id");       
        int id=scan.nextInt();
        System.out.println("Enter new Salary");       
        double sal=scan.nextDouble();
        DatabaseOperations.updateEmployees(id, sal);
        ArrayList empList=DatabaseOperations.getEmployees(id);
        Iterator itr=empList.iterator();
        while(itr.hasNext()){
            Employee emp=(Employee)itr.next();
            System.out.println(emp.toString()+"\n");
        }
        
    }
}
