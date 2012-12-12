package com.example.duchiviewevents;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements View.OnClickListener {
	private android.view.View.OnClickListener radio_listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			RadioButton rb = (RadioButton)v;
			Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
			
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button)findViewById(R.id.button1);
		final EditText edittext = (EditText)findViewById(R.id.editText1);
		final CheckBox chkbox = (CheckBox)findViewById(R.id.checkBox1);
		final RadioButton red = (RadioButton)findViewById(R.id.radioButton1);
		final RadioButton blue = (RadioButton)findViewById(R.id.radioButton2);
		final ToggleButton tbtn = (ToggleButton)findViewById(R.id.button3);
		final RatingBar ratebar = (RatingBar)findViewById(R.id.ratingBar1);
		final Button custombtn = (Button)findViewById(R.id.button4);

		// 1. button onclick event
		button.setOnClickListener(this);
		
		// 2. edittext box enter key event
		edittext.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if((event.getAction() == KeyEvent.ACTION_DOWN) && (KeyEvent.KEYCODE_ENTER == keyCode)) {
					Toast.makeText(getApplicationContext(), edittext.getText(), Toast.LENGTH_SHORT).show();
					return true;
				}
				
				return false;
			}
		});
		
		// 3. checkbox event
		chkbox.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((CheckBox)v).isChecked()) {
					Toast.makeText(getApplicationContext(), "Selected", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(), "Not selected", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		// 4. radio button
		red.setOnClickListener(radio_listener);
		blue.setOnClickListener(radio_listener);
		
		
		// 5. toggle button
		tbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(tbtn.isChecked()) {
					Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(), "Not checked", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		// 6. rating bar
		ratebar.setOnRatingBarChangeListener(new  RatingBar.OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "New Rating:"+rating, Toast.LENGTH_SHORT).show();
			}
		});
		
		// 7. custom button
		custombtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Beep Bop:", Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Pressed", Toast.LENGTH_SHORT).show();
		
	}
	
	public void myClickListener(View target) {
		Toast.makeText( getApplicationContext(), "Pressed 2", Toast.LENGTH_SHORT).show();
	}

}
