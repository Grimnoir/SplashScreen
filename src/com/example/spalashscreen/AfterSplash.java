package com.example.spalashscreen;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AfterSplash extends Activity {
	ListView jlv;
	String[] arr={"Karnataka","Kerala","Mumbai","Pune"};
	
	protected void OnCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aftersplash);
		jlv=(ListView)findViewById(R.id.lv1);
		ArrayAdapter<String>adp=new ArrayAdapter<String>(AfterSplash.this,android.R.layout.simple_list_item_1,arr);
		jlv.setAdapter(adp);
		jlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) 
			{
				Toast.makeText(getApplicationContext(), "You Have Clicked On"+arr[arg2],Toast.LENGTH_LONG).show();
				for(int i=0;i<jlv.getChildCount();i++)
				{
				jlv.getChildAt(i).setBackgroundColor(Color.TRANSPARENT)	;
				}
				jlv.getChildAt(arg2).setBackgroundColor(Color.RED);
			}
			
		});
	}

}
