package com.springBoot.leanrSpringBoot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    private String name;
    private int price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;
    public Course() {} // an entity should have empty constructor
    public Course(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
        System.out.println("using para cons ========>");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public  String toString() {
      return "Course [ id = "+id+ " name "+name+" price "+price + " ]";
    }
}
