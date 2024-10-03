package testrunner;

import controller.setup.User;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTestRunner {

    @Test(priority = 0, description = "User unable to login with invalid email")
    public void userDoNotLoginWithInvalidEmail() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.userCanNotLoginWithInvalidEmail("sdfgg@.net", "cityslicka");
        String messageExpected = "user not found";
        Assert.assertEquals(user.getMessage(), messageExpected);
        System.out.println(messageExpected);
    }

    @Test(priority = 1, description = "User unable to login with invalid password")
    public void userDoNotLoginWithInvalidPassword() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.userCanNotLoginWithInvalidPassword("eve.holt@reqres.in", "I love you Nahida");
        String messageExpected = "QpwL5tke4Pnpja7X4";
        Assert.assertEquals(user.getMessage(), messageExpected);
        System.out.println(messageExpected);
    }

    @Test(priority = 2, description = "User unable to login with invalid email and valid password")
    public void userDoNotLoginWithInvalidEmailAndValidPassword() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.userCanNotLoginWithInvalidEmail("sdfgg@.net", "cityslicka");
        String messageExpected = "user not found";
        Assert.assertEquals(user.getMessage(), messageExpected);
        System.out.println(messageExpected);
    }

    @Test(priority = 3, description = "User unable to login with valid email and invalid password")
    public void userDoNotLoginWithValidEmailAndInvalidPassword() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.userCanNotLoginWithInvalidPassword("eve.holt@reqres.in", "I love you Nahida");
        String messageExpected = "QpwL5tke4Pnpja7X4";
        Assert.assertEquals(user.getMessage(), messageExpected);
        System.out.println(messageExpected);
    }

    @Test(priority = 4, description = "User unable to login with valid credentials")
    public void userDoNotLoginWithValidCredentials() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.userCanNotLoginWithInvalidPassword("eve.holt@reqres.in", "cityslicka");
        String messageExpected = "QpwL5tke4Pnpja7X4";
        Assert.assertEquals(user.getMessage(), messageExpected);
        System.out.println(messageExpected);
    }

    @Test(priority = 5, description = "Create a user with valid data")
    public void testCreateUser() throws IOException, ConfigurationException {
        User user = new User();
        user.createUser();
    }

    @Test(priority = 6, description = "Search a user by id")
    public void searchUser() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.searchUser();
    }

    @Test(priority = 7, description = "Update a user by id")
    public void updateUser() throws ConfigurationException, IOException, IOException {
        User user = new User();
        user.updateUser();
    }

}
