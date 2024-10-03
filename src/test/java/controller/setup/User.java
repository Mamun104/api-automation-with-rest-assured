package controller.setup;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import model.UserModel;
import org.apache.commons.configuration.ConfigurationException;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class User extends Setup {

    public User() throws IOException {
        initConfig();
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void userCanNotLoginWithInvalidEmail(String email, String password) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        UserModel userModel = new UserModel(email, password);
        Response response =
                given()
                        .contentType("application/json")
                        .body(userModel)
                        .when()
                        .post("api/login")
                        .then()
                        .assertThat().contentType("application/json")
                        .assertThat().body("error", equalTo("user not found"))
                        .assertThat().statusCode(400).extract().response();

        JsonPath jsonPathEvaluator = response.jsonPath();
        String errorMessage = jsonPathEvaluator.getString("error");
        setMessage(errorMessage);
    }

    public void userCanNotLoginWithInvalidPassword(String email, String password) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        UserModel userModel = new UserModel(email, password);
        Response response =
                given()
                        .contentType("application/json")
                        .body(userModel)
                        .when()
                        .post("api/login")
                        .then()
                        .assertThat().statusCode(200).extract().response();


        JsonPath jsonpath = response.jsonPath();
        String token = jsonpath.get("token");
        String authMessage = jsonpath.getString("token");
        setMessage(authMessage);
        Utils.setEnvVariable("TOKEN", token);

    }

    public void userCanNotLoginWithInvalidEmailAndValidPassword(String email, String password) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        UserModel userModel = new UserModel(email, password);
        Response response =
                given()
                        .contentType("application/json")
                        .body(userModel)
                        .when()
                        .post("api/login")
                        .then()
                        .assertThat().contentType("application/json")
                        .assertThat().body("error", equalTo("user not found"))
                        .assertThat().statusCode(400).extract().response();

        JsonPath jsonPathEvaluator = response.jsonPath();
        String errorMessage = jsonPathEvaluator.getString("error");
        setMessage(errorMessage);
    }

    public void userCanNotLoginWithValidEmailAndInvalidPassword(String email, String password) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        UserModel userModel = new UserModel(email, password);
        Response response =
                given()
                        .contentType("application/json")
                        .body(userModel)
                        .when()
                        .post("api/login")
                        .then()
                        .assertThat().statusCode(200).extract().response();


        JsonPath jsonpath = response.jsonPath();
        String token = jsonpath.get("token");
        String authMessage = jsonpath.getString("token");
        setMessage(authMessage);
        Utils.setEnvVariable("TOKEN", token);

    }

    public void doLoginWithValidCredentials(String email, String password) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        UserModel userModel = new UserModel(email, password);
        Response response =
                given()
                        .contentType("application/json")
                        .body(userModel)
                        .when()
                        .post("api/login")
                        .then()
                        .assertThat().statusCode(200).extract().response();


        JsonPath jsonpath = response.jsonPath();
        String token = jsonpath.get("token");
        String authMessage = jsonpath.getString("token");
        setMessage(authMessage);
        Utils.setEnvVariable("TOKEN", token);

    }

    public void createUser() throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        String requestBody = "{ \"name\": \"Nahida\", \"job\": \"QA Engineer\" }";
        Response response =
                given()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("api/users")
                        .then()
                        .assertThat().contentType("application/json")
                        .assertThat().statusCode(201)
                        .extract().response();
    }

    public void searchUser() throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        Response response =
                given()
                        .contentType("application/json")
                        .when()
                        .get("api/users/7")
                        .then()
                        .assertThat().contentType("application/json")
                        .body("data.email", equalTo("michael.lawson@reqres.in"))
                        .assertThat().statusCode(200)
                        .extract().response();

    }

    public void updateUser() throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("BASE_URL");
        String requestBody = "{ \"name\": \"Jaan\", \"job\": \"QA Engineer\" }";
        Response response =
                given()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .put("api/users/2")
                        .then()
                        .assertThat().contentType("application/json")
                        .body("name", equalTo("Jaan"))
                        .assertThat().statusCode(200)
                        .extract().response();
    }

}
