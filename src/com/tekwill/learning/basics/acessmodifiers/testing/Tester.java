package com.tekwill.learning.basics.acessmodifiers.testing;
import com.tekwill.learning.basics.accessmodifiers.software.Employee
public class Tester extends Employee {
    Employee employee;

    public void checkPublic() {
        publicfirstName = "A";
        publicdoWork();

        // with reference
        employee.publicfirstName = "A";
        employee.publicdoWork();
    }

    public void checkProtected() {
        protectedfirsName = "A";
        protecteddoWork();

        // employee.protectedfirsName = "A";
        // employee.protecteddoWork();
    }

    public void checkDefault() {
        // defaultfirstName = "A";
        // defaultdoWork();

        // employee.defaultfirstName = "A";
        // employee.defaultdoWork();
    }

    public void checkPrivate() {
        // privatefirstName = "A";
        // privatedoWork();

        // employee.privatefirstName = "A";
        // employee.privatedoWork();
    }

}
