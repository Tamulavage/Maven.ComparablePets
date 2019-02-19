package io.zipcoder.Pets;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Cow;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    //Inheritance test
    @Test
    public void testInheritance(){
        Pet p = new Cat(null);
        Assert.assertTrue(p instanceof Pet);
    }
    @Test
    public void petsetNameTest() {
        //Given
        Pet myCat = new Pet(null);
        String actual = "Spot";

        //When
        myCat.setName("Spot");

        //Then
        String expected = myCat.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void dogSpeakTest() {
        //Given
        Pet myDog = new Dog(null);
        String expected = "Bark!";

        //When
        String actual = myDog.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void catSpeakTest() {
        //Given
        Pet myCat = new Cat(null);
        String expected = "Meow!";

        //When
        String actual = myCat.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void cowSpeakTest() {
        //Given
        Pet myCow = new Cow(null);
        String expected = "Moo!";

        //When
        String actual = myCow.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

}