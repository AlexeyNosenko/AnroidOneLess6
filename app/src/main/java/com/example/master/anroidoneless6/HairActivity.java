package com.example.master.anroidoneless6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Master on 28.11.2016.
 */

public class HairActivity extends AppCompatActivity {
    public static String EXTRA_HAIR = "extra_hair";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("HairActivity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        int id = getIntent().getIntExtra(EXTRA_HAIR, 0);
        Hair h = Hair.hairs[id];

        ImageView photoHair = (ImageView) findViewById(R.id.photoHair);
        photoHair.setImageResource(h.getImageId());
        photoHair.setContentDescription(h.getName());

        TextView nameHair = (TextView) findViewById(R.id.nameHair);
        nameHair.setText(h.getName());

        TextView descriptionHair = (TextView) findViewById(R.id.descriptionHair);
        descriptionHair.setText(h.getDescription());
    }
}
