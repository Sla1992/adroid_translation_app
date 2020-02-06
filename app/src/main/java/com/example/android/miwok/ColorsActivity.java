package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("Aqua", "Vodeno"));
        words.add(new Word("Black", "Crno"));
        words.add(new Word("Blue", "Plavo"));
        words.add(new Word("Cream", "Krem"));
        words.add(new Word("Gold", "Zlatno"));
        words.add(new Word("Pink", "Pink"));
        words.add(new Word("Red", "Crveno"));
        words.add(new Word("Rose", "Roze"));
        words.add(new Word("Silver", "Srebrno"));
        words.add(new Word("White", "Belo"));
        words.add(new Word("Yellow", "Zuto"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

//        for(int index = 0; index < words.size(); index++){
//
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//            Log.v("NumbersActivity", "Word at index: "+ index + " | Value: " + words.get(index));
//        }




//        Log.v("NumbersActivity", "Word at index 0: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(9));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(10));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(11));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(12));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(13));
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(14));

    }
}
