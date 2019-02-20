package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Cow;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    public int compare(Pet val1, Pet val2) {

        // Cat > Dog > Cow
        if(val1 instanceof Cat) {
            // Start with Cat
            if (val2 instanceof Cat) {
                return 0;
            } else {
                return -1; // Cat is the highest
            }
        }

            // Check Dog
            if(val1 instanceof Dog) {
                if (val2 instanceof Dog) {
                    return 0;
                } else if (val2 instanceof Cat) {
                    return 1; // Cat is the highest
                } else {
                    return -1;
                }
            }

            // Check cow
                if(val1 instanceof Cow) {
                    if(val2 instanceof Cow){
                        return 0;
                    }
                    else {
                        return 1;
                    }

                }
        return val1.getName().compareTo(val2.getName());
        }


    }
