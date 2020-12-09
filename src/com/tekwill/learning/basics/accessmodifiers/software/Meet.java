package com.tekwill.learning.basics.accessmodifiers.software;

public class Meet {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "A";
        employee.publicdoWork();
    }

    public void checkProtected() {
        employee.protectedfirsName = "A";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        employee.defaultfirstName = "A";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "A";
        // employee.privatedoWork();
    }

}
