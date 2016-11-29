package com.example.master.anroidoneless6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Nosenko on 29.11.2016.
 */

public class HairCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("HairCategoryActivity", "onCreate");
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter<Hair> hairAdapter = new ArrayAdapter<Hair>(this, android.R.layout.simple_list_item_1, Hair.hairs);
        listView.setAdapter(hairAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id) {
        Log.d("HairCategoryActivity", "onListItemClick");
        Intent intent = new Intent(this, HairActivity.class);
        intent.putExtra(HairActivity.EXTRA_HAIR, (int) id);
        startActivity(intent);
    };
}
