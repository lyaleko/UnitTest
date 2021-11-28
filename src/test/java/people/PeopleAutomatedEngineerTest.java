package people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleAutomatedEngineerTest {

    @Test
    public void personAutomatedEngineerGetAgeTest(){

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(33, 10);
        Assert.assertEquals("Person is not correct", 33, automatedEngineer.getAge());
    }
    @Test
    public void personAutomatedEngineerGetExperienceTest(){

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(33, 10);
        Assert.assertEquals("Person is not correct", 10, automatedEngineer.getExperience());
    }
    @Test
    public void personAutomatedEngineerGetSkillTest(){

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(27, 5);
        Assert.assertEquals("Person is not correct", 15, automatedEngineer.getSkill());
    }
    @Test
    public void automatedEngineerSetAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(27,5);
        automatedEngineer.setAge(25);
        Assert.assertEquals("Person is not correct", 25,automatedEngineer.getAge());
    }

    @Test
    public void automatedEngineerSetExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(27,5);
        automatedEngineer.setExperience(5);
        Assert.assertEquals("Person is not correct", 5,automatedEngineer.getExperience());
    }

    @Test
    public void automatedEngineerSetSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(27,5);
        automatedEngineer.setSkill(10);
        Assert.assertEquals("Person is not correct", 10,automatedEngineer.getSkill());
    }
}
