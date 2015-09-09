
public class Point2D {
	
	public int X;
	
	public int Y;

	public Point2D() {
		this.X = 0;
		this.Y = 0;
	}
	
	public Point2D(int x , int y) {
		this.X = x;
		this.Y = y;
	}

	public Point2D add(int dx, int dy) {
		Point2D point = new Point2D();
		point.X = this.X + dx;
		point.Y = this.Y + dy;
		return point;
	}
	
	public void translate(Point2D point){
		this.X += point.X;
		this.Y += point.Y;
	}
	
	public int distance(int x, int y) {
		int d = (int) Math.sqrt(Math.pow(x - this.X, 2) + Math.pow(y - this.Y, 2));  
		return d;
	}
	
	public String toString() {
		
		String retstring = new String ("("+this.X+", "+this.Y+")");
		return retstring;	
		
	} 

	public static void main(String[] args) {
		Point2D a = new Point2D(1, 2);
		System.out.println(a.toString());
		
	}

}
