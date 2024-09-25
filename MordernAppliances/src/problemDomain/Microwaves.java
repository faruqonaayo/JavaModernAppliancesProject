package problemDomain;

import appliance.Appliance;

public class Microwaves extends Appliance {
    double capacity;
    String roomType;

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double val) {
        capacity = val;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String val) {
        roomType = val;
    }

    public Microwaves
            (
                    int itemNo,
                    String brand,
                    int quantity,
                    int wattage,
                    String color,
                    double price,
                    double capacity,
                    String roomType
            ){
        super.setItemNumber(itemNo);
        super.setBrand(brand);
        super.setQuantity(quantity);
        super.setWattage(wattage);
        super.setColor(color);
        super.setPrice(price);
        this.capacity = capacity;
        this.roomType = roomType;
    }

    public  String toString (){
        return super.toString() + "Capacity: " +capacity + "\n" + "Room Type: " + roomType + "\n";
    }

    public String toSingleLineString (){
        return super.toSingleLineString() +  capacity + ";" + roomType;
    }
}
