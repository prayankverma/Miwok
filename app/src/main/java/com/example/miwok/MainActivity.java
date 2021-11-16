package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numberView = (TextView) findViewById(R.id.textView1);
        TextView familymemberView = (TextView) findViewById(R.id.textView2);
        TextView colorsView = (TextView) findViewById(R.id.textView3);
        TextView phrasesView = (TextView) findViewById(R.id.textView4);


        numberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), NumberActivity.class);
                startActivity(intent);
            }

        });

        familymemberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FamilyMemberActivity.class);
                startActivity(intent);
            }
        });

        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
                startActivity(intent);
            }
        });

        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PhrasesActivity.class);
                startActivity(intent);
            }
        });


    }

}