package com.example.jkd.kvkolkataregion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FortWilliam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fort_william);

        ListView listView =findViewById(R.id.listview);
        ArrayList<String> school = new ArrayList<String >();

        school.add("Home Page");
        school.add("Address/Location");
        school.add("Alumni");
        school.add("Admission");
        school.add("Contact");



        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,school);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(FortWilliam.this, HomePagefw.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(FortWilliam.this, FortWilliamContact.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(FortWilliam.this, FwAlumni.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(FortWilliam.this, FwAd.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(FortWilliam.this,FwAdm.class);
                    startActivity(intent);
                }



            }
        });


    }
}
