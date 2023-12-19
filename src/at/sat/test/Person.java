package at.sat.test;

public class Person {
    private String firstName;
    private String lastName;
    private PetStore petStore;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
