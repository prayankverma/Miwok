package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);


        ArrayList<Word> words = new ArrayList<Word>();
        ListView listView= (ListView) findViewById(R.id.familyView);

        words.add(new Word("1","Daughter",R.drawable.family_daughter));  //        Word w = new Word("1","one");
        words.add(new Word("2","Father", R.drawable.family_father));
        words.add(new Word("3","Grandfather", R.drawable.family_grandfather));
        words.add(new Word("5","Mother", R.drawable.family_mother));
        words.add(new Word("6","Older Brother", R.drawable.family_older_brother));
        words.add(new Word("8","Older Sister", R.drawable.family_older_sister));
        words.add(new Word("9","Son", R.drawable.family_son));
        words.add(new Word("10","Younger Brother", R.drawable.family_younger_brother));




        WordAdapter adapter = new WordAdapter(this,words,R.color.pink,R.color.pink_lite);

        listView.setAdapter(adapter);

    }
}