package org.sdf4j.core;

/**
 * Interface that describes a canvas, regardless of its technology. Has methods
 * for drawing, transformations and color management.
 * 
 * @author Branislav Stojkovic
 */
public interface ICanvas {

	/**
	 * Sets this graphics context's current color to the specified color. All
	 * subsequent graphics operations using this graphics context use this
	 * specified color.
	 * 
	 * @param c
	 *            the new rendering color.
	 * @see org.sdf4j.core.Color
	 * @see #getColor
	 */
	public void setColor(Color c);

	/**
	 * Gets this graphics context's current color.
	 * 
	 * @return this graphics context's current color.
	 * @see org.sdf4j.core.Color
	 * @see #setColor(Color)
	 */
	public Color getColor();

	/**
	 * Returns the current <code>Stroke</code> in the <code>Graphics2D</code>
	 * context.
	 * 
	 * @return the current <code>Graphics2D</code> <code>Stroke</code>, which
	 *         defines the line style.
	 * @see #setStroke
	 */
	public Stroke getStroke();

	/**
	 * Sets the <code>Stroke</code> for the <code>Graphics2D</code> context.
	 * 
	 * @param s
	 *            the <code>Stroke</code> object to be used to stroke a
	 *            <code>Shape</code> during the rendering process
	 * @see org.sdf4j.core.Stroke
	 * @see #getStroke
	 */
	public void setStroke(Stroke s);

	/**
	 * Gets the current font.
	 * 
	 * @return this graphics context's current font.
	 * @see java.awt.Font
	 * @see java.awt.Graphics#setFont(Font)
	 */
	public Font getFont();

	/**
	 * Sets this graphics context's font to the specified font. All subsequent
	 * text operations using this graphics context use this font. A null
	 * argument is silently ignored.
	 * 
	 * @param f
	 *            the font.
	 * @see java.awt.Graphics#getFont
	 * @see java.awt.Graphics#drawString(java.lang.String, int, int)
	 * @see java.awt.Graphics#drawBytes(byte[], int, int, int, int)
	 * @see java.awt.Graphics#drawChars(char[], int, int, int, int)
	 */
	public void setFont(Font f);
}
