package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import people.PeopleAutomatedEngineerTest;
import people.PeopleManualEngineerTest;

@Suite.SuiteClasses({PeopleManualEngineerTest.class, PeopleAutomatedEngineerTest.class})
@RunWith(Suite.class)
public class PeopleSuits {

}
