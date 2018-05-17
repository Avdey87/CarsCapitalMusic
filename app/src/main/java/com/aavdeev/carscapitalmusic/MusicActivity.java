package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MusicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void onClickShowBand(View view) {
        TextView showBand = findViewById(R.id.listBand);
        Spinner list = findViewById(R.id.listStyle);
        String typeView = String.valueOf(list.getSelectedItem());

        List<String> bands = BandFactory.getBandFactory(typeView);
        StringBuilder boardContent = new StringBuilder();

        Iterator<String> bandIterator = bands.iterator();
        while (bandIterator.hasNext()) {
            String musicBand = bandIterator.next();
            boardContent.append(musicBand);
            if (bandIterator.hasNext()) {
                boardContent.append("\n");
            }
        }

        showBand.setText(boardContent);
    }
}
