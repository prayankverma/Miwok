package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


       ListView listView= (ListView) findViewById(R.id.numberView);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("1","one"));  //        Word w = new Word("1","one");
        words.add(new Word("2","Two"));
        words.add(new Word("3","Three"));
        words.add(new Word("4","Four"));
        words.add(new Word("5","Five"));
        words.add(new Word("6","Six"));
        words.add(new Word("7","Seven"));
        words.add(new Word("8","Eight"));
        words.add(new Word("9","Nine"));
        words.add(new Word("10","Ten"));



        WordAdapter adapter = new WordAdapter(this,words);

        listView.setAdapter(adapter);

    }
}