import methods.*;
import problemDomain.Refrigerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allAppliances = FileConverter.convertToArray("appliances.txt");

       String userOption;

       do {
           System.out.println("Welcome to Modern Appliances!\n" +
                   "How May We Assist You?\n" +
                   "1 – Check out appliance\n" +
                   "2 – Find appliances by brand\n" +
                   "3 – Display appliances by type\n" +
                   "4 – Produce random appliance list\n" +
                   "5 – Save & exit\n" +
                   "Enter option:");
           userOption = scanner.nextLine();
           switch (userOption) {
               case "1" :
                   CheckOutAppliance.runCheckOut(allAppliances);
                   break;
               case "2" :
                   BrandSearch.searchByBrand(allAppliances);
                   break;
               case "3" :
                   TypeSearch.searchByType(allAppliances);
                   break;
               case "4" :
                   RandomSearch.searchRandomApp(allAppliances);
                   break;
               case "5" :
                   break;
               default :
                   System.out.println("Invalid Input");
                   break;
           }
       }while (!userOption.equals("5"));
        System.out.println("Application Closed");

    }

}