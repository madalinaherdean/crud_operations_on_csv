package com.company;

public class Person {
    public String id;
    public String name;
    public  String age;
    public  String job;


    Person(String id , String name, String age,String job){
        this.id=id;
        this.name=name;
        this.age=age;
        this.job=job;
    }
    public  String getUserData(){

        return   id+"," + name +"," +age + ","+job+"," ;
    }

}