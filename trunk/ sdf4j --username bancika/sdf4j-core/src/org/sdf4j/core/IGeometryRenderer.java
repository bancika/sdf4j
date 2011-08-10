package org.sdf4j.core;

public interface IGeometryRenderer {

	/**
	 * Draws a line, using the current color, between the points
	 * <code>(x1,&nbsp;y1)</code> and <code>(x2,&nbsp;y2)</code> in this
	 * graphics context's coordinate system.
	 * 
	 * @param x1
	 *            the first point's <i>x</i> coordinate.
	 * @param y1
	 *            the first point's <i>y</i> coordinate.
	 * @param x2
	 *            the second point's <i>x</i> coordinate.
	 * @param y2
	 *            the second point's <i>y</i> coordinate.
	 */
	void drawLine(int x1, int y1, int x2, int y2);

	/**
	 * Draws the outline of the specified rectangle. The left and right edges of
	 * the rectangle are at <code>x</code> and <code>x&nbsp;+&nbsp;width</code>.
	 * The top and bottom edges are at <code>y</code> and
	 * <code>y&nbsp;+&nbsp;height</code>. The rectangle is drawn using the
	 * graphics context's current color.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the rectangle to be drawn.
	 * @param y
	 *            the <i>y</i> coordinate of the rectangle to be drawn.
	 * @param width
	 *            the width of the rectangle to be drawn.
	 * @param height
	 *            the height of the rectangle to be drawn.
	 * @see #fillRect
	 * @see #clearRect
	 */
	void drawRect(int x, int y, int width, int height);

	/**
	 * Fills the specified rectangle. The left and right edges of the rectangle
	 * are at <code>x</code> and <code>x&nbsp;+&nbsp;width&nbsp;-&nbsp;1</code>.
	 * The top and bottom edges are at <code>y</code> and
	 * <code>y&nbsp;+&nbsp;height&nbsp;-&nbsp;1</code>. The resulting rectangle
	 * covers an area <code>width</code> pixels wide by <code>height</code>
	 * pixels tall. The rectangle is filled using the graphics context's current
	 * color.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the rectangle to be filled.
	 * @param y
	 *            the <i>y</i> coordinate of the rectangle to be filled.
	 * @param width
	 *            the width of the rectangle to be filled.
	 * @param height
	 *            the height of the rectangle to be filled.
	 * @see #clearRect
	 * @see #drawRect
	 */
	void fillRect(int x, int y, int width, int height);

	/**
	 * Draws an outlined round-cornered rectangle using this graphics context's
	 * current color. The left and right edges of the rectangle are at
	 * <code>x</code> and <code>x&nbsp;+&nbsp;width</code>, respectively. The
	 * top and bottom edges of the rectangle are at <code>y</code> and
	 * <code>y&nbsp;+&nbsp;height</code>.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the rectangle to be drawn.
	 * @param y
	 *            the <i>y</i> coordinate of the rectangle to be drawn.
	 * @param width
	 *            the width of the rectangle to be drawn.
	 * @param height
	 *            the height of the rectangle to be drawn.
	 * @param arcWidth
	 *            the horizontal diameter of the arc at the four corners.
	 * @param arcHeight
	 *            the vertical diameter of the arc at the four corners.
	 * @see #fillRoundRect
	 */
	void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight);

	/**
	 * Fills the specified rounded corner rectangle with the current color. The
	 * left and right edges of the rectangle are at <code>x</code> and
	 * <code>x&nbsp;+&nbsp;width&nbsp;-&nbsp;1</code>, respectively. The top and
	 * bottom edges of the rectangle are at <code>y</code> and
	 * <code>y&nbsp;+&nbsp;height&nbsp;-&nbsp;1</code>.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the rectangle to be filled.
	 * @param y
	 *            the <i>y</i> coordinate of the rectangle to be filled.
	 * @param width
	 *            the width of the rectangle to be filled.
	 * @param height
	 *            the height of the rectangle to be filled.
	 * @param arcWidth
	 *            the horizontal diameter of the arc at the four corners.
	 * @param arcHeight
	 *            the vertical diameter of the arc at the four corners.
	 * @see #drawRoundRect
	 */
	void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight);

	/**
	 * Draws the outline of an oval. The result is a circle or ellipse that fits
	 * within the rectangle specified by the <code>x</code>, <code>y</code>,
	 * <code>width</code>, and <code>height</code> arguments.
	 * <p>
	 * The oval covers an area that is <code>width&nbsp;+&nbsp;1</code> pixels
	 * wide and <code>height&nbsp;+&nbsp;1</code> pixels tall.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the upper left corner of the oval
	 *            to be drawn.
	 * @param y
	 *            the <i>y</i> coordinate of the upper left corner of the oval
	 *            to be drawn.
	 * @param width
	 *            the width of the oval to be drawn.
	 * @param height
	 *            the height of the oval to be drawn.
	 * @see #fillOval
	 */
	void drawOval(int x, int y, int width, int height);

	/**
	 * Fills an oval bounded by the specified rectangle with the current color.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the upper left corner of the oval
	 *            to be filled.
	 * @param y
	 *            the <i>y</i> coordinate of the upper left corner of the oval
	 *            to be filled.
	 * @param width
	 *            the width of the oval to be filled.
	 * @param height
	 *            the height of the oval to be filled.
	 * @see #drawOval
	 */
	void fillOval(int x, int y, int width, int height);

	/**
	 * Draws the outline of a circular or elliptical arc covering the specified
	 * rectangle.
	 * <p>
	 * The resulting arc begins at <code>startAngle</code> and extends for
	 * <code>arcAngle</code> degrees, using the current color. Angles are
	 * interpreted such that 0&nbsp;degrees is at the 3&nbsp;o'clock position. A
	 * positive value indicates a counter-clockwise rotation while a negative
	 * value indicates a clockwise rotation.
	 * <p>
	 * The center of the arc is the center of the rectangle whose origin is
	 * (<i>x</i>,&nbsp;<i>y</i>) and whose size is specified by the
	 * <code>width</code> and <code>height</code> arguments.
	 * <p>
	 * The resulting arc covers an area <code>width&nbsp;+&nbsp;1</code> pixels
	 * wide by <code>height&nbsp;+&nbsp;1</code> pixels tall.
	 * <p>
	 * The angles are specified relative to the non-square extents of the
	 * bounding rectangle such that 45 degrees always falls on the line from the
	 * center of the ellipse to the upper right corner of the bounding
	 * rectangle. As a result, if the bounding rectangle is noticeably longer in
	 * one axis than the other, the angles to the start and end of the arc
	 * segment will be skewed farther along the longer axis of the bounds.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the upper-left corner of the arc to
	 *            be drawn.
	 * @param y
	 *            the <i>y</i> coordinate of the upper-left corner of the arc to
	 *            be drawn.
	 * @param width
	 *            the width of the arc to be drawn.
	 * @param height
	 *            the height of the arc to be drawn.
	 * @param startAngle
	 *            the beginning angle.
	 * @param arcAngle
	 *            the angular extent of the arc, relative to the start angle.
	 * @see #fillArc
	 */
	void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle);

	/**
	 * Fills a circular or elliptical arc covering the specified rectangle.
	 * <p>
	 * The resulting arc begins at <code>startAngle</code> and extends for
	 * <code>arcAngle</code> degrees. Angles are interpreted such that
	 * 0&nbsp;degrees is at the 3&nbsp;o'clock position. A positive value
	 * indicates a counter-clockwise rotation while a negative value indicates a
	 * clockwise rotation.
	 * <p>
	 * The center of the arc is the center of the rectangle whose origin is
	 * (<i>x</i>,&nbsp;<i>y</i>) and whose size is specified by the
	 * <code>width</code> and <code>height</code> arguments.
	 * <p>
	 * The resulting arc covers an area <code>width&nbsp;+&nbsp;1</code> pixels
	 * wide by <code>height&nbsp;+&nbsp;1</code> pixels tall.
	 * <p>
	 * The angles are specified relative to the non-square extents of the
	 * bounding rectangle such that 45 degrees always falls on the line from the
	 * center of the ellipse to the upper right corner of the bounding
	 * rectangle. As a result, if the bounding rectangle is noticeably longer in
	 * one axis than the other, the angles to the start and end of the arc
	 * segment will be skewed farther along the longer axis of the bounds.
	 * 
	 * @param x
	 *            the <i>x</i> coordinate of the upper-left corner of the arc to
	 *            be filled.
	 * @param y
	 *            the <i>y</i> coordinate of the upper-left corner of the arc to
	 *            be filled.
	 * @param width
	 *            the width of the arc to be filled.
	 * @param height
	 *            the height of the arc to be filled.
	 * @param startAngle
	 *            the beginning angle.
	 * @param arcAngle
	 *            the angular extent of the arc, relative to the start angle.
	 * @see #drawArc
	 */
	void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle);
}