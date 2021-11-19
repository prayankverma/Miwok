package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorREsourceId;
    private int mColorREsourceId2;


    public WordAdapter(@NonNull Context context, ArrayList<Word> words,int mColorREsourceId,int mColorREsourceId2) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, words);
        this.mColorREsourceId=mColorREsourceId;
        this.mColorREsourceId2=mColorREsourceId2;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmDefaultTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmMiwokTranslation());
        ImageView imageView =listItemView.findViewById(R.id.imageView3);
        int color1 = ContextCompat.getColor(getContext(),mColorREsourceId2);
        imageView.setBackgroundColor(color1);
        if(currentWord.hasimage()){

        imageView.setImageResource(currentWord.getmImageResourceId());}
        else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorREsourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }
}
