package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);



        ArrayList<Word> words = new ArrayList<>();
        ListView listView= (ListView) findViewById(R.id.phraseView);

        words.add(new Word("1","That was my fault."));  //        Word w = new Word("1","one");
        words.add(new Word("2","I can't tell you how much"));
        words.add(new Word("3","I loved the way you handled that"));
        words.add(new Word("4","Can I get your advice on this?"));
        words.add(new Word("5","I'm happy to see you!"));
        words.add(new Word("6","I trust your judgment."));
        words.add(new Word("7","What was the highlight of your day ?"));
        words.add(new Word("8","I couldn't have done it without you."));
        words.add(new Word("9","What can I do to help?"));
        words.add(new Word("10","Tell me about why ..."));



        WordAdapter adapter = new WordAdapter(this,words,R.color.yellow,R.color.yellow_lite);

        listView.setAdapter(adapter);



    }
}