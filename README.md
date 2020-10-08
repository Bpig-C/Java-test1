# 计192 2019310191 齐睿
# Java
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.掌握类的设计  
2.写出程序并初步学会调试  
3.利用GitHub平台写实验报告  
## 实验过程
1.首先创建两个package：Information 和 Run。  
2.在Information 包中创建两个class：CPU 和 HardDisk，并在Run 包中创建两个class：PC 和 Test。  
3.CPU类中：
*(a)在CPU类中创建三个private属性：speed、processor、hertz分别表示cpu的速度、处理器品牌和频率。    
(b)并为三个属性定义三组方法（set-get）。   
(c)创建一个默认构造方法（用来显示原来看不见的默认构造方法）。和一个新的构造方法用以调用三个属性的set方法。*    
4.HardDisk类中：
*(a)在HardDisk类中创建两个private属性：amount和readSpeed分别表示硬盘的容量和读写速度。    
(b)并为两个属性定义两组方法（set-get）。   
(c)创建一个默认构造方法（用来显示原来看不见的默认构造方法）。  
(d)和一个新的构造方法用以调用两个属性的set方法。*    
5.PC中：
*(a)PC类中调用CPU类和HardDisk类，并分别建立新的属性cpu和HD。    
(b)然后创建show（）函数来展示所获取的信息。*    
6.最后在Test 创建主方法来为CPU和HardDisk中五个属性赋值，并调用PC类中show（）函数来输出信息。

## 核心方法  

***1.方法（processor赋值方法，setspeed和sethertz赋值方法与此类似）***
```
public void setProcessor(String m) {
	if(m=="Intel" || m=="AMD")
		processor=m;
	    else 
	    	{System.out.println("The CPU processor was wrong!");
	    	processor="404000";
	    	}
	}
``` 
***2.方法（CPU类中主构造方法）***  
```
public CPU(int speed,String processor,double hertz) {
	setSpeed(speed);
	setProcessor(processor);
	setHertz(hertz);
}
``` 
***3.方法（setamount赋值方法，setreadspeed赋值方法与此类似）***
```
public void setAmount(int amount) {
	if(amount>160 && amount<1024)
        this.amount = amount;
	else {System.out.println("The HardDisk amount was wrong!");
	this.amount=404000;
	}

 }
``` 
***4.方法（HardDisk类中主构造方法）***
```
public HardDisk(int amount,int readSpeed) {
	setAmount(amount);
	setReadSpeed(readSpeed);
}
```
***5.方法(PC类中主构造方法)***
``` 
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}
```
***6.方法(Test类中运行本程序主方法)***
``` 
public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(2200,"Intel",3.8);

       HardDisk HD=new HardDisk(200,240);

       PC pc =new PC(cpu,HD);

       pc.show();

    }
```
## 实验结果
Picture1.CPU processor was wrong：
![CPU processor was wrong](https://i.loli.net/2020/10/07/WtJ8So3lCmbp7xk.jpg)  
Picture2.CPU hertz and HarddDsk readSpeed were wrong： 
![CPU hertz and HarddDsk readSpeed were wrong](https://i.loli.net/2020/10/07/jxnRK9Ouy86GLAe.jpg)  
Picture3.The right result:
![The right result](https://i.loli.net/2020/10/07/ZOqQ5yrAfJTDN4B.jpg)  
## 实验感想  
通过本次实验，我学会并熟悉了如何创建类、方法和构造方法，用import来跨包调用类，以及基本的访问修饰符使用。实验中四个类组成的关系链让我充分熟悉类与类之间的关系，并不断调试程序和改善代码。除此以外，我还学会如何简单使用GitHub和markdown编辑实验报告。
