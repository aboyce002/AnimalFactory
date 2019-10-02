package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        Cat actual = CatHouse.getCatById(givenId);

        Assert.assertNotNull(actual);
    }

    @Test
    public void removeTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        CatHouse.remove(cat);

        Cat actual = CatHouse.getCatById(givenId);

        Assert.assertNull(actual);
    }

    @Test
    public void removeTest2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        CatHouse.remove(givenId);

        Cat actual = CatHouse.getCatById(givenId);

        Assert.assertNull(actual);
    }

    @Test
    public void getCatByIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        Cat actual = CatHouse.getCatById(givenId);

        Assert.assertNotNull(actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse.add(new Cat(null, null, null));
        CatHouse.add(new Cat(null, null, null));
        CatHouse.add(new Cat(null, null, null));

        int expected = 3;

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
