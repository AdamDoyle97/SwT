/*
Adam Doyle
G00335896@gmit.ie
0852755332
Group B
 */
package ie.gmit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeListTest {

    Employee myEmployee; // employee obj
    EmployeeList myList; // employee list

    @BeforeEach
    void setup()
    {
        myEmployee = new Employee("stephen", "123456");
        myList = new EmployeeList();
    }

    // test employee add method
    @Test
    void testAddEmployee() {
        myList.addEmployee(myEmployee);
        assertEquals(1, myList.getListSize());
    }

    // test employee delete method
    @Test
    void testDeleteEmployee() {
        myList.addEmployee(myEmployee);
        assertEquals(myEmployee, myList.deleteEmployee("123456"));
    }

}
