package client;

import server.City;

public class Person {
    private String name;
    private String lastname;
    private String dateBirth;
    private server.City bornIn;
    private int randomNumber;
    private String nameCLient;

    public Person(String name, String lastname, String dateBirth, server.City bornIn, int randomNumber, String nameCLient) {
        this.name = name;
        this.lastname = lastname;
        this.dateBirth = dateBirth;
        this.bornIn = bornIn;
        this.randomNumber = randomNumber;
        this.nameCLient = nameCLient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public server.City getBornIn() {
        return bornIn;
    }

    public void setBornIn(City bornIn) {
        this.bornIn = bornIn;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getNameCLient() {
        return nameCLient;
    }

    public void setNameCLient(String nameCLient) {
        this.nameCLient = nameCLient;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", bornIn=" + bornIn +
                ", randomNumber=" + randomNumber +
                ", nameCLient='" + nameCLient + '\'' +
                '}';
    }
}
