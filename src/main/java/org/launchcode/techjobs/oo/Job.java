package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
// instance variables
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    // increments ids
    public Job() {
        id = nextId;
        nextId++;
    }
//calls the default constructor so each job is unique
    public Job(String n, Employer e, Location l, PositionType p, CoreCompetency c) {
        this();
        this.name = n;
        this.employer = e;
        this.location = l;
        this.positionType = p;
        this.coreCompetency = c;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    //checks job validity
    public boolean isJobValid() {
        return (this.name != null) ||
                (this.employer != null) ||
                (this.location != null) ||
                (this.positionType != null) ||
                (this.coreCompetency != null);
    }
    //creates the custom string repping the Job Obj
    @Override public String toString() {
        if (!isJobValid()) {
            return "Job does not exist.";
        }
        String newline = System.lineSeparator();

        return      newline+
                    "ID: " + this.getId() + newline +
                    "Name: " + this.getName() + newline +
                    "Employer: " + this.getEmployer() + newline +
                    "Location: " + this.getLocation() + newline +
                    "Position Type: " + this.getPositionType() + newline +
                    "Core Competency: " + this.getCoreCompetency() + newline;
    }

    //checks for matching job ids
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    //hashcode override so ID dioes it
    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
    // Generate the hashCode method using the id field:

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

   // so many getters and setters. Check the autogenerate?
    public int getId() {
        return id;
    }

    public String getName() {
        if (this.name == null) {
            return "Data not available";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if (this.employer.getValue() == null || this.employer.getValue().isEmpty()) {
            return new Employer("Data not available");
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if (this.location.getValue() == null || this.location.getValue().isEmpty()) {
            return new Location("Data not available");
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (this.positionType.getValue() == null || this.positionType.getValue().isEmpty()) {
            return new PositionType("Data not available");
        }
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if(this.coreCompetency.getValue() == null || this.coreCompetency.getValue().isEmpty()) {
            return new CoreCompetency("Data not available");
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

