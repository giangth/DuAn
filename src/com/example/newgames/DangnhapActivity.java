package com.example.newgames;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class DangnhapActivity extends ActionBarActivity {
ImageButton ibtn1;
ImageButton ibtn2;
ImageButton ibtn3;
ImageButton ibtn4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dangnhap);
		ibtn1 = (ImageButton) findViewById(R.id.ibtnGame1);
		ibtn2 = (ImageButton) findViewById(R.id.ibtnGame2);
		ibtn3 = (ImageButton) findViewById(R.id.ibtnGame3);
		ibtn4 = (ImageButton) findViewById(R.id.ibtnGame4);
		ibtn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myActivity = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sohagame.vn/list-game/"));
				startActivity(myActivity);
			}
		});
		ibtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myActivity = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gamek.vn/mobile-social/top-game-mobile-mien-phi-hay-nhat-tren-android-moi-ra-mat-20140921035216684.chn"));
				startActivity(myActivity);
			}
		});
		ibtn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myActivity = new Intent(Intent.ACTION_VIEW, Uri.parse("http://taigame.wap.vn//"));
				startActivity(myActivity);
			}
		});
		ibtn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myActivity = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gamek.vn/mobile-social/top-game-mobile-online-dang-choi-nhat-thang-10-20131017012514363.chn"));
				startActivity(myActivity);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dangnhap, menu);
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
