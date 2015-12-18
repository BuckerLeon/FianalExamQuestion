package QuestionC;

public class IllegalRectangle extends Rectangle{
	
	public IllegalRectangle(int newx, int newy) {
		super(newx, newy);
		if (newx >= 0 && newy >= 0){
			newx = -newx;
			newy = -newy;
		}
	}

	@Override
	void draw() {
	}
	

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
