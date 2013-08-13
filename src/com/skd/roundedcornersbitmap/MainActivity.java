package com.skd.roundedcornersbitmap;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Bitmap bm1 = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
		CircleDrawable circleDrawable = new CircleDrawable(bm1);
		Bitmap bm2 = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
		RoundedDrawable roundedDrawable = new RoundedDrawable(bm2);
		
		ImageView circleView = (ImageView) findViewById(R.id.imageView1);
		circleView.setImageDrawable(circleDrawable);
		
		ImageView roundedView = (ImageView) findViewById(R.id.imageView2);
		roundedView.setImageDrawable(roundedDrawable);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
