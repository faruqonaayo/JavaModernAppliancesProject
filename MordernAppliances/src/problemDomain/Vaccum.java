package problemDomain;

import appliance.Appliance;

public class Vaccum extends Appliance {
    String grade;
    int batteryVoltage;

    public String getGrade() {
        return grade;
    }
    public void setGrade(String val) {
        grade = val;
    }

    public int getBatteryVoltage() {
        return batteryVoltage;
    }
    public void setBatteryVoltage(int val) {
        batteryVoltage = val;
    }

    public Vaccum
            (
                    int itemNo,
                    String brand,
                    int quantity,
                    int wattage,
                    String color,
                    double price,
                    String grade,
                    int batteryVoltage
            ){
        super.setItemNumber(itemNo);
        super.setBrand(brand);
        super.setQuantity(quantity);
        super.setWattage(wattage);
        super.setColor(color);
        super.setPrice(price);
        this.grade = grade;
        this.batteryVoltage = batteryVoltage;
    }

    public  String toString (){
        return super.toString() + "Grade: " +grade + "\n" + "Battery Voltage: " + batteryVoltage + "\n";
    }

    public String toSingleLineString (){
        return super.toSingleLineString() +  grade + ";" + batteryVoltage;
    }
}
