package com.arcdrive.arc;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class ApplicationActivity extends AppCompatActivity {

    private Button callRide;
    private MapView mapView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1IjoiYWpkaW5haG1ldG92aWMiLCJhIjoiY2praDZkZDQ3MG92MTNwbXBrYjRxNHllZiJ9.y9-QcaI5nQduRj_Mkv4cXg");
        setContentView(R.layout.activity_application);

    }



}
