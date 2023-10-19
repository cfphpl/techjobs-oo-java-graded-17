package org.launchcode.techjobs.oo;

import java.util.Objects;
//abstract super class
public abstract class JobField {

    //the three instance variables here
    private int id;
    private static int nextId = 1;

    private String value;

    //the two constructors for unique IDs
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {

        return value;
    }
    //overrides to check jobfield ids
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    //id for hashcode
    public int hashCode() {

        return Objects.hash(getId());
    }
//gettin and settin here
    public int getId() {

        return id;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
}
