package com.cmu.as.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cmu.apointmentscedulerpatient.app.R;


public class app_DocumentActivity extends ActionBarActivity {

    private Button ret = null;
//
//	private String data[][] = new String[][] {{"Priscription","PDF","01/09/2013 15:30"}
//	,{"CT","Photo","01/21/2013 13:30"}};
//
//	private ListView datalist = null;
//	private List<Map<String,String>> list = new ArrayList<Map<String,String>>();
//	private SimpleAdapter simpleAdapter = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_document);
        this.ret = (Button) super.findViewById(R.id.doc_back);
//		this.datalist = (ListView) super.findViewById(R.id.doclist);
//		for (int x = 0;x < this.data.length;x++) {
//			Map<String,String> map = new HashMap<String, String>();
//			map.put("doc", this.data[x][0]);
//			map.put("type", this.data[x][1]);
//			map.put("doc_time", this.data[x][2]);
//			this.list.add(map);
//		}
//		this.simpleAdapter = new SimpleAdapter(this, this.list, R.layout.doc_list,
//				new String[]{"doc","type","doc_time"}, new int[]{R.id.doc, R.id.type, R.id.doc_time});
//		this.datalist.setAdapter(this.simpleAdapter);
//		this.datalist.setOnItemClickListener(new OnItemClickListenerImpl());
        this.ret.setOnClickListener(new OnClickListenerImpl());
    }

//	private class OnItemClickListenerImpl implements OnItemClickListener {
//		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//			Map<String, String> map = (Map<String, String>) app_DocumentActivity.this.
//					simpleAdapter.getItem(position);  //just save for now for later use, not for this assignment
//		}
//	}

    private class OnClickListenerImpl implements OnClickListener {
        public void onClick(View v){
            Intent it = new Intent(app_DocumentActivity.this, app_PastDetialActivity.class);
            app_DocumentActivity.this.startActivity(it);
            app_DocumentActivity.this.finish();
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
