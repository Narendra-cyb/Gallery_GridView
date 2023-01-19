package com.example.galllery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullView extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        imageView=findViewById(R.id.image_view);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("FullImage");

        Intent i=getIntent();
        int position=i.getExtras().getInt("key");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[position]);
    }

}