package org.launchcode.techjobs.oo;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        //objects created by Job class
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        //my arraty list for jobs and adding them
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
// for each loop- confirmed print
        for (Job job : jobs){
            System.out.println(job);
        }
    }

}
