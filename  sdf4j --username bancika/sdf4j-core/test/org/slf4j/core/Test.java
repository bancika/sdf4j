package org.slf4j.core;

import org.sdf4j.core.Color;
import org.sdf4j.core.Font;
import org.sdf4j.core.ICanvas;

/**
 * Test class that draws test graphics on the provided canvas.
 * 
 * @see #drawSample(ICanvas)
 * @author Branislav Stojkovic
 */
public class Test {

	public static void drawSample(ICanvas canvas) {
		canvas.setAntiAlias(true);
		canvas.setColor(Color.red);
		canvas.fillOval(10, 10, 40, 40);
		canvas.setColor(Color.blue);
		canvas.drawOval(10, 10, 40, 40);
		canvas.drawLine(10, 10, 50, 50);
		canvas.saveTransform();
		canvas.rotate(Math.PI / 4, 80, 80);
		canvas.setColor(Color.yellow);
		canvas.fillRect(65, 65, 30, 30);
		canvas.setColor(Color.blue);
		canvas.drawRect(65, 65, 30, 30);
		canvas.restoreTransform();
		canvas.setColor(Color.black);
		canvas.setFont(new Font("Tahoma", Font.BOLD, 14));
		canvas.drawString("test", 50, 20);
		canvas.saveTransform();
		canvas.scale(1.2, 0.8);
		canvas.setColor(Color.white);
		canvas.fillRoundRect(80, 10, 30, 30, 10, 10);
		canvas.setColor(Color.black);
		canvas.drawRoundRect(80, 10, 30, 30, 10, 10);
		canvas.restoreTransform();
	}
}
