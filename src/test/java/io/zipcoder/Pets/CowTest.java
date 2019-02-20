package io.zipcoder.Pets;

import io.zipcoder.pets.Cow;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowTest {
    @Test
    public void cowSpeakTest() {
        //Given
        Cow myCow = new Cow(null);

        //When
        String actual = myCow.speak();

        //Then
        String expected = "Moo!";
        assertEquals(expected,actual);
    }

}