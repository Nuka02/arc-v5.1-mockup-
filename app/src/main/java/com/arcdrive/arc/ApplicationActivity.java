package com.arcdrive.arc;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.mapbox.android.core.permissions.PermissionsListener;
import com.mapbox.android.core.permissions.PermissionsManager;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import java.util.List;


public class ApplicationActivity extends AppCompatActivity  implements OnMapReadyCallback, PermissionsListener  {

    private Button callRide;
    private MapView mapView;


    private PermissionsManager permissionsManager;
    private MapboxMap mapboxMap;


    Dialog dialog;

    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1IjoiYWpkaW5haG1ldG92aWMiLCJhIjoiY2praDZkZDQ3MG92MTNwbXBrYjRxNHllZiJ9.y9-QcaI5nQduRj_Mkv4cXg");
        setContentView(R.layout.activity_application);


        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

        web = new WebView(this);
        dialog = new Dialog(this);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.popup);

        web.getSettings().setJavaScriptEnabled(true);

        callRide = findViewById(R.id.callRide);

        callRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
                web.loadUrl("http://192.168.43.185/0");

                web.setWebViewClient(new WebViewClient() {

                    public void onPageFinished(WebView view, String url) {
                        dialog.dismiss();
                    }
                });


            }
        });

    }


    @Override
    public void onExplanationNeeded(List<String> permissionsToExplain) {

    }

    @Override
    public void onPermissionResult(boolean granted) {

    }

    @Override
    public void onMapReady(MapboxMap mapboxMap) {

    }
}
