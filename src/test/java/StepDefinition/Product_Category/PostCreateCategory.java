package StepDefinition.Product_Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostCreateCategory {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints categories")
    public String setPostApiEndpointCategories(){
        return url + "categories";
    }

    @Step("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "gaming");
        requestBody.put("Description", "for gaming purposes");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointCategories());
    }

    @Step("I send empty POST HTTP request categories")
    public void sendEmptyPostHttpRequestCategories(){
        SerenityRest.given().post(setPostApiEndpointCategories());
    }

    @Step("I set POST invalid endpoints categories")
    public String setPostApiInvalidEndpointCategories(){
        return url + "categorie";
    }
    @Step("I send invalid POST HTTP request categories")
    public void sendPostHttpRequestInvalidCategories(){
        SerenityRest.given().post(setPostApiInvalidEndpointCategories());
    }
}
