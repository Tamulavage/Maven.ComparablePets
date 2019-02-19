package io.zipcoder.Pets;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void catSpeakTest() {
        //Given
        Cat myCat = new Cat();

        //When
        String actual = myCat.speak();

        //Then
        String expected = "Meow!";
        Assert.assertEquals(expected,actual);
    }
}