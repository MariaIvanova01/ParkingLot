package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashSet<String> parking = new LinkedHashSet<>();

        while(!input.equals("END")){
            String[] parcingInfo = input.split(", ");
            if (parcingInfo[0].equals("IN")){
                parking.add(parcingInfo[1]);
            }
            if (parcingInfo[0].equals("OUT")){
                parking.remove(parcingInfo[1]);
            }
            input = scan.nextLine();
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            System.out.println(String.join(System.lineSeparator(), parking));
        }

    }
}
