package com.example.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FourthFragment extends Fragment {
	View view = null;
	Handler mHandler = null;
	MainActivity mainActivity;
	Button btn_open;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mainActivity = (MainActivity) getActivity();
		view = inflater.inflate(R.layout.four, container, false);
		return view;
	}	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		btn_open = (Button)view.findViewById(R.id.btn_open);
		btn_open.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				openFragment();
			}
		});
	}

	private void openFragment(){
		FiveFragment five = new FiveFragment();
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		transaction.hide(this);
		transaction.add(R.id.id_content, five);
		transaction.addToBackStack(null);
		transaction.commit();
	}
}
