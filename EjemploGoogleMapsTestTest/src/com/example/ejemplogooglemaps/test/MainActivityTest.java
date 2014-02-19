package com.example.ejemplogooglemaps.test;

import com.example.ejemplogooglemaps.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
	private MainActivity mainActivity;

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	public void testPrecondictions() {
		mainActivity = getActivity();
		assertNotNull("mainActivity is null", mainActivity);
	}
	
	
}
