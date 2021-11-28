package people;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EngineerTest {

    Engineer engineer;
    int age, skill, exp;

    public EngineerTest(Engineer engineer, int age, int skill, int exp) {
        this.engineer = engineer;
        this.age = age;
        this.skill = skill;
        this.exp = exp;
    }
    @Parameterized.Parameters
    public static List<Object[]> inputData(){
        return Arrays.asList(new Object[][]{
                {new ManualEngineer(27,6), 27, 12, 6},
                {new AutomatedEngineer(27,6), 27, 18, 6}
        });
    }
    @Test
    public void engineerGetAgeTest(){
        Assert.assertEquals("Person is not correct", age, engineer.getAge());
    }

    @Test
    public void engineerGetSkillTest(){
        Assert.assertEquals("Person is not correct", skill, engineer.getSkill());
    }

    @Test
    public void engineerGetExpierenceTest(){
        Assert.assertEquals("Person is not correct", exp, engineer.getExperience());
    }

    @Test
    public void engineerSetAgeTest() {
        engineer.setAge(25);
        Assert.assertEquals("Person is not correct", 25,engineer.getAge());
    }

    @Test
    public void engineerSetSkillTest() {
        engineer.setSkill(25);
        Assert.assertEquals("Person is not correct", 5,engineer.getSkill());
    }

    @Test
    public void engineerSetExpirenceTest() {
        engineer.setExperience(25);
        Assert.assertEquals("Person is not correct", 15,engineer.getExperience());
    }
}