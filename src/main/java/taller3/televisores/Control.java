package taller3.televisores;

public class Control {
	TV tv;
	public void turnOn() {
		tv.turnOn();
		
		
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void setCanal( int num) {
		tv.setCanal(num);
	}
	public void setVolumen( int num) {
		tv.setVolumen(num);
	}
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
		
	}

}
