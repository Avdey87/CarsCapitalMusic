package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener optinList = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Class<?> positionClass = classPosition(position);
                Intent intent = new Intent(MainActivity.this, positionClass);
                startActivity(intent);
            }
        };

        ListView listView = findViewById(R.id.listOption);
        listView.setOnItemClickListener(optinList);

    }

    private Class<?> classPosition(int position) {
        Class<?> point;
        switch (position) {
            case 0:
                point = CarsMainActivity.class;
                break;
            case 1:
                point = CapitalListActivity.class;
                break;
            case 2:
                point = Timer.class;
                break;
            case 3:
                point = IntentSendActivity.class;
                break;
            case 4:
                point = MusicActivity.class;
                break;
            default:
                throw new IllegalArgumentException("position= " + position + " is not supported");
        }

        return point;
    }


}
