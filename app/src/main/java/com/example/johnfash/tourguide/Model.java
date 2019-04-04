package com.example.johnfash.tourguide;

public class Model {
    String mPlaceName;
    String mPlaceLocation;
    int mPlaceImage;
    String mPlaceGeo;

    public Model(String placeName, String placeLocation, int placeImage, String placeGeo){
        mPlaceName = placeName;
        mPlaceLocation = placeLocation;
        mPlaceImage = placeImage;
        mPlaceGeo = placeGeo;
    }

    public String getPlaceName(){
        return mPlaceName;
    }

    public String getLocation(){
        return mPlaceLocation;
    }

    public int getPlaceImage(){
        return mPlaceImage;
    }

    public String getPlaceGeo(){
        return mPlaceGeo;
    }
}
