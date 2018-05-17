package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntentSendActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_send);
    }

    public void onClickSendToActivity(View view) {
        TextView editText = findViewById(R.id.editMessage);
        String text = editText.getText().toString();
        Intent intent = new Intent(IntentSendActivity.this, GetIntentActivity.class);
        intent.putExtra(GetIntentActivity.GET_MESSAGE, text);
        startActivity(intent);
    }

    public void onClickSendIntent(View view) {
        TextView edtitText = findViewById(R.id.editMessage);
        String text = edtitText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        intent.setType("text/plain");
        Intent cng = Intent.createChooser(intent, "Type send");
        startActivity(cng);
    }
}
