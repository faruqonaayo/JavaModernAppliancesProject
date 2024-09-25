package methods;

import java.util.Scanner;

public class CheckOutAppliance {
    public static void runCheckOut (String[] appliances) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item number of an appliance: ");
        String userInput = scanner.next();

        int applianceFound = 0;

        for (String line : appliances){
            String[] lineSplit = line.split(";");
            if (lineSplit[0].equals(userInput) && Integer.parseInt(lineSplit[2]) > 0){
                System.out.println("Appliance " + userInput + " has been checked out.");
                applianceFound ++;
            } else if (lineSplit[0].equals(userInput) && Integer.parseInt(lineSplit[2]) == 0) {
                System.out.println("The appliance is not available to be checked out.");
                applianceFound ++;
            }
        }
        if (applianceFound == 0){
            System.out.println("No appliances found with that item number.");
        }
    }
}
