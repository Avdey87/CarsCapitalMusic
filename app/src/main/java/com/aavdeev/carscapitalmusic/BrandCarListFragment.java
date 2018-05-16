package com.aavdeev.carscapitalmusic;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrandCarListFragment extends ListFragment {

    interface BrandCarListListener {
        void itemClicked(long id);
    }

    private BrandCarListListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] nameBrand = new String[BrandCar.brandList.length];

        for (int i = 0; i < nameBrand.length; i++) {
            nameBrand[i] = BrandCar.brandList[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, nameBrand);

        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        listener = (BrandCarListListener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}
