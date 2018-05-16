package com.aavdeev.carscapitalmusic;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BrandCarDescriptionFragment extends Fragment {

    private long brandID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            brandID = savedInstanceState.getLong("brandID");
        }

        return inflater.inflate(R.layout.fragment_brand_car_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            BrandCar brandList = BrandCar.brandList[(int) brandID];
            TextView nameBrand = view.findViewById(R.id.brandName);
            nameBrand.setText(brandList.getName());
            TextView descriptionBrand = view.findViewById(R.id.brandDescription);
            descriptionBrand.setText(brandList.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("brandID", brandID);
    }

    public void setBrandID(long brandID) {
        this.brandID = brandID;
    }
}
