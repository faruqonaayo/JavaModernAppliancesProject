package methods;

import problemDomain.DishWasher;
import problemDomain.Microwaves;
import problemDomain.Refrigerator;
import problemDomain.Vaccum;

import java.util.Scanner;

public class TypeSearch {
    public static void searchByType(String[] arrayToSearch){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Appliance Types\n" +
                "1 – Refrigerators\n" +
                "2 – Vacuums\n" +
                "3 – Microwaves\n" +
                "4 – Dishwashers ");
        String userTypeInput = scanner.nextLine();


        switch (userTypeInput) {
            case "1" : {

                System.out.println("Enter number of doors: 2 (double door), 3 (three doors) or 4 (four doors): ");
                String userDoorInput = scanner.nextLine();
                for (String line : arrayToSearch) {
                    if (line.startsWith("1") && line.split(";")[6].equals(userDoorInput)) {
                        String[] lineSplit = line.split(";");

                        Refrigerator refObj = ApplianceObjCreator.createRefrigerator(lineSplit);
                        System.out.println(refObj.toString());
                    }
                }
                break;
            }
            case "2" : {
                System.out.println("Enter battery voltage value. 18 V (low) or 24 V (high): ");
                String userVoltageInput = scanner.nextLine();

                for (String line : arrayToSearch) {
                    if (line.startsWith("2") && line.split(";")[7].equals(userVoltageInput)) {
                        String[] lineSplit = line.split(";");

                        Vaccum vacObj = ApplianceObjCreator.createVaccum(lineSplit);
                        System.out.println(vacObj.toString());
                    }
                }
                break;
            }
            case "3" : {
                System.out.println("Room where the microwave will be installed: K (kitchen) or W (work site): ");
                String userRoomInput = scanner.nextLine();

                for (String line : arrayToSearch) {
                    if (line.startsWith("3") && line.split(";")[7].equals(userRoomInput)) {
                        String[] lineSplit = line.split(";");

                        Microwaves micObj = ApplianceObjCreator.createMicrowaves(lineSplit);
                        System.out.println(micObj.toString());
                    }
                }
                break;
            }
            case "4" : {
                System.out.println("Enter the sound rating of the dishwasher: Qt (Quietest), Qr (Quieter),Qu(Quiet) or M (Moderate): ");
                String userSoundRatingInput = scanner.nextLine();

                for (String line : arrayToSearch) {
                    if ((line.startsWith("4") || line.startsWith("5")) && line.split(";")[7].equals(userSoundRatingInput)) {
                        String[] lineSplit = line.split(";");

                        DishWasher dishObj = ApplianceObjCreator.createDishwasher(lineSplit);
                        System.out.println(dishObj.toString());
                    }
                }
                break;
            }
            default : {
                System.out.println("Invalid Input");
                break;
            }
        }

    }
}
