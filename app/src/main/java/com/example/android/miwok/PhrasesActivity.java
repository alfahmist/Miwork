package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus",-1));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",-1));
        words.add(new Word("My name is...", "oyaaset...",-1));
        words.add(new Word("How are you feeling?", "michәksәs?",-1));
        words.add(new Word("I’m feeling good.", "kuchi achit",-1));
        words.add(new Word("Are you coming?", "әәnәs'aa?",-1));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",-1));
        words.add(new Word("I’m coming.", "әәnәm",-1));
        words.add(new Word("Let’s go.", "yoowutis",-1));
        words.add(new Word("Come here.", "әnni'nem",-1));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}