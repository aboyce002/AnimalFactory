package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void addTest() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(givenId);

        Assert.assertNotNull(actual);
    }

    @Test
    public void removeTest() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);

        Dog actual = DogHouse.getDogById(givenId);

        Assert.assertNull(actual);
    }

    @Test
    public void removeTest2() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(givenId);

        Dog actual = DogHouse.getDogById(givenId);

        Assert.assertNull(actual);
    }

    @Test
    public void getDogByIdTest() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(givenId);

        Assert.assertNotNull(actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        DogHouse.add(new Dog(null, null, null));
        DogHouse.add(new Dog(null, null, null));
        DogHouse.add(new Dog(null, null, null));

        int expected = 3;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
}
