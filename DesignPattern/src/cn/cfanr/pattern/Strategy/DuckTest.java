package cn.cfanr.pattern.Strategy;

public class DuckTest {
	public static void main(String[] args){
		System.out.println("����Ѽ�ӳ���");
		Duck duck=null;
		//duck=new MallardDuck();
		//duck=new RedheadDuck();
		duck=new RubberDuck();
		
		duck.display();
		duck.fly();
		duck.quack();
		System.out.println("�������");
	}
}
