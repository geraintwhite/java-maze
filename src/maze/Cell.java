package maze;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Cell {
	private int x, y;
	private Line2D top, right, bottom, left;
	
	static final int SIZE = 20;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;

		this.top = new Line2D.Double(x * SIZE, y * SIZE, (x + 1) * SIZE, y * SIZE);
		this.right = new Line2D.Double((x + 1) * SIZE, y * SIZE, (x + 1) * SIZE, (y + 1) * SIZE);
		this.bottom = new Line2D.Double(x * SIZE, (y + 1) * SIZE, (x + 1) * SIZE, (y + 1) * SIZE);
		this.left = new Line2D.Double(x * SIZE, y * SIZE, x * SIZE, (y + 1) * SIZE);
	}
	
	public void draw(Graphics2D g2d) {
		g2d.draw(this.top);
		g2d.draw(this.right);
		g2d.draw(this.bottom);
		g2d.draw(this.left);
	}
}
