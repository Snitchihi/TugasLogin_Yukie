package com.example.tugaslogin_yukie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class BeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        TextView newsText = (TextView) findViewById(R.id.news_text);
        newsText.setMovementMethod(new ScrollingMovementMethod());
    }
}