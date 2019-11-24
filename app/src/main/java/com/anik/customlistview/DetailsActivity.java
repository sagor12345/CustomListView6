package com.anik.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.profile_image);
        textView = findViewById(R.id.Name);

        Bundle extras = getIntent().getExtras();
        String userName;

        if (extras != null) {
            userName = getIntent().getStringExtra("name");
           int  img = getIntent().getIntExtra("ig", 0);

            imageView.setImageResource(img);
            textView.setText(userName);
        }


    }
}
