public class Son {
	//1.创建私有本类对象
	private static Son s = new Son();
	//2.构造方法私有化
	private Son(){
		
	}
	//3.提供公共访问方式
	public static Son getInstance(){
		return s;
	}
	
}

