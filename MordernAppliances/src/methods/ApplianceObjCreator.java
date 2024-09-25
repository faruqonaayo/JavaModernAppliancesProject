package methods;

import problemDomain.DishWasher;
import problemDomain.Microwaves;
import problemDomain.Refrigerator;
import problemDomain.Vaccum;

public class ApplianceObjCreator {
    public static Refrigerator createRefrigerator (String[] stringArray) {
        Refrigerator appObj = new Refrigerator(
                Integer.parseInt(stringArray[0]),
                stringArray[1],
                Integer.parseInt(stringArray[2]),
                Integer.parseInt(stringArray[3]),
                stringArray[4],
                Double.parseDouble(stringArray[5]),
                Integer.parseInt(stringArray[6]),
                Double.parseDouble(stringArray[7]),
                Double.parseDouble(stringArray[8])
        );
        return appObj;
    }

    public static Vaccum createVaccum (String[] stringArray) {
        Vaccum appObj = new Vaccum(
                Integer.parseInt(stringArray[0]),
                stringArray[1],
                Integer.parseInt(stringArray[2]),
                Integer.parseInt(stringArray[3]),
                stringArray[4],
                Double.parseDouble(stringArray[5]),
                stringArray[6],
                Integer.parseInt(stringArray[7])
        );
        return appObj;
    }

    public static Microwaves createMicrowaves (String[] stringArray) {
        Microwaves appObj = new Microwaves(
                Integer.parseInt(stringArray[0]),
                stringArray[1],
                Integer.parseInt(stringArray[2]),
                Integer.parseInt(stringArray[3]),
                stringArray[4],
                Double.parseDouble(stringArray[5]),
                Double.parseDouble(stringArray[6]),
                stringArray[7]
                );
        return appObj;
    }

    public static DishWasher createDishwasher (String[] stringArray) {
        DishWasher appObj = new DishWasher(
                Integer.parseInt(stringArray[0]),
                stringArray[1],
                Integer.parseInt(stringArray[2]),
                Integer.parseInt(stringArray[3]),
                stringArray[4],
                Double.parseDouble(stringArray[5]),
                stringArray[6],
                stringArray[7]
                );
        return appObj;
    }
}
