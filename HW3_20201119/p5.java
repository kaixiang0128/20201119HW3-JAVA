package HW3_20201119;

public class p5 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
	}
}
//Car���O
class Car
{
	int num;
	double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}