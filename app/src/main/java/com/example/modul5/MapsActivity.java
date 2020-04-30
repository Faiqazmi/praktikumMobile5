package com.example.modul5;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng kontrakanAzmi = new LatLng(-7.929013, 112.592168);
        mMap.addMarker(new MarkerOptions().position(kontrakanAzmi).title("Kontrakan Azmi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kontrakanAzmi));

        LatLng SdnLandungsari = new LatLng(-7.930334, 112.591878);
        mMap.addMarker(new MarkerOptions().position(SdnLandungsari).title("SDN Landungsari II"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SdnLandungsari));

        mMap.addPolyline(new PolylineOptions().add
                (
                        kontrakanAzmi,
                            new LatLng(-7.929013, 112.592168),
                            new LatLng(-7.929296, 112.592143),
                            new LatLng(-7.929530, 112.592036),
                            new LatLng(-7.929721, 112.591843),
                            new LatLng(-7.929942, 112.591743),
                            new LatLng(-7.930175, 112.591619),
                           // new LatLng(-7.776318, 112.741113),
                            new LatLng(-7.930334, 112.591878),
                        SdnLandungsari
                ).color(Color.RED));
    }
}
//-7.929296, 112.592143
//        -7.929530, 112.592036
//        -7.929721, 112.591843
//        //-7.929792, 112.591824
//        -7.929942, 112.591743
//        -7.930175, 112.591619