package com.example.simplifly;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpliflyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
setContentView(R.layout.main);
		
		final TextView nameview = (TextView) findViewById(R.id.nameview);
		final EditText namefield = (EditText) findViewById(R.id.namefield);
		
		TextView passwordview = (TextView) findViewById(R.id.passwordview);
		EditText passwordfield = (EditText) findViewById(R.id.passwordfield);
		
		Button button =  (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				nameview.setText("Hello," + namefield.getText());
			}
		});

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simplifly, menu);
		return true;
	}

}
