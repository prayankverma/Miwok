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

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, words);
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
        if(currentWord.hasimage()){

        imageView.setImageResource(currentWord.getmImageResourceId());}
        else{
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }
}
