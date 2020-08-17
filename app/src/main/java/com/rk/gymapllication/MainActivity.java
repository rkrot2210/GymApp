package com.rk.gymapllication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mainListView;
    ListView videoLibraryListView;
    private ArrayList<Integer> cardList;
    private ArrayList<Integer> videoLibraryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_card);

cardList = new ArrayList<>();
videoLibraryList = new ArrayList<>();

cardList.add(R.drawable.main_card1);
cardList.add(R.drawable.main_card2);
cardList.add(R.drawable.main_card3);
cardList.add(R.drawable.main_card4);
cardList.add(R.drawable.main_card5);

videoLibraryList.add(R.drawable.trainer_card1);
videoLibraryList.add(R.drawable.treiner_card2);
videoLibraryList.add(R.drawable.treiner_card3);
videoLibraryList.add(R.drawable.treiner_card4);

mainListView = findViewById(R.id.list_card);
videoLibraryListView = findViewById(R.id.video_list);

//MainUserAdapter mainUserAdapter = new MainUserAdapter(this,cardList);
//mainListView.setAdapter(mainUserAdapter);

     //   MainUserAdapter videoLibraryAdapter = new MainUserAdapter(this,videoLibraryList);
     //   videoLibraryListView.setAdapter(videoLibraryAdapter);

        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


    }
}
