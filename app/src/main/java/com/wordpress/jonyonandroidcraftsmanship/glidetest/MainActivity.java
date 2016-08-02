package com.wordpress.jonyonandroidcraftsmanship.glidetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView ivTest = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        ivTest = (ImageView) findViewById(R.id.ivTest);
        Glide.with(this)
                .load("http://www.gettyimages.pt/gi-resources/images/Homepage/Hero/PT/PT_hero_42_153645159.jpg")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.imagenotfound)
                .override(200, 200)
                .centerCrop()
                .into(ivTest);
    }
}
