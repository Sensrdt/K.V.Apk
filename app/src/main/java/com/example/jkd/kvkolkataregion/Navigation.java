package com.example.jkd.kvkolkataregion;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



import java.util.ArrayList;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        openDialog1();

        ListView listView =findViewById(R.id.listview);
        ArrayList<String> school = new ArrayList<String >();

        school.add("K.V.Cossipore");
        school.add("K.V.SaltLake 1");
        school.add("K.V.SaltLake 2");
        school.add("K.V.O.F.Dum Dum");
        school.add("K.V.Fort William");
        school.add("K.V.Ishapore 1");
        school.add("K.V.Ishapore 2");
        school.add("K.V.Ballygung");
        school.add("K.V.Army Barrackpore");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,school);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Navigation.this,Cossipore.class);
                    startActivity(intent);}
                if(position==1){
                    Intent intent = new Intent(Navigation.this,SaltLake1.class);
                    startActivity(intent);}
                if(position==2){
                    Intent intent = new Intent(Navigation.this,SaltLake2.class);
                    startActivity(intent);}
                if(position==3){
                    Intent intent = new Intent(Navigation.this,OfDumDum.class);
                    startActivity(intent);}
                if(position==4){
                    Intent intent = new Intent(Navigation.this,FortWilliam.class);
                    startActivity(intent);}
                if(position==5){
                    Intent intent = new Intent(Navigation.this,Ishapore1.class);
                    startActivity(intent);}
                if(position==6){
                    Intent intent = new Intent(Navigation.this,Ishapore2.class);
                    startActivity(intent);}
                if(position==7){
                    Intent intent = new Intent(Navigation.this,Ballygaung.class);
                    startActivity(intent);}
                if(position==8){
                    Intent intent = new Intent(Navigation.this,Barrackpore.class);
                    startActivity(intent);}
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent=new Intent(Navigation.this,Aboutkv.class);
            startActivity(intent);


        }  else if (id == R.id.developer) {Intent intent=new Intent(Navigation.this,Developer.class);
            startActivity(intent);

            } else if (id == R.id.feedback) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String sharebody = "Download this app";
            String sharesub = "K.V.Kolkata Region";
            intent.putExtra(Intent.EXTRA_SUBJECT,sharebody);
            intent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(intent,"Share using"));

        } else if (id == R.id.mentions) {
            Intent intent = new Intent(Navigation.this,HonourableMentions.class);
            startActivity(intent);

        }
        else if (id==R.id.fee){
            Intent intent = new Intent(Navigation.this,Fee.class);
            startActivity(intent);
            
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void openDialog1(){
        FeeAlert feeAlert = new FeeAlert();
        feeAlert.show(getSupportFragmentManager(),"Message!!!");
    }

}
