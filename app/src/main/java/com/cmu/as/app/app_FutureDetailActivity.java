package com.cmu.as.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.cmu.apointmentscedulerpatient.app.R;


public class app_FutureDetailActivity extends ActionBarActivity {

    private TextView detail = null;
    private Button ret = null;
    private Button cancel = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_future_detail);
        this.detail = (TextView) super.findViewById(R.id.f_detail);
        this.ret = (Button) super.findViewById(R.id.f_ret);
        this.cancel = (Button) super.findViewById(R.id.f_cancel_apmt);
        this.detail.setText("Future Appointment 1");
        this.ret.setOnClickListener(new OnClickListenerImpl());
    }

    private class OnClickListenerImpl implements OnClickListener {

        //if user press return button, the current activity will be finished
        //and return to the previous activity
        //because startActivityForResult is used in the previous activity
        public void onClick(View v){
            Intent it = new Intent(app_FutureDetailActivity.this, app_FutureActivity.class);
            app_FutureDetailActivity.this.startActivity(it);
            app_FutureDetailActivity.this.finish();
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
