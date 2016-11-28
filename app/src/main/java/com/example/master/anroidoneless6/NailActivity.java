package com.example.master.anroidoneless6;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Master on 28.11.2016.
 */

public class NailActivity extends AppCompatActivity {
    public static String EXTRA_NAIL = "extra_nail";

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_nail);

        if(savedIntanceState != null){
            int nailNom = getIntent().getIntExtra(EXTRA_NAIL, 0);
            Nail nail = Nail.nails[nailNom];

            ImageView photoNail = (ImageView)findViewById(R.id.photoNail);
            photoNail.setImageResource(nail.getImageId());
            photoNail.setContentDescription(nail.getName());

            TextView nameNail = (TextView) findViewById(R.id.nameNail);
            nameNail.setText(nail.getName());

            TextView descriptionNail = (TextView) findViewById(R.id.descriptionNail);
            descriptionNail.setText(nail.getDescription());
        }
    }
}