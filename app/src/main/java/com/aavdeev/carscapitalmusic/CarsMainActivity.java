package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarsMainActivity extends Activity implements BrandCarListFragment.BrandCarListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_main);
    }

    @Override
    public void itemClicked(long id) {
        View containere = findViewById(R.id.containerDescription);
        if (containere != null) {
            BrandCarDescriptionFragment description = new BrandCarDescriptionFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            description.setBrandID(id);
            ft.replace(R.id.containerDescription, description);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(CarsMainActivity.this, BrandCarDescriptionActivity.class);
            intent.putExtra(BrandCarDescriptionActivity.BRAN_CAR_KEY_ID, (int) id);
            startActivity(intent);
        }
    }
}
