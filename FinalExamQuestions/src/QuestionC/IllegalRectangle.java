package QuestionC;

public abstract class IllegalRectangle {
	
	private static int x;
	private static int y;

	IllegalRectangle(int newx, int newy) {
		moveTo(newx, newy);
	}

	/**
	 * Getter for 'x'
	 * @return - returns the value for 'x'
	 */
	static int getX() {
		return x;
	}

	/**
	 * Getter for 'y'
	 * @return - return the value for 'y'
	 */
	static int getY() {
		return y;
	}

	/**
	 * Setter for 'x'
	 * @param newx - value for 'x'
	 */
	
	void setX(int newx) {
		x = newx;
		if(x >= 0){
			x = -x;
		}
	}

	/**
	 * Setter for 'y'
	 * @param newy - value for 'y'
	 */
	void setY(int newy) {
		y = newy;
		if(y >= 0){
			y = -y;
		}
	}


	/**
	 * Move shape to new coordinates
	 * @param newx - new 'x' value
	 * @param newy - new 'y' value
	 */
	void moveTo(int newx, int newy) {
		setX(newx);
		setY(newy);
	}

	/**
	 * Move shape using delta values
	 * @param deltax - delta 'x' value
	 * @param deltay - delta 'y' value
	 */
	void rMoveTo(int deltax, int deltay) {
		moveTo(getX() + deltax, getY() + deltay);
	}

	/**
	 * This abstract method will compel any class that inherits this class to implement this method
	 */
	abstract void draw();
	
	
	abstract public double ComputeArea();

}
