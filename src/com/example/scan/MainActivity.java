package com.example.scan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onclick(View view)
	{
		IntentIntegrator integrator = new IntentIntegrator(this);
		integrator.initiateScan();
	}
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
		if(intentResult!=null)
		{
			System.out.println(intentResult.getContents());
		}
	}

}
