package com.example.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FirstFragment extends Fragment {
	View view = null;
	MainActivity mainActivity;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mainActivity = (MainActivity) getActivity();
		view = inflater.inflate(R.layout.one, container, false);
		mainActivity.setTitle("更改了标题");
		//绑定组件
		findview();
		
		return view;
	}
	private void findview() {
		Button clickBt=(Button) view.findViewById(R.id.firstfragmentbt);
		//按钮的点击事件
		clickBt.setOnClickListener(new btOnclick());
	}
	class btOnclick implements OnClickListener{

		@Override
		public void onClick(View v) {
			openFragment();
		}
	}
	
	private void openFragment(){
		FourthFragment fm_four = new FourthFragment();
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		transaction.hide(this);
		transaction.add(R.id.id_content, fm_four);
		transaction.addToBackStack(null);
		transaction.commit();
	}
	

}
