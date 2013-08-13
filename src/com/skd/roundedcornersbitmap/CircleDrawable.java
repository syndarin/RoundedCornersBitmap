package com.skd.roundedcornersbitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CircleDrawable extends RoundedDrawable {
	
	private int cX;
	private int cY;
	private int radius;

	public CircleDrawable(Bitmap bm) {
		super(bm);
		int bmWidth = bm.getWidth();
		int bmHeight = bm.getHeight();
		cX = bmWidth / 2;
		cY = bmHeight / 2;
		radius = cX > cY ? cY : cX;
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawCircle(cX, cY, radius, shapePaint);
	}
	
	

}
