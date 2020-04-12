class Point {
	String id
	double x,y;
	String colorPoints

	//TODO add new variable

	//TODO constructor

	public Point(String id, double x, double y, String colorPoints) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.colorPoints = colorPoints;
	}
	//TODO setters and getters


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColorPoints() {
		return colorPoints;
	}

	public void setColorPoints(String colorPoints) {
		this.colorPoints = colorPoints;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}