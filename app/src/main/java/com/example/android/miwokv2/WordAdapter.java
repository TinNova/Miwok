package com.example.android.miwokv2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tin on 11/04/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the background colour for this list of words
     */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        super(context, 0, words);

        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);


            Word currentWord = getItem(position);

            TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
            miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

            TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

            ImageView imageResourceIdImageView = (ImageView) listItemView.findViewById(R.id.image);

            if (currentWord.hasImage()) {

                imageResourceIdImageView.setImageResource(currentWord.getImageResourceId());

                imageResourceIdImageView.setVisibility(View.VISIBLE);

            } else {

                imageResourceIdImageView.setVisibility(View.GONE);

            }

            View textContainer = listItemView.findViewById(R.id.text_container);

            int color = ContextCompat.getColor(getContext(), mColorResourceId);

            textContainer.setBackgroundColor(color);

        }

        return listItemView;

    }
}
