package com.example.master.anroidoneless6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TopActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView  tvNails = null;
    private ImageView ivNails = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        init();
    }

    private void init(){
        ivNails = (ImageView) findViewById(R.id.ivNails);
        tvNails = (TextView)  findViewById(R.id.tvNails);
        tvNails.setOnClickListener(this);
        ivNails.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("onClick", "TopActivity");
        switch (v.getId()){
            case R.id.ivNails:
            case R.id.tvNails:
                Log.d("onClick", "Nails");
                Intent intent = new Intent(this, NailCategoryActivity.class);
                Log.d("onClick", "intent");
                startActivity(intent);
                break;
        }
    }
}
