package at.sat.test.Animals;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    private Person person;
    private String name;
    private List<Animal> animals;


    public PetStore(Person person, String name) {
        this.person = person;
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAllAnimals() {
        for (Animal animal : this.animals
        ) {
            System.out.println(animal.getName());
        }
    }

    public void getPersonsName() {
        this.person.printName();
    }
}
