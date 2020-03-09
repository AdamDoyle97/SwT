/*
Adam Doyle
G00335896@gmit.ie
0852755332
Group B
 */

package ie.gmit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee myEmployee;

    // initializing test constructor
    @Test
    void testConstructor(){
        myEmployee = new Employee("stephen","123456");
        assertEquals("stephen", myEmployee.getName());
    }

    // test constructor no name data
    @Test
    void testConstructorNoName(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("","123456"));
    }

    //test constructor no number
    @Test
    void testConstructorNoNumber(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("stephen",""));
    }
}
