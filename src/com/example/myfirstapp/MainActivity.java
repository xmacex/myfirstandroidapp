package com.example.myfirstapp;

import android.app.Activity;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends Activity
{
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	/** Called when the user presses the Send button. */
	public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
}
