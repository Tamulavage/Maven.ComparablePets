package io.zipcoder.Pets;

import io.zipcoder.pets.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest{

    @Test
    public void dogSpeakTest() {
        //Given
        Dog myDog = new Dog();

        //When
        String actual = myDog.speak();

        //Then
        String expected = "Bark!";
        assertEquals(expected,actual);
    }
}