/*
Adam Doyle
G00335896@gmit.ie
0852755332
Group B
 */
package ie.gmit;


public class Employee {
    private String name;
    private int number;
    private String number1 = Integer.toString(number);

    // getters which initialize the name and number
    public String getName() { return name; }

    public String getNumber1() { return number1; }

    // constructor which throws arguement if invalid data
    public Employee(String name, String number1) {
        if (name.length() <= 5)
        {
            throw new IllegalArgumentException("Invalid Name Length");
        } else {
            this.name = name;
        }
        if (number1.length() <= 5)
        {
            throw new IllegalArgumentException("Employee Number should be 5 digits");
        } else {
            this.number1 = number1;
        }
    }
}
