package methods;

import problemDomain.DishWasher;
import problemDomain.Microwaves;
import problemDomain.Refrigerator;
import problemDomain.Vaccum;

import java.util.Scanner;

public class BrandSearch {
    public static void searchByBrand(String[] arrayToSearch){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter brand to search for: ");
        String userInput = scanner.nextLine();

        for (String line : arrayToSearch) {
            if (line.split(";")[1].equals(userInput)) {
                if (line.startsWith("1")){
                    String[] lineSplit = line.split(";");
                    Refrigerator refObj = ApplianceObjCreator.createRefrigerator(lineSplit);
                    System.out.println(refObj.toString());
                }else if (line.startsWith("2")){
                    String[] lineSplit = line.split(";");
                    Vaccum vacObj = ApplianceObjCreator.createVaccum(lineSplit);
                    System.out.println(vacObj.toString());
                }else if (line.startsWith("3")){
                    String[] lineSplit = line.split(";");
                    Microwaves micObj = ApplianceObjCreator.createMicrowaves(lineSplit);
                    System.out.println(micObj.toString());
                }else if (line.startsWith("4") || line.startsWith("5")){
                    String[] lineSplit = line.split(";");
                    DishWasher dishObj = ApplianceObjCreator.createDishwasher(lineSplit);
                    System.out.println(dishObj.toString());
                }
            }
        }
    }
}