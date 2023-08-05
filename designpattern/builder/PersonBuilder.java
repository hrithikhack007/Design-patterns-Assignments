package net.media.training.designpattern.builder;

public class PersonBuilder {

    private String name;
    private int id;
    private String city;
    private String country;

    public PersonBuilder personName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder personId(int id){
        this.id = id;
        return this;
    }

    public PersonBuilder personCity(String city){
        this.city = city;
        return this;
    }

    public PersonBuilder personCountry(String country){
        this.country = country;
        return this;
    }

    public Person build(){
        return new Person(name, id, city, country);
    }

}
