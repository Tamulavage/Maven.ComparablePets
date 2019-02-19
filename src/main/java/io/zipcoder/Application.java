package io.zipcoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Application {

    public static void main (String args[]){

     Application app = new Application();
     app.driver();

    }

    public void driver(){

        List<String> petType = new ArrayList<String>();
        List<String> petName = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many pets do you have?");

        Integer petCount = scanner.nextInt();
        for(int i = 0;i<petCount; i++){
            System.out.println("Dog or Cat?");
            petType.add(scanner.next());
            System.out.println("Name: ");
            petName.add(scanner.next());
        }

        scanner.close();

        for(int j=0; j<petCount; j++){
            System.out.println(petType.get(j) + " : " + petName.get(j));
        }
    }



}
