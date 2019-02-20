package io.zipcoder.pets;

import java.util.Comparator;

public class Pet implements Comparable<Pet> {

    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }



    public int compareTo(Pet pet){
        //int retVal = 0;
        //****** Works - put commenting out to progress in lab
        /* if(this.name.compareTo(pet.name) == 0)
         {// tie breaker
          //   obj instance of class


             if(pet instanceof Cat) {
                 retVal = -1;
             }


         }
         else {
             retVal= this.name.compareTo(pet.name);
         }*/

         return this.name.compareTo(pet.name);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        // will be overwritten
        return "";

    }

}
