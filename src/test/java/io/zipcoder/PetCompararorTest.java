package io.zipcoder;

import io.zipcoder.PetComparator;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Cow;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class PetCompararorTest {


    @Test
    public void testBothInstanceCat() {
        // Given
        Pet myCat1 = new Cat(null);
        Pet myCat2 = new Cat(null);
        Comparator<Pet> petCompare = (Comparator<Pet>) new PetComparator();

        // When
        Integer actual = petCompare.compare(myCat1, myCat2);

        // then
        Assert.assertEquals(0.0, actual, 0);


    }

    @Test
    public void testBothInstanceDog() {
        // Given
        Pet myDog1 = new Dog(null);
        Pet myDog2 = new Dog(null);
        Comparator<Pet> petCompare = (Comparator<Pet>) new PetComparator();

        // When
        Integer actual = petCompare.compare(myDog1, myDog2);

        // then
        Assert.assertEquals(0.0, actual, 0);


    }

    @Test
    public void testCatDog() {
        // Given
        Pet myCat1 = new Cat(null);
        Pet myCat2 = new Dog(null);
        Comparator<Pet> petCompare = (Comparator<Pet>) new PetComparator();

        // When
        Integer actual = petCompare.compare(myCat1, myCat2);

        // then
        Assert.assertTrue(actual < 0);


    }

    @Test
    public void testCowCat() {
        // Given
        Pet myCat1 = new Cat(null);
        Pet myCow1 = new Cow(null);
        Comparator<Pet> petCompare = (Comparator<Pet>) new PetComparator();

        // When
        Integer actual = petCompare.compare(myCat1, myCow1);

        // then
        Assert.assertTrue(actual < 0);


    }


    @Test
    public void testDogCow() {
        // Given
        Pet myDog1 = new Dog(null);
        Pet myCow1 = new Cow(null);
        Comparator<Pet> petCompare = (Comparator<Pet>) new PetComparator();

        // When
        Integer actual = petCompare.compare(myCow1, myDog1);

        // then
        Assert.assertTrue(actual > 0);


    }
}
