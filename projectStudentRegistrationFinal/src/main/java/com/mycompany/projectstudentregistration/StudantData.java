package com.mycompany.projectstudentregistration;

/**
 *
 * @author marcelo
 */
public class StudantData {

    private int registration;
    private int changeRegistration;
    private String name;
    private String email;
    private int age;

    public StudantData() {
    }

    public StudantData(int registration, String name, String email, int age) {
        this.registration = registration;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getRegistration() {
        return registration;
    }

    public int getChangeRegistration() {
        return changeRegistration;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setChangeRegistration(int changeRegistration) {
        this.changeRegistration = changeRegistration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "E-mail: "
                + "Matrícula: " + registration + "-"
                + "Nome: " + name
                + "E-mail: " + email
                + "Idade: " + age;
    }
}
