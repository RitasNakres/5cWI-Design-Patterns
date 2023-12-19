package at.sat.test.Animals;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("SuperDog");
        Cat c = new Cat("SuperCat");
        Cat c1 = new Cat("SuperDuperCat");
        Person p = new Person("Georg", "Bucher");
        PetStore ps = new PetStore(p, "Wildpark Feldkirch");
        p.printName();
        c.getName();
        ps.addAnimal(d);
        ps.addAnimal(c);
        ps.addAnimal(c1);
        ps.printAllAnimals();
        ps.getPersonsName();
    }
}
