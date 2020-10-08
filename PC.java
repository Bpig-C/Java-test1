package Run;

import Information.CPU;
import Information.HardDisk;

public class PC {
private HardDisk HD;
private CPU cpu;
private CPU recpu;
public PC(){
	
}
public PC(CPU cpu,CPU recpu,HardDisk HD) {
	setCPU(cpu);
	setRECPU(recpu);
	setHardDisk(HD);
}

private void setCPU(CPU c) {
	cpu=c;
}

private void setRECPU(CPU c) {
	recpu=c;
}
private void setHardDisk(HardDisk h) {
	HD=h;
}
void show() {
	System.out.println("The PC attribute(404000 means wrong!):");
	System.out.println("CPU type is "+recpu.getProcessor()+".");
	System.out.println("CPU speed is "+cpu.getCentre()+" Centre.");
	System.out.println("CPU hertz is "+recpu.getHertz()+" GHZ.");
	System.out.println("HardDisk is "+HD.getAmount()+" G.");
	System.out.println("HardDisk readspeed is "+HD.getReadSpeed()+" MB/s.");
}
}
