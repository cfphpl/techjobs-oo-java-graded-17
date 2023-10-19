package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;
import java.util.Objects;
import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;
//JJJJ JUNIT!
public class JobTest {
    //TODO: Create your unit tests here
    //verifying IDs are not equal
    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job_2 = new Job();
        assertNotEquals(test_job.getId(),test_job_2.getId());
    }
    //checks alll them fields
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testFields = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester", testFields.getName());
        assertEquals("ACME", testFields.getEmployer().getValue());
        assertEquals("Desert", testFields.getLocation().getValue());
        assertEquals("Quality control", testFields.getPositionType().getValue());
        assertEquals("Persistence", testFields.getCoreCompetency().getValue());
        assertTrue(testFields instanceof Job);
        assertTrue(testFields.getEmployer() instanceof Employer);
        assertTrue(testFields.getLocation() instanceof Location);
        assertTrue(testFields.getPositionType() instanceof PositionType);
        assertTrue(testFields.getCoreCompetency() instanceof CoreCompetency);
        assertNotNull(testFields.getName());
        assertNotNull(testFields.getEmployer());
        assertNotNull(testFields.getLocation());
        assertNotNull(testFields.getPositionType());
        assertNotNull(testFields.getCoreCompetency());





    }
     // checks to make sure two jobs equal or no
    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job test_job_2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(test_job,test_job_2);
    }


    //I dont know. It keeps failing here but not in git. I think it has something to do with how mac vs windows handles carrige return. GHAA!
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_toString_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        String newline = System.lineSeparator();
        String firstChar = String.valueOf(test_toString_job.toString().charAt(0));
        String lastChar = String.valueOf(test_toString_job.toString().charAt(test_toString_job.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
        assertEquals(newline+
                "ID: " + test_toString_job.getId() + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Desert" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence" + newline,test_toString_job.toString());

    }
    // checking the data against a known
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job correct_label_and_data_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();

        assertEquals(newline+
                        "ID: " + correct_label_and_data_job.getId() + newline +
                        "Name: Product tester" + newline +
                        "Employer: ACME" + newline +
                        "Location: Desert" + newline +
                        "Position Type: Quality control" + newline +
                        "Core Competency: Persistence" + newline
                , correct_label_and_data_job.toString());

    }
    // testing for blanks in the data
    @Test
    public void testToStringHandlesEmptyField() {
        Job testerJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType(),
                new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();

        assertEquals(newline+
                        "ID: " + testerJob.getId() + newline +
                        "Name: Product tester" + newline +
                        "Employer: ACME" + newline +
                        "Location: Desert" + newline +
                        "Position Type: Data not available" + newline +
                        "Core Competency: Persistence" + newline
                , testerJob.toString());

        System.out.println(testerJob);
    }

}