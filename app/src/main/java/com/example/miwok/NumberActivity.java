package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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



        ArrayList<Word> words = new ArrayList<Word>();
        ListView listView= (ListView) findViewById(R.id.numberView);

        words.add(new Word("1","one",R.drawable.number_one));  //        Word w = new Word("1","one");
        words.add(new Word("2","Two",R.drawable.number_two));
        words.add(new Word("3","Three",R.drawable.number_three));
        words.add(new Word("4","Four",R.drawable.number_four));
        words.add(new Word("5","Five",R.drawable.number_five));
        words.add(new Word("6","Six",R.drawable.number_six));
        words.add(new Word("7","Seven",R.drawable.number_seven));
        words.add(new Word("8","Eight",R.drawable.number_eight));
        words.add(new Word("9","Nine",R.drawable.number_nine));
        words.add(new Word("10","Ten",R.drawable.number_ten));




        WordAdapter adapter = new WordAdapter(this,words);

        listView.setAdapter(adapter);

    }
}