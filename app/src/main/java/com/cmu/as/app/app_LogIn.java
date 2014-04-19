package com.cmu.as.app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cmu.apointmentscedulerpatient.app.R;
import com.cmu.as.entities.patient.Patient;
import com.cmu.as.socket.PatSocket;


public class app_LogIn extends ActionBarActivity {
    PatSocket patSocket;

    TextView id = null;
    TextView pw = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        this.id = (TextView) super.findViewById(R.id.id);
        this.pw = (TextView) super.findViewById(R.id.pw);
        patSocket = (PatSocket) getApplicationContext();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.log_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIn(View view) {
//        String idAndPw = id.getText().toString()+"\n"+pw.getText().toString();
//        patSocket.sendOutput(idAndPw);
//        if (((String)patSocket.getInput()).equals("1")) {
            patSocket.creatPatient((Patient) (patSocket.getInput()));
            patSocket.closeSession();
            Intent intent = new Intent(this, app_SelectHospital.class);
            startActivity(intent);
//        } else {
//            //show a toast
//            Context context = getApplicationContext();
//            CharSequence text = "Please try again!";
//            int duration = Toast.LENGTH_LONG;
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        }
    }


}
