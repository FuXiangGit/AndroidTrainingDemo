package cn.cfanr.pattern.Proxy;

public class Source implements Sourceable {
	@Override
	public void method() {
		System.out.println("this is an original method");
	}
}
