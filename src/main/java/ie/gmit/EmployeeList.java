/*
Adam Doyle
G00335896@gmit.ie
0852755332
Group B
 */
package ie.gmit;

import java.util.ArrayList;
import java.util.Objects;

public class EmployeeList {
    private ArrayList<Employee> list; // array list for employees

    public EmployeeList() {
        list = new ArrayList<Employee>();
    }

    // employee add method
    public void addEmployee(Employee myEmployee)
    {
        if (list.add(myEmployee)) {
            throw new IllegalArgumentException("Employee added successfully");
        }
    }

    // employee delete method
    public Employee deleteEmployee(String employeeNumber)
    {
        for(Employee employee : list)
        {
            if(Objects.equals(employee.getNumber1(), employeeNumber))
            {
                throw new IllegalArgumentException("Employee Deleted");
            }
            else {
                return employee;
            }
        }
        return null;
    }

    // list size method
    public int getListSize()
    {
        list.size();
        return list.size();
    }
}
