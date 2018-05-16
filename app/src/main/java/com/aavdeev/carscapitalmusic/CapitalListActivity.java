package com.aavdeev.carscapitalmusic;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CapitalListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Capitals> list = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Capitals.listCapital);

        ListView listView = getListView();
        listView.setAdapter(list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(CapitalListActivity.this, CapitalDescriptionActivity.class);
        intent.putExtra(CapitalDescriptionActivity.CAPITAL_KEY_ID, (int) id);
        startActivity(intent);
    }
}
