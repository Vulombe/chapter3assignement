package cput.ac.za.domain;

/**
 * Created by student on 2016/03/10.
 */
public class Animal
{
    String animalName;
    String animaltype;

    public Animal() {
    }

    public Animal(String animalName, String animaltype) {
        this.animalName = animalName;
        this.animaltype = animaltype;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animaltype='" + animaltype + '\'' +
                '}';
    }
}
