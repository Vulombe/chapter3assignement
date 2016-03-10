package cput.ac.za;

import cput.ac.za.domain.Animal;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/10.
 */
public class TestList
{
    Animal animal;
    Animal animal2;
    Animal animal3;
    Animal animal4;
    @BeforeMethod
    public void setUpAnimal() throws Exception
    {
        animal = new Animal("Lion","Mammal");
        animal2 = new Animal("Snake","Reptile");
        animal3 = new Animal("Eagle","Bird");
        animal4 = new Animal("Butterfly","insect");

    }

    @Test
    public void testAnimal() throws Exception {
        List animals = new ArrayList();

        animals.add(animal.getAnimalName());
        animals.add(animal2.getAnimalName());
        animals.add(animal3.getAnimalName());
        animals.add(animal4.getAnimalName());

        System.out.println(animals);

        System.out.println(animals.size());

        animals.add(0,animal4);

        System.out.println(animals.size());

        animals.remove(0);

        System.out.println(animals);
        System.out.println(animals.size());
        // for(int i = 0; i < animals.size(); i++)
        //System.out.println(animals);
        //listA.add(0, "element 0");
    }
}
