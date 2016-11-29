package com.example.master.anroidoneless6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Master on 28.11.2016.
 */

public class NailActivity extends AppCompatActivity {
    public static String EXTRA_NAIL = "extra_nail";

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        Log.d("onCreate", "NailActivity");
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_nail);
// endAllActiveAnimators on 0x965b1b80 (ListView) with handle 0x9687f1a0
        Log.d("onCreate", "savedIntanceState");
        if(savedIntanceState != null){
            Log.d("onCreate", "savedIntanceState != null");
            int nailNom = getIntent().getIntExtra(EXTRA_NAIL, 0);
            Nail nail = Nail.nails[nailNom];

            Log.d("onCreate", "photoNail");
            ImageView photoNail = (ImageView)findViewById(R.id.photoNail);
            photoNail.setImageResource(nail.getImageId());
            photoNail.setContentDescription(nail.getName());

            Log.d("onCreate", "nameNail");
            TextView nameNail = (TextView) findViewById(R.id.nameNail);
            nameNail.setText(nail.getName());

            Log.d("onCreate", "descriptionNail");
            TextView descriptionNail = (TextView) findViewById(R.id.descriptionNail);
            descriptionNail.setText(nail.getDescription());
        }
        Log.d("onCreate", "End");
    }
}