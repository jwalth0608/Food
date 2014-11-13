package com.example.foodapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;


public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.example.foodapp.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
        case R.id.action_search:
        	openSearch();
        	return true;
        
        case R.id.action_settings:
        	openSettings();
        	return true;
        default: 
        	return super.onOptionsItemSelected(item);
        }
        
    }
    
    private void openSettings() {
		// TODO Auto-generated method stub
		
	}


	private void openSearch() {
		// TODO Auto-generated method stub
		
	}


	/** Called when the user clicks the Send button */
    public void sendMessage(View view){
    	// Do something in response to the button
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	startActivity(intent);
    }

}
