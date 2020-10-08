package Information;

public class CPU {
private int centre;
private String processor;
private double hertz;
public CPU(){

}

public CPU(int centre) {
	setCentre(centre);	
}

public CPU(String processor,double hertz) {
	setProcessor(processor);
	setHertz(hertz);
}

public int getCentre() {
	return centre;
}
public String getProcessor() {
	return processor;
}
public double getHertz() {
	return hertz;
}
public void setCentre(int m) {
	if(m>4 && m<12)
	centre=m;
    else 
    	{System.out.println("The CPU Centre was wrong!");
    	centre=404000;
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
