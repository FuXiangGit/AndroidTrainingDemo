package cn.cfanr.pattern.Visitor;
/*
 * ������ģʽ����һ�ַ���������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬�ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч����
 * 
 * ������ģʽ���ŵ������Ӳ��������ף���Ϊ���Ӳ�����ζ�������µķ����ߡ�������ģʽ���й���Ϊ���е�һ�������߶����У���ı�
 * ��Ӱ��ϵͳ���ݽṹ����ȱ����������µ����ݽṹ�����ѡ�
 * 
 * ���������Ϊһ�����е��������¹��ܣ����ò����Ǽ������飺1���¹��ܻ᲻�������й��ܳ��ּ��������⣿2���Ժ�᲻������Ҫ
 * ��ӣ�3������಻�����޸Ĵ�����ô�죿�����Щ���⣬��õĽ����������ʹ�÷�����ģʽ��������ģʽ���������ݽṹ����ȶ�
 * ��ϵͳ�������ݽṹ���㷨����
 */
public class Test {
	public static void main(String[] args) {
		Visitor visitor=new MyVisitor();
		Subject sub=new MySubject();
		sub.accept(visitor);
	}
}
