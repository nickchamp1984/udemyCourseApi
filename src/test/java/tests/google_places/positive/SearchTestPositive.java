package tests.google_places.positive;

import base.BaseTest;
import io.restassured.http.Method;
import models.google_places.GooglePlacesModel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constants.Constants.API_TOKEN;

public class SearchTestPositive extends BaseTest {

    @Test(description = "Search some object", dataProvider = "searchText")
    public void searchPlaceWithText(String key, String input, String inputtype) {
        GooglePlacesModel.RequestModel requestModel = GooglePlacesModel.RequestModel.builder()
            .key(key)
            .input(input)
            .inputtype(inputtype)
            .build();
        apiManager.getGooglePlacesModel().search(requestModel, Method.GET, 200);
    }
        @DataProvider
        public Object[] [] searchText(){
            return new Object[] []{
        {API_TOKEN, "new york", "textquery"}
        };
        }
    }
