package com.example.nourah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class y2015 extends AppCompatActivity {

    ListView list;


    String[] itemname ={
            "Task Organizer",
            "Game Focus",
            "Art Gallery ",
            "Ace Arcade",

    };

    Integer[] imgid={
            R.drawable.task,
            R.drawable.light,
            R.drawable.art,
            R.drawable.game,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("go back");

        setContentView(R.layout.activity_y2015);


        adapter2017 adapter = new adapter2017(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list) ;

        list.setAdapter(adapter);
        Log.d("rr", "t4");
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(view.getContext(),taskOrganiz.class);
                    startActivityForResult(i, 0);
                }

                if (position == 1) {
                    Intent i = new Intent(view.getContext(),GameFocus.class);
                    startActivityForResult(i, 1);
                }


                if (position == 2) {
                    Intent i = new Intent(view.getContext(),ArtGallery.class);
                    startActivityForResult(i, 2);
                }

                if (position == 3) {
                    Intent i = new Intent(view.getContext(),AceArcade.class);
                    startActivityForResult(i, 3);
                }

            }
        });
    }


    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }}