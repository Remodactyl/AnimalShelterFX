

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {




    @Test
    void Dog() {
        //Arrange

        //Act
        Dog dog1 = new Dog("Mumford", Gender.Male);
        Dog dog2 = new Dog("Babette", Gender.Female);
        //Assert
        Assertions.assertEquals("Mumford", dog1.Name);
        Assertions.assertEquals("Babette", dog2.Name);
    }

    @Test
    void getNeedsWalk() {
        //Arrange
        Dog dog1 = new Dog("Meow", Gender.Male);
        Dog dog2 = new Dog("Chirp", Gender.Female);
        //Act
        dog2.LastWalk = LocalDateTime.now().minusDays(1);
        boolean result1 = dog1.getNeedsWalk();
        boolean result2 = dog2.getNeedsWalk();
        //Assert
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

    @Test
    void testToString() {

    }
}