package Principal;

import java.util.Calendar;

public class Reloj {
	int hours;
	int minutes;
	int seconds;
	
	public Reloj() {
		Calendar date = Calendar.getInstance();
		
		hours = date.get(Calendar.HOUR);
		minutes = date.get(Calendar.MINUTE);
		seconds = date.get(Calendar.SECOND);
	}
	
	public Reloj(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	} //hola
	
	public int getHour() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void printTime() {
		System.out.print(hours + ":" + minutes + ":" + seconds);
	}
	
	public void incrementHours() {
		++hours;
	}
	
	public void incrementMinutes() {
		++minutes;
	}
	
	public void incrementSeconds() {
		++seconds;
	}
	
	public boolean compareTime(Reloj clock) {
		return 	clock.getHour() == hours &&
				clock.getMinutes() == minutes &&
				clock.getSeconds() == seconds;
	}
	
	public void copyTime(Reloj clock) {
		hours = clock.getHour();
		minutes = clock.getMinutes();
		seconds = clock.getSeconds();
	}
	
	public Reloj returnCopyTime() {
		return new Reloj();
	}

}