package imc;

public class Maths {
private int x;
private int y;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public boolean parite()
{
return x%2==0;	

}
public boolean divisibilite()
{
return x%y==0;	

}
@Override
public String toString() {
	return "Result: [x=" + x + ", y=" + y + ", parite=" + parite() + ", divisibilite=" + divisibilite() + "]";
}



}

