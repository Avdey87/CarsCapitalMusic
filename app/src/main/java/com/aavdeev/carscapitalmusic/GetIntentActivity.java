package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GetIntentActivity extends Activity {

    public static final String GET_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent);

        String msg = (String) getIntent().getExtras().get(GET_MESSAGE);
        TextView message = findViewById(R.id.getMessage);
        message.setText(msg);
    }
}
