package com.company;

public class Personnel {

    private String idCardNumber;
    private String nameOfWorker;
    private String profession;
    private int age;
    private int salary;

    public Personnel(String idCardNumber, String nameOfWorker, String profession, int age, int salary){

        this.idCardNumber = idCardNumber;
        this.nameOfWorker = nameOfWorker;
        this.profession = profession;
        this.age = age;
        this.salary = salary;
    }

    public String getNameOfWorker() {
        return nameOfWorker;
    }

    public void setNameOfWorker(String nameOfWorker) {
        this.nameOfWorker = nameOfWorker;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void information(){
        System.out.printf("ID CARD NUMBER: %s\n", getIdCardNumber());
        System.out.printf("NAME: %s\n", getNameOfWorker());
        System.out.printf("AGE: %d\n", getAge());
        System.out.printf("SALARY: $%d\n", getSalary());
        System.out.printf("PROFESSION: %s\n", getProfession());
    }

}
