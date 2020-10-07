package Information;

public class HardDisk {
private int amount;
private int readSpeed;
public HardDisk(){
	
}
public HardDisk(int amount,int readSpeed) {
	setAmount(amount);
	setReadSpeed(readSpeed);
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	if(amount>160 && amount<1024)
		this.amount = amount;
	else {System.out.println("The HardDisk amount was wrong!");
	      this.amount=404000;
	}
public int getReadSpeed() {
	return readSpeed;
}
public void setReadSpeed(int readSpeed) {
	if(readSpeed>20 && readSpeed<600)
		this.readSpeed=readSpeed;
	else {System.out.println("The HardDisk readSpeed was wrong!");
	        this.readSpeed=404000;
	     }
}
}
