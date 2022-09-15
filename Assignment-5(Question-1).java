import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
//Implement Comparable to sort Employee on basis of Salary
class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
    Integer age;
    Integer employee_id;
 
    public Employee() {
    }
 
    public Employee(String n, Integer f, Integer a, Integer i) {
           name = n;
           salary = f;
           age = a;
           employee_id = i;
    }
 
    public String toString() {
           return "\n Name = " + name + ", Salary = " + salary + ", Age = " + age + ", Employee_id = " + employee_id;
    }
 
    public int compareTo(Employee e) {
    	
    	return (this.salary.compareTo(e.salary));
    	
    }
}
 
public class Main {
 
    public static void main(String[] args) {
 
           Employee emp1 = new Employee("Ankit", 2000, 34, 101);
           Employee emp2 = new Employee("Dev", 500, 30, 102);
           Employee emp3 = new Employee("Abhishek", 1000, 31, 103);
           Employee emp4 = new Employee("Sam", 9000, 35, 104);
           Employee emp5 = new Employee("Samar", 10000, 32, 105);
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
 
           Collections.sort(l); // Sort
 
           System.out.print(l); // Display list
 
    }
 
}