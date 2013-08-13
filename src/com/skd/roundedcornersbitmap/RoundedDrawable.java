package com.skd.roundedcornersbitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class RoundedDrawable extends Drawable {

	protected RectF shapeRect;
	protected Paint shapePaint;

	public RoundedDrawable(Bitmap bm) {
		BitmapShader shader = new BitmapShader(bm, TileMode.CLAMP, TileMode.CLAMP);
		
		shapePaint = new Paint();
		shapePaint.setAntiAlias(true);
		shapePaint.setShader(shader);
		
		shapeRect = new RectF(0, 0, bm.getWidth(), bm.getHeight());
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawRoundRect(shapeRect, 20, 20, shapePaint);
	}

	@Override
	public int getOpacity() {
		return 0;
	}

	@Override
	public void setAlpha(int alpha) {

	}

	@Override
	public void setColorFilter(ColorFilter cf) {

	}

}
