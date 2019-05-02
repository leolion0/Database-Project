package coolcarsproject;

public class Location {
    private int StoreID;
    private String Address;
    private String PhoneNumber;
    private int ManagerID;

    public Location(int storeID, String address, String phoneNumber, int managerID) {
        StoreID = storeID;
        Address = address;
        PhoneNumber = phoneNumber;
        ManagerID = managerID;
    }

    public int getStoreID() {
        return StoreID;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getManagerID() {
        return ManagerID;
    }
}
