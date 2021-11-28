package people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleManualEngineerTest {

    @Test
    public void personManualEngineerGetAgeTest(){

        ManualEngineer manualEngineer = new ManualEngineer(27, 5);
        Assert.assertEquals("Person is not correct", 27, manualEngineer.getAge());
    }
    @Test
    public void personManualEngineerGetExperienceTest(){

        ManualEngineer manualEngineer = new ManualEngineer(27, 5);
        Assert.assertEquals("Person is not correct", 5, manualEngineer.getExperience());
    }
    @Test
    public void personManualEngineerGetSkillTest(){

        ManualEngineer manualEngineer = new ManualEngineer(27, 5);
        Assert.assertEquals("Person is not correct", 10, manualEngineer.getSkill());
    }

    @Test
    public void manualEngineerSetAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(27,5);
        manualEngineer.setAge(25);
        Assert.assertEquals("Person is not correct", 25,manualEngineer.getAge());
    }

    @Test
    public void manualEngineerSetExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(27,5);
        manualEngineer.setExperience(5);
        Assert.assertEquals("Person is not correct", 5,manualEngineer.getExperience());
    }

    @Test
    public void manualEngineerSetSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(27,5);
        manualEngineer.setSkill(10);
        Assert.assertEquals("Person is not correct", 10,manualEngineer.getSkill());
    }
}