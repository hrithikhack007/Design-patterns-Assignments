package net.media.training.designpattern.builder;

public class Main {

    public static void main(String[] args){

       Person person = new PersonBuilder()
               .personCity("Mumbai")
               .personName("Hrithik")
               .personCountry("India")
               .personId(20)
               .build();

       System.out.println(person.getName() + " " + person.getId()
       + " " + person.getCity() + " " + person.getCountry()
       );
    }
}
