package com.example.fragmentdemo;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {
	MainActivity mainActivity;
	View view = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mainActivity = (MainActivity) getActivity();
		view = inflater.inflate(R.layout.two, container, false);
		return view;
	}

}
