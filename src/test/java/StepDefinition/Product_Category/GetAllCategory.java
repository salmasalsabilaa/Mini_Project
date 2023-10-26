package StepDefinition.Product_Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoints to all category")
    public String setApiEndpointAllCategory(){

        return url + "categories";
    }
    @Step("I send GET HTTP request to all category")
    public void sendGetHttpRequestAllCategory(){
        SerenityRest.given()
                .when()
                .get(setApiEndpointAllCategory());
    }

    @Step("I set GET invalid endpoints to all category")
    public String setApiInvalidEndpointAllCategory(){

        return url + "categorie";
    }
    @Step("I send invalid GET HTTP request to all category")
    public void sendInvalidGetHttpRequestAllCategory(){
        SerenityRest.given()
                .when()
                .get(setApiInvalidEndpointAllCategory());
    }
}
