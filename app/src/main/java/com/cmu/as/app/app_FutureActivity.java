package com.cmu.as.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.cmu.apointmentscedulerpatient.app.R;


public class app_FutureActivity extends ActionBarActivity {

    private String f_data[][] = new String[][] {{"KPMC","Batman","01/02/2013 13:30"},
            {"KPMC","Batman","01/02/2013 13:30"},{"KPMC","Batman","01/02/2013 13:30"}};

    private ListView f_datalist = null;
    private List<Map<String,String>> f_list = new ArrayList<Map<String,String>>();
    private SimpleAdapter simpleAdapter = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_future);
        this.f_datalist = (ListView) super.findViewById(R.id.future_datalist);
        for (int x = 0;x < this.f_data.length;x++) {
            Map<String,String> map = new HashMap<String, String>();
            map.put("f_hos", this.f_data[x][0]);
            map.put("f_doc", this.f_data[x][1]);
            map.put("f_time", this.f_data[x][2]);
            this.f_list.add(map);
        }
        this.simpleAdapter = new SimpleAdapter(this, this.f_list, R.layout.future_data_list,
                new String[]{"f_hos","f_doc","f_time"}, new int[]{R.id.f_hos, R.id.f_doc, R.id.f_time});
        this.f_datalist.setAdapter(this.simpleAdapter);
        this.f_datalist.setOnItemClickListener(new OnItemClickListenerImpl());
    }

    private class OnItemClickListenerImpl implements OnItemClickListener{
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String, String> map = (Map<String, String>) app_FutureActivity.this.
                    simpleAdapter.getItem(position);  //just save for now for later use, not for this assignment
            Intent it = new Intent(app_FutureActivity.this, app_FutureDetailActivity.class);
            app_FutureActivity.this.startActivity(it);
            app_FutureActivity.this.finish();
        }
    }

    public void newTab(View view) {
        Intent intent = new Intent(this, app_SelectHospital.class);
        startActivity(intent);
    }

    public void past(View view){
        Intent intent = new Intent(this, app_PastActivity.class);
        startActivity(intent);

    }

    public void future(View view){
        Intent intent = new Intent(this, app_FutureActivity.class);
        startActivity(intent);

    }

    public void info(View view){
        Intent intent = new Intent(this, app_InfoActivity.class);
        startActivity(intent);

    }

}
