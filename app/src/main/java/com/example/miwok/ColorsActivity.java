package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> words =new ArrayList<Word>();
        ListView listView = (ListView) findViewById(R.id.colorview);
        words.add(new Word("Red","#ff0000", R.drawable.color_black));
        words.add(new Word("Red","#ff0000", R.drawable.color_brown));
        words.add(new Word("Red","#ff0000", R.drawable.color_dusty_yellow));
        words.add(new Word("Red","#ff0000", R.drawable.color_gray));
        words.add(new Word("Red","#ff0000", R.drawable.color_green));
        words.add(new Word("Red","#ff0000", R.drawable.color_mustard_yellow));
        words.add(new Word("Red","#ff0000",R.drawable.color_red));
        words.add(new Word("Red","#ff0000", R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this,words);
        listView.setAdapter(adapter);


    }
}