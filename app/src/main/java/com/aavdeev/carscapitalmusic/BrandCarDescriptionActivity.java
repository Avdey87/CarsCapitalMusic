package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.os.Bundle;

public class BrandCarDescriptionActivity extends Activity {

    public static final String BRAN_CAR_KEY_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_car_description);

        int brandCarID = (int) getIntent().getExtras().get(BRAN_CAR_KEY_ID);
        BrandCarDescriptionFragment descriptionBrand = (BrandCarDescriptionFragment) getFragmentManager().findFragmentById(R.id.activityBrandDescription);
        descriptionBrand.setBrandID(brandCarID);
    }
}
