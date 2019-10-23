package com.rizky.pemula;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends Activity {

    public static String EXTRA_NAME = "nama";
    public static String EXTRA_DESC = "detail";

    TextView name, detail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.nama_wisata);
        detail = findViewById(R.id.desc_wisata);

        int photo = 0;
        photo = getIntent().getIntExtra("photo", 0);
        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String desk = getIntent().getStringExtra(EXTRA_DESC);


        Glide.with(this).load(photo).apply( new RequestOptions().override(200,300)).into(imageView);
        name.setText(nama);
        detail.setText(desk);



    }


}
