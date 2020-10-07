# 计192 2019310191 齐睿
# Java
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.掌握类的设计
2.写出程序并初步学会调试
3.利用GitHub平台写实验报告
## 实验过程
>首先创建两个package：Information 和 Run。
>>在Information 包中创建两个class：CPU 和 HardDisk。  
    在Run 包中创建两个class：PC 和 Test。  
>>>在CPU类中创建三个private属性：speed、processor、hertz分别表示cpu的速度、处理器品牌和频率。  
   并为三个属性定义三组方法（set-get）。 
   创建一个默认构造方法（用来显示原来看不见的默认构造方法）。
   和一个新的构造方法用以调用三个属性的set方法。  
>>>>在HardDisk类中创建两个private属性：amount和readSpeed分别表示硬盘的容量和读写速度。  
   并为两个属性定义两组方法（set-get）。 
   创建一个默认构造方法（用来显示原来看不见的默认构造方法）。
   和一个新的构造方法用以调用两个属性的set方法。  
>>>>>在PC类中调用CPU类和HardDisk类，并分别建立新的属性cpu和HD。  
然后创建show（）函数来展示所获取的信息。  
>>>>>>最后，在Test 创建主方法来为CPU和HardDisk中五个属性赋值，并调用PC类中show（）函数来输出信息。

## 核心方法  
1.方法1  
```
public void setSpeed(int m) {
	if(m>1000 && m<3000)
	speed=m;
    else 
    	{System.out.println("The CPU speed was wrong!");
    	speed=404000;
    	}
}
```
2.方法2  
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
3.方法3  
```
public void setHertz(double m) {
	if(m>1.00 && m<4.00)
		hertz=m;
	    else 
	    	{System.out.println("The CPU hertz was wrong!");
	    	hertz=404000;
	    	}
}
```
4.方法4  
```
public CPU(int speed,String processor,double hertz) {
	setSpeed(speed);
	setProcessor(processor);
	setHertz(hertz);
}
``` 
5.方法5  
```
public void setAmount(int amount) {
	if(amount>160 && amount<1024)
        this.amount = amount;
	else {System.out.println("The HardDisk amount was wrong!");
	this.amount=404000;
	}

 }
``` 
6.方法6  
```
public void setReadSpeed(int readSpeed) {
	if(readSpeed>20 && readSpeed<600)
		this.readSpeed=readSpeed;
	else {System.out.println("The HardDisk readSpeed was wrong!");
	    this.readSpeed=404000;
	}
``` 
7.方法7  
```
public HardDisk(int amount,int readSpeed) {
	setAmount(amount);
	setReadSpeed(readSpeed);
}
```
8.方法8  
``` 
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}
```
9.方法9  
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
![1](https://github.com/Bpig-C/Java-test1/blob/main/right.jpg)
## 实验感想  
通过本次实验
