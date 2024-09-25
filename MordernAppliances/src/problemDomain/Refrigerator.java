package problemDomain;

import appliance.Appliance;

public class Refrigerator extends Appliance {
    int doorNo;
    double height;
    double width;

    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int val) {
        doorNo = val;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double val) {
        height = val;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double val) {
        width = val;
    }

        public Refrigerator
                (
                        int itemNo,
                            String brand,
                            int quantity,
                            int wattage,
                            String color,
                            double price,
                            int doorNo,
                            double height,
                            double width
                ){
        super.setItemNumber(itemNo);
        super.setBrand(brand);
        super.setQuantity(quantity);
        super.setWattage(wattage);
        super.setColor(color);
        super.setPrice(price);
        this.doorNo = doorNo;
        this.height = height;
        this.width = width;
    }

    public  String toString (){
        return super.toString() + "Number of doors: " + doorNo + "\n" + "Height: " + height + "\n" + "Width: " + width + "\n";
    }

    public String toSingleLineString (){
        return super.toSingleLineString() +  doorNo + ";" + height + ";" + width;
    }
}
