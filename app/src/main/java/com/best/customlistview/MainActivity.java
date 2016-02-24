package com.best.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.best.cutomlistview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList data;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init list view
        list = (ListView) findViewById(R.id.list);

        //mock data
        data = new ArrayList();
        for (int i = 0; i < 100; i++) {
            data.add(new Model("Item " + i));
        }


        //create and set adapter
        adapter = new CustomAdapter(this,data);
        list.setAdapter(adapter);
    }
}
