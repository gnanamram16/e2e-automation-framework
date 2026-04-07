package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void getUsers() {

        RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users")
                .then()
                .statusCode(200);

        System.out.println("API Test Passed");
    }
}