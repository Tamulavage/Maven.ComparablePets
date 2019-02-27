package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Cow;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.*;

public class Application {

    public static void main(String args[]) {

        Application app = new Application();
        app.driver();

    }

    public void driver() {

        List<String> petType = new ArrayList<String>();
        List<String> petName = new ArrayList<String>();
        List<Pet> pet = new ArrayList<Pet>();
        //Pet pet = new Pet;


        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many pets do you have?");

        Integer petCount = scanner.nextInt();
        for (int i = 0; i < petCount; i++) {
            System.out.println("Dog, Cat, or Cow");
            petType.add(scanner.next());
            System.out.println("Name: ");
            petName.add(scanner.next());
        }

        scanner.close();

        for (int k = 0; k < petCount; k++) {
            if ("Dog".equals(petType.get(k))) {
                Pet dog = new Dog(petName.get(k));
                pet.add(dog);
            }
            if ("Cat".equals(petType.get(k))) {
                Pet cat = new Cat(petName.get(k));
                pet.add(cat);
            }
            if ("Cow".equals(petType.get(k))) {
                Pet cow = new Cow(petName.get(k));
                pet.add(cow);
            }
        }

        Collections.sort(pet);


        //******* Used before classes
/*
        for(int j=0; j<petCount; j++){
            System.out.println(petType.get(j) + " : " + petName.get(j));
        }*/

        for (Pet ele : pet) {

            System.out.println(ele.getName() + " " + ele.speak());
        }
    }


}
