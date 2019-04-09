package com.example.fragmentdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	String TAG="TAG";
	FragmentTransaction transaction = null;
	mainFragment fm_main = null;
	FragmentManager fm = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFM();
	}
	
	private void initFM() {
		fm = getFragmentManager();
		transaction = fm.beginTransaction();
		if (fm_main == null) {
			fm_main = new mainFragment();
			transaction.add(R.id.id_content, fm_main);
			Log.i("TAG", "主Fragment");
		} else {
			transaction.show(fm_main);
		}
		transaction.commit();
	}
}
