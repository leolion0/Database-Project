package coolcarsproject;

public class User {
    private String Username;
    private String Password;
    private String Name;
    private int Age;
    private int CreditScore;
    private String License;
    private String Insurance;
    private int Balance;
    private String PhoneNumber;

    public User(String username, String password, String name, int age,
                int creditScore, String license, String insurance,
                int balance, String phoneNumber) {
        Username = username;
        Password = password;
        Name = name;
        Age = age;
        CreditScore = creditScore;
        License = license;
        Insurance = insurance;
        Balance = balance;
        PhoneNumber = phoneNumber;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getCreditScore() {
        return CreditScore;
    }

    public String getLicense() {
        return License;
    }

    public String getInsurance() {
        return Insurance;
    }

    public int getBalance() {
        return Balance;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
