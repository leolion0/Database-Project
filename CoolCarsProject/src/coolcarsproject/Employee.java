package coolcarsproject;

public class Employee {
    private int EmployeeID;
    private String Password;
    private String Name;
    private int EmployeeType;
    private int StoreID;
    private String PhoneNumber;

    public Employee(int employeeID, String password, String name, int employeeType, int storeID, String phoneNumber) {
        EmployeeID = employeeID;
        Password = password;
        Name = name;
        EmployeeType = employeeType;
        StoreID = storeID;
        PhoneNumber = phoneNumber;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public int getEmployeeType() {
        return EmployeeType;
    }

    public int getStoreID() {
        return StoreID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
