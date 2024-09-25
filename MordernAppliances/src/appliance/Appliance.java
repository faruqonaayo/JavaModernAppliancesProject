package appliance;

public abstract class Appliance {
    int itemNumber;
    String brand;
    int quantity;
    int wattage;
    String color;
    double price;

    public int getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(int val) {
        itemNumber = val;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String val) {
        brand = val;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int val) {
        quantity = val;
    }

    public int getWattage() {
        return wattage;
    }
    public void setWattage(int val) {
        wattage = val;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String val) {
        color = val;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double val) {
        price = val;
    }

//    public Appliance(int itemNo,String brand,int quantity, int wattage, String color, double price){
//        this.itemNumber = itemNo;
//        this.brand = brand;
//        this.quantity = quantity;
//        this.wattage = wattage;
//        this.color = color;
//        this.price = price;
//    }

    public String toString (){
        return "Item Number: " + itemNumber + "\n" + "Brand: " + brand + "\n" + "Quantity: " + quantity + "\n" + "Wattage: " +  wattage + "\n" + "Color: " + color + "\n" + "Price: "+ price + "\n";
    }

    public String toSingleLineString (){
        return itemNumber + ";" + brand + ";" + quantity + ";" +  wattage + ";" + color + ";" + price + ";";
    }

    public void  checkOut () {
        if (quantity > 0){
            quantity--;
            System.out.println("Check Out Successful");
        }
        else {
            System.out.println("Not Successful. Out of appliances");
        }
    }
}
