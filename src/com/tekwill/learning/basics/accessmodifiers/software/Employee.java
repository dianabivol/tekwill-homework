package com.tekwill.learning.basics.accessmodifiers.software;

public class Employee {
    public String publicfirstName;
    public Employee employee;
    //
    protected String protectedfirsName;
    //
    String defaultfirstName;
    //
    private String privatefirstName;

    //
    public Employee publicdoWork() {
        return new Employee();
    }

    //
    protected Employee protecteddoWork() {
        return new Employee();
    }

    //
    Employee defaultdoWork() {
        return new Employee();
    }

    //
    private Employee privatedoWork() {
        return new Employee();
    }

    public void checkPublic() {
        publicfirstName = "A";
        publicdoWork();

        employee.publicfirstName = "A";   // with reference
        employee.publicdoWork();
    }

    public void checkProtected() {
        protectedfirsName = "A";
        protecteddoWork();

        employee.protectedfirsName = "A";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        defaultfirstName = "A";
        defaultdoWork();

        employee.defaultfirstName = "A";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        privatefirstName = "A";
        privatedoWork();

        employee.privatefirstName = "A";
        employee.privatedoWork();
    }


}
