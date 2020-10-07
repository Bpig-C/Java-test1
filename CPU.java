package Information;

public class CPU {
private int speed;
private String processor;
private double hertz;
public CPU(){

}
public CPU(int speed,String processor,double hertz) {
	setSpeed(speed);
	setProcessor(processor);
	setHertz(hertz);
}
public int getSpeed() {
	return speed;
}
public String getProcessor() {
	return processor;
}
public double getHertz() {
	return hertz;
}
public void setSpeed(int m) {
	if(m>1000 && m<3000)
	speed=m;
    else 
    	{System.out.println("The CPU speed was wrong!");
    	speed=404000;
    	}
}
public void setProcessor(String m) {
	if(m=="Intel" || m=="AMD")
		processor=m;
	    else 
	    	{System.out.println("The CPU processor was wrong!");
	    	processor="404000";
	    	}
	}
public void setHertz(double m) {
	if(m>1.00 && m<4.00)
		hertz=m;
	    else 
	    	{System.out.println("The CPU hertz was wrong!");
	    	hertz=404000;
	    	}
}
}
