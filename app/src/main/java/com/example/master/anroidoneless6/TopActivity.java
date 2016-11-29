package com.example.master.anroidoneless6;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TopActivity extends AppCompatActivity implements View.OnClickListener {
// открытие карты
// настройка цвета в категориях
// подобрать инфы
// подогнать размер TextView
    private ImageView ivLogo = null;

    private TextView  tvNails = null;
    private ImageView ivNails = null;

    private TextView  tvHairs = null;
    private ImageView ivHairs = null;

    private TextView  tvMap   = null;
    private ImageView ivMap   = null;

    private final String officialSite = "http://www.студия-мираж.рф"; // сайт не мой)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        init();
    }

    private void init(){
        ivLogo = (ImageView) findViewById(R.id.ivLogo);
        ivLogo.setOnClickListener(this);

        ivNails = (ImageView) findViewById(R.id.ivNails);
        ivNails.setOnClickListener(this);
        tvNails = (TextView)  findViewById(R.id.tvNails);
        tvNails.setOnClickListener(this);

        ivHairs = (ImageView) findViewById(R.id.ivHairs);
        ivHairs.setOnClickListener(this);
        tvHairs = (TextView) findViewById(R.id.tvHairs);
        tvHairs.setOnClickListener(this);

        ivMap = (ImageView) findViewById(R.id.ivMap);
        ivMap.setOnClickListener(this);
        tvMap = (TextView) findViewById(R.id.tvMap);
        tvMap.setOnClickListener(this);
    }

    private void openBrowser(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Log.d("onClick", "TopActivity");
        Intent intent = null;

        switch (v.getId()){
            case R.id.ivLogo:
                Log.d("onClick", "Logo");
                openBrowser(officialSite);
                break;
            case R.id.ivNails:
            case R.id.tvNails:
                Log.d("onClick", "Nails");
                intent = new Intent(this, NailCategoryActivity.class);
                break;

            case R.id.ivHairs:
            case R.id.tvHairs:
                Log.d("onClick", "Hairs");
                intent = new Intent(this, HairCategoryActivity.class);
                break;

            case R.id.ivMap:
            case R.id.tvMap:
                Log.d("onClick", "Map");
                //intent = new Intent(this, "asdasdasd");
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
