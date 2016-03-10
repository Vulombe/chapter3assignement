package cput.ac.za;

import cput.ac.za.domain.Person;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/10.
 */
public class TestSets
{

    Person person;
    Person person2;
    Person person3;
    Person person4;
    Person person5;
    @BeforeMethod
    public void setUpPerson() throws Exception {
        person = new Person("Vulombe","Makhubele");
        person2 = new Person("Matimu","Mabunda");
        person3 = new Person("Welcome","Chauke");
        person4 = new Person("Trecia","Masingi");
        person5 = new Person("Matimu","Mabunda");
    }

    @Test
    public void testPerson() throws Exception
    {
        Set people = new HashSet();

        people.add(person.getLastName());
        people.add(person2.getLastName());
        people.add(person3.getLastName());
        people.add(person4.getLastName());
        people.add(person5.getLastName());

        Assert.assertEquals("Mabunda",person5.getLastName());
        System.out.println(people);

        System.out.println(people.size());

        people.add(person5.getLastName());
        System.out.println(people);
        System.out.println(people.size());

        people.contains(person5.getLastName());

        people.remove(person.getLastName());

        System.out.println(people);
        System.out.println(people.size());
    }
}
