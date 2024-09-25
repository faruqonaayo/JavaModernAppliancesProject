package problemDomain;

import appliance.Appliance;

public class DishWasher extends Appliance {
    String feature;
    String soundRating;

    public String getFeature() {
        return feature;
    }
    public void setFeature(String val) {
        feature = val;
    }

    public String getSoundRating() {
        return soundRating;
    }
    public void setSoundRating(String val) {
        soundRating = val;
    }

    public DishWasher
            (
                    int itemNo,
                    String brand,
                    int quantity,
                    int wattage,
                    String color,
                    double price,
                    String feature,
                    String soundRating
            ){
        super.setItemNumber(itemNo);
        super.setBrand(brand);
        super.setQuantity(quantity);
        super.setWattage(wattage);
        super.setColor(color);
        super.setPrice(price);
        this.feature = feature;
        this.soundRating = soundRating;
    }

    public  String toString (){
        return super.toString() + "Feature: " +feature + "\n" + "Sound Rating: " + soundRating + "\n";
    }
}
