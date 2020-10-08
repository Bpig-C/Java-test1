package Run;

import Information.CPU;
import Information.HardDisk;

public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(6);
       
       CPU recpu = new CPU("Intel",3.8);

       HardDisk HD=new HardDisk(200,240);

       PC pc =new PC(cpu,recpu,HD);

       pc.show();

    }

}