package com.example.project2_realm_revision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    Adapter adapter;
    ArrayList<String> students;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=(ListView)findViewById(R.id.listview_id);

        Realm realm=Realm.getDefaultInstance();
        RealmHelper helper=new RealmHelper(realm);
        students=helper.retrieve();
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,students);
        listView.setAdapter((ListAdapter) adapter);
    }

}

