package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class User {

    String uri = "https://petstore.swagger.io/v2/user";
    int userid = 2004;
    String username = "bobesponja";
    String password = "12345678";
    String token = "";

    // Padrão
    // Given = Dado
    // .When = Quando
    // .Then = Então

    // Funções de Apoio
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));

    }

    @Test
    public void incluirUsuario() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/user.json");

        given()
                .contentType("application/json")
                .log().all()
                .body(jsonBody)
                .when()
                .post(uri)
                .then()
                .log().all()
                .statusCode(200)
                .body("code", is(200))
                .body("type", is("unknown"))
                .body("message", is(Integer.toString(userid)))
        ;
    }

    @Test
    public void consultaUsuario() {


        given()
                .contentType("application/json")
                .log().all()

        .when()
                .get(uri + "/" + username)

        .then()
                .log().all()
                .statusCode(200)
                .body("code", is(200))
                .body("username", is(username))
        ;

    }
    @Test
    public void login(){

        String mensagem =
        given()
                .contentType("application/json")
                .log().all()
        .when()
                .get(uri + "/login?username=" + username + "&password=" + 12345678)
        .then()
                .body("code", is(200))
                .body("type", is("unknown"))
                .body("username",is(username))
        .extract()
                .path("message")
        ;
        System.out.println("A mensagem é: " + mensagem);
        token = mensagem.substring(24);
        System.out.println("O token é: " + token);

   }
}

