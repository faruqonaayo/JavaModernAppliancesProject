package methods;

import problemDomain.DishWasher;
import problemDomain.Microwaves;
import problemDomain.Refrigerator;
import problemDomain.Vaccum;

import java.util.Random;

public class RandomSearch {
    public static void searchRandomApp (String[] arrayToSearch) {
        Random random = new Random();

        int randomNumber1 = random.nextInt(arrayToSearch.length - 1);
        int randomNumber2 = random.nextInt(arrayToSearch.length - 1);

        if (arrayToSearch[randomNumber1].startsWith("1")){
            String[] lineSplit = arrayToSearch[randomNumber1].split(";");
            Refrigerator refObj = ApplianceObjCreator.createRefrigerator(lineSplit);
            System.out.println(refObj.toString());
        } else if (arrayToSearch[randomNumber1].startsWith("2")) {
            String[] lineSplit = arrayToSearch[randomNumber1].split(";");
            Vaccum vacObj = ApplianceObjCreator.createVaccum(lineSplit);
            System.out.println(vacObj.toString());
        } else if (arrayToSearch[randomNumber1].startsWith("3")) {
            String[] lineSplit = arrayToSearch[randomNumber1].split(";");
            Microwaves micObj = ApplianceObjCreator.createMicrowaves(lineSplit);
            System.out.println(micObj.toString());
        }else {
            String[] lineSplit = arrayToSearch[randomNumber1].split(";");
            DishWasher dishObj = ApplianceObjCreator.createDishwasher(lineSplit);
            System.out.println(dishObj.toString());
        }

        if (arrayToSearch[randomNumber2].startsWith("1")){
            String[] lineSplit = arrayToSearch[randomNumber2].split(";");
            Refrigerator refObj = ApplianceObjCreator.createRefrigerator(lineSplit);
            System.out.println(refObj.toString());
        } else if (arrayToSearch[randomNumber2].startsWith("2")) {
            String[] lineSplit = arrayToSearch[randomNumber2].split(";");
            Vaccum vacObj = ApplianceObjCreator.createVaccum(lineSplit);
            System.out.println(vacObj.toString());
        } else if (arrayToSearch[randomNumber2].startsWith("3")) {
            String[] lineSplit = arrayToSearch[randomNumber2].split(";");
            Microwaves micObj = ApplianceObjCreator.createMicrowaves(lineSplit);
            System.out.println(micObj.toString());
        }else {
            String[] lineSplit = arrayToSearch[randomNumber2].split(";");
            DishWasher dishObj = ApplianceObjCreator.createDishwasher(lineSplit);
            System.out.println(dishObj.toString());
        }
    }
}

