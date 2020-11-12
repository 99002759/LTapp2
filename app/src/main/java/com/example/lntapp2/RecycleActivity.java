package com.example.lntapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecycleActivity extends AppCompatActivity {
    String[] languagesData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        languagesData = new String[]{"english","hindi","urdu","arabic","kannada"};
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //MyAdapter adapter = new MyAdapter(languagesData);
    }
}