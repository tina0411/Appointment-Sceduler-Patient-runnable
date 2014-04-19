package com.cmu.as.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cmu.apointmentscedulerpatient.app.R;
import com.cmu.as.socket.PatSocket;


public class app_InfoActivity extends ActionBarActivity {
    PatSocket patSocket;

    private EditText name = null;
    private EditText age = null;
    private EditText sex = null;
    private EditText insurance = null;
    private Button cancel = null;
    private Button confirm = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_info);
        patSocket = (PatSocket) getApplicationContext();
        this.name = (EditText)super.findViewById(R.id.name);
        this.age = (EditText)super.findViewById(R.id.age);
        this.sex = (EditText)super.findViewById(R.id.sex);
        this.insurance = (EditText)super.findViewById(R.id.insurance);
        this.cancel = (Button)super.findViewById(R.id.info_cancel);
        this.confirm = (Button)super.findViewById(R.id.info_confirm);

        this.name.setText(patSocket.getPatInerface().getPatName());
        this.age.setText(patSocket.getPatInerface().getPatAge());
        this.sex.setText(patSocket.getPatInerface().getPatGender());
        this.insurance.setText(patSocket.getPatInerface().getPatInsurance());

        this.confirm.setOnClickListener(new conOnClickListener());
        this.cancel.setOnClickListener(new canOnClickListener());
    }

    private class conOnClickListener implements View.OnClickListener {
        public void onClick(View v){
            patSocket.sendOutput((Object) patSocket.getPatInerface().getPat());

            //updated successfully in database
            if (((String)patSocket.getInput()).equals("1")) {
                patSocket.getPatInerface().setPatName(name.getText().toString());
                patSocket.getPatInerface().setPatAge(age.getText().toString());
                patSocket.getPatInerface().setPatGender(sex.getText().toString());
                patSocket.getPatInerface().setPatInsurance(insurance.getText().toString());

                //show a toast
                Context context = getApplicationContext();
                CharSequence text = "Updated Successfully!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
    }

    private class canOnClickListener implements View.OnClickListener {
        public void onClick(View v) {
            name.setText(patSocket.getPatInerface().getPatName());
            age.setText(patSocket.getPatInerface().getPatAge());
            sex.setText(patSocket.getPatInerface().getPatGender());
            insurance.setText(patSocket.getPatInerface().getPatInsurance());
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
