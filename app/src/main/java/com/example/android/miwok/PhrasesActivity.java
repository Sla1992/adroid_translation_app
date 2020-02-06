package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("Hallo, wie geht es dir?", "Zdravo kako si"));
        words.add(new Word("Wie heisst du?", "Kako se zoves"));
        words.add(new Word("Mein Name ist Paul, freut mich", "Zovem se Paul, drago mi je"));
        words.add(new Word("Wie alt bist du?", "Koliko imas godina"));
        words.add(new Word("Echt? Du siehst viel jünger aus", "Stvarno? Izgledas puno mladje"));
        words.add(new Word("Ich bin 20 Jahre alt", "Imam 20 godina"));
        words.add(new Word("Wollen wir etwas trinken?", "Hocemo li nesto za pice?"));
        words.add(new Word("Ja, gerne", "Da, rado"));
        words.add(new Word("Nein", "Ne"));
        words.add(new Word("Krieg ich deine Nummer?", "Mogu li dobiti tvoj broj?"));
        words.add(new Word("Willst du sex?", "Da li zelis seks"));
        words.add(new Word("Gehen wir zu mir nach Hause oder zu dir?", "Idemo li kod mene ili kod tebe?"));
        words.add(new Word("Nimmst du die Pille?", "Da li uzimaš tabletu"));
        words.add(new Word("Wo ist Paul?", "Gde je paul?"));
        words.add(new Word("Wo ist das WC?", "Gde se nalazi WC?"));
        words.add(new Word("Ich muss scheissen", "Moram da sranjam"));
        words.add(new Word("Ich muss pissen", "Moram da pisam"));

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
