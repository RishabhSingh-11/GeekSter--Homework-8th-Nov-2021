// Assignment of (29/11/2021) class taken by Jay Sir !

class Vehicle{
    String brand;
    String model;
    int price;
    String color;

    Vehicle(){
        this.brand = "Royal Enfield";
        this.model = "350";
        this.price = 150000;
        this.color = "Black";
    }

    Vehicle(String brand, String model, int price, String colour){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = colour;

    }

    public void run(){
        System.out.println("Ready to Run");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void horn(){
        System.out.println("Use Horn");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


public class Assignment_29_11_2021 {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle("BMW", "XYZ", 5000000, "Black");
        Vehicle trek = new Vehicle("Mahindra", "XU123", 1000000, "Red");
        bike.setModel("ZMR");
        System.out.println(bike.getModel());

    }

}


