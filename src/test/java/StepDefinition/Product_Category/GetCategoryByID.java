package StepDefinition.Product_Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetCategoryByID {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints category By ID")
    public String setApiEndpointCategoryByID(){

        return url + "categories/12590";
    }
    @Step("I send GET HTTP request category By ID")
    public void sendGetHttpRequestCategoryByID(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointCategoryByID());
    }
    @Step("I set GET invalid endpoints category By ID")
    public String setApiInvalidEndpointCategoryByID(){

        return url + "categorie/12590";
    }
    @Step("I send invalid GET HTTP request category By ID")
    public void sendInvalidGetHttpRequestCategoryByID(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointCategoryByID());
    }
}
