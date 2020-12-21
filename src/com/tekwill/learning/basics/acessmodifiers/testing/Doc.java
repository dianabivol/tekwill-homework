package com.tekwill.learning.basics.acessmodifiers.testing;
import com.tekwill.learning.basics.accessmodifiers.software.Employee;
public class Doc {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "A";
        employee.publicdoWork();

        // without reference doesn't work
        //publicfirstName = "A";
        //publicdoWork()

    }

    public void checkProtected() {
        // employee.protectedfirsName = "A";
        // employee.protecteddoWork();
    }

    public void checkDefault() {
        // employee.defaultfirstName = "A";
        // employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "A";
        // employee.privatedoWork();
    }

}