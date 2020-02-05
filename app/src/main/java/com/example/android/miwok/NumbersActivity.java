package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("One", "Jedan"));
        words.add(new Word("Two", "Dva"));
        words.add(new Word("Three", "Tri"));
        words.add(new Word("Four", "Cetiri"));
        words.add(new Word("Five", "Pet"));
        words.add(new Word("Six", "Sest"));
        words.add(new Word("Seven", "Sedam"));
        words.add(new Word("Eight", "Osam"));
        words.add(new Word("Nine", "Devet"));
        words.add(new Word("Ten", "Deset"));
        words.add(new Word("Eleven", "Jedanaest"));
        words.add(new Word("Twelve", "Dvanaest"));
        words.add(new Word("Thirteen", "Trinaest"));
        words.add(new Word("Fourteen", "Cetrnaest"));
        words.add(new Word("Fifteen", "Petnaest"));





        WordAdapter<Word> Adapter =
                new ArrayAdapter<Word>(this, R.layout.list_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

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
