package testing;

import com.digital.User;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class TestNGDemo {

        @Test
        public void createNewUserTest(){
            User firstUser = new User("John", 30);
            Assert.assertNotNull(firstUser);

        }
        @Test  (dependsOnMethods = "createNewUserTest")
        public void loginTest(){
        Assert.assertTrue(true);
        }

        @DataProvider(name = "inputValues")
        public Object[][]getInputValues() {
            return new Object[][]{
                    {"john@gmail.com", "ValidPass"},
                    {"johngmail.com", "ValidPass"},
                    {"john@gmail.com", "InvalidPass"}
            };
        }

        @Test(dataProvider = "inputValues")
        public void testLoginFun(String username, String password){
            System.out.println(username + " " + password);
        }
    }

