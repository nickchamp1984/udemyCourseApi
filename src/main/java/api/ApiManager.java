package api;

import lombok.Getter;
import lombok.Setter;
import models.google_places.GooglePlacesModel;

public class ApiManager {

    @Getter
    @Setter
    GooglePlacesModel googlePlacesModel = new GooglePlacesModel();
}
