package com.example.newgames;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	Button btn1;
	EditText edName,edPass;
	Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        edName = (EditText) findViewById(R.id.edt1);
        edPass = (EditText) findViewById(R.id.edt2);
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),DangkiActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Register", Toast.LENGTH_LONG).show();
				
				
			}
		});
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if((edName.getText().toString().equals("admin")) & (edPass.getText().toString().equals("admin"))){
					Intent intent2 = new Intent(getApplicationContext(),DangnhapActivity.class);
					startActivity(intent2);
					Toast.makeText(getApplicationContext(), "Let's Go", Toast.LENGTH_LONG).show();
				}else{
					Toast.makeText(getApplicationContext(), "No Pass", Toast.LENGTH_LONG).show();

				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}
