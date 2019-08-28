package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.back);
        view.getBackground().setAlpha(99);

    }
    public void onClick(View view) {
        Uri webpage = Uri.parse("https://www.google.com/maps/place/227+Ada+Ave+B,+Mountain+View,+CA+94043/@37.3957021,-122.0666244,17z/data=!3m1!4b1!4m5!3m4!1s0x808fb73c4f26427b:0x2b131fdea658e7f!8m2!3d37.3956979!4d-122.0644357");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

}


}
