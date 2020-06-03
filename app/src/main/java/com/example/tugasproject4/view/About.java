package com.example.tugasproject4.view;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.tugasproject4.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {

    private CircleImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.image_about);

        Glide.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQtS476YIp3NiGt4WnE3ddlQK9bVCe6wS4hxifX9F5doC04MREn&usqp=CAU")
                .into(imageView);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
