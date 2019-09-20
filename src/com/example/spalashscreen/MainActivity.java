package com.example.spalashscreen;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
ImageView jimg1;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jimg1=(ImageView)findViewById(R.id.img1);
        mp=MediaPlayer.create(MainActivity.this,R.raw.txyz);
        mp.start();
        Thread t=new Thread()
        {
        	public void run()
        	{
        		try
        		{
        			Thread.sleep(5000);
        		}
        		catch(Exception e)
        		{
        			Log.d("Error in Thread",e.toString());
        		}
        		finally
        		{
        			Intent intent = new Intent(MainActivity.this, AfterSplash.class);
        		    startActivity(intent);	
        		}
        	}
        };
   t.start();
    }


   
    
}
