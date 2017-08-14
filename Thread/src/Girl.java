
public class Girl{
	private static Girl g = null;
	private Girl(){
		
	}

	public static Girl getInstance(){
		if(g==null){
			synchronized (Girl.class) {
				if(g==null){
					g=new Girl();
				}
			}
		}
		return g;
	}
	
	
}




/*public class Girl {
	//1.创建私有本类对象的引用
	private static Girl g=null;
	//2.私有构造方法
	private Girl(){
		
	} 
	//3.提供公共方法让外界访问,获取已创建好的本类对象
	public static Girl getInstance(){
		if(g==null){
			g=new Girl();
		}
		return g;
	}
	
}
*/