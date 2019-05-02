package coolcarsproject;

public class Car {
    private int VIN;
    private int StoreID;
    private int CarCondition;
    private String Style;
    private String Make;
    private String Model; //lol
    private int Year;
    private String Color;
    private int Price;

    public Car(int VIN, int storeID, int carCondition,
               String style, String make, String model,
               int year, String color, int price) {
        this.VIN = VIN;
        StoreID = storeID;
        CarCondition = carCondition;
        Style = style;
        Make = make;
        Model = model;
        Year = year;
        Color = color;
        Price = price;
    }

    public int getVIN() {
        return VIN;
    }

    public int getStoreID() {
        return StoreID;
    }

    public int getCarCondition() {
        return CarCondition;
    }

    public String getStyle() {
        return Style;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }
}
