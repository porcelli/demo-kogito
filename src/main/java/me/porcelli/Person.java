package me.porcelli;

public class Person {

    private String name;
    private String ssn;

    public Person(){
    }

    public Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
   
    public String getName() {
        return this.name;
    }

    public String getSsn() {
        return this.ssn;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", ssn='" + getSsn() + "'" +
            "}";
    }
}