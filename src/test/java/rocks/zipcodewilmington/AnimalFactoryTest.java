package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void createDogTest() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();

        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}
