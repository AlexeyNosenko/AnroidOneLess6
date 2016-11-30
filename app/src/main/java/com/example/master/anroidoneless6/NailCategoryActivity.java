package com.example.master.anroidoneless6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Master on 28.11.2016.
 */

public class NailCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("onCreate", "NailCategoryActivity");
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter<Nail> nailsAdapter = new ArrayAdapter<Nail>(this, android.R.layout.simple_list_item_1, Nail.nails);
        listView.setAdapter(nailsAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id){
        Log.d("onListItemClick", "NailCategoryActivity");
        Intent intent = new Intent(NailCategoryActivity.this, NailActivity.class);
        intent.putExtra(NailActivity.EXTRA_NAIL, (int) id);
        startActivity(intent);
    }
}
