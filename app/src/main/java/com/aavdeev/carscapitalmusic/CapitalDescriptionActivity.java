package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CapitalDescriptionActivity extends Activity {

    public static final String CAPITAL_KEY_ID = "capitalID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_description);

        int capitalID = (int) getIntent().getExtras().get(CAPITAL_KEY_ID);
        Capitals capitals = Capitals.listCapital[capitalID];

        ImageView capitalPhoto = findViewById(R.id.photoCapital);
        capitalPhoto.setImageResource(capitals.getId());
        capitalPhoto.setContentDescription(capitals.getName());

        TextView nameCapital = findViewById(R.id.nameCapital);
        nameCapital.setText(capitals.getName());

        TextView descriptionCapital = findViewById(R.id.descriptionCapital);
        descriptionCapital.setText(capitals.getDescription());
    }
}
