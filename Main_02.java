public class Example_02 { 
                          
     int i;               
     public float f;      
     protected boolean b; 
     private String s;    
	}                     
  
  import java.lang.reflect.Field;

public class Main_02 {
/**
 * 类名称：访问成员变量
 * 类描述：如果是访问指定的成员变量，可以通过该成员变量的名称来访问
 * 成员变量访问权限的求证                  public    private    protected  default(默认权限)
 * 自己包自己的类                                可访问                    可访问                     可访问                      可访问
 * 自己包别的类                                    可访问                    不可访问                 可访问                       可访问
 * 别的包别的类                                    可访问                    不可访问                  不可访问                  不可访问
 * 自己包别的类有继承关系                 可访问                      不可访问                可访问                        可访问
 * 别的包别的类有继承关系                 可访问                     不可访问                  可访问                       不可访问
 * 创建人：陈键
 * 创建时间：2019/2/21.22:32
 * 修改备注：修改了方法Main_02
 * @param args 1.1.1
 */
	public static void main(String[] args) {
		Example_02 example = new Example_02();
		Class exampleC = example.getClass();//获得所有成员变量
		Field[] declaredFieleds= exampleC.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];//遍历成员变量
			//获得成员变量名称8
			System.out.println("名称为："+field.getName());
			Class fiedType = field.getType();
			System.out.println("类型为："+fieldType);
			boolean isTurn = true;
			while(isTurn){
				//如果该成员变量的访问权限为private,则抛出异常，既不允许访问
				try{
					isTurn = false;
					//获得成员变量值
					System.out.println("修改前的值为："+field.get(example));
					//判断成员变量的类型是否为int型
					if(fieldType.epuals(int.class)){
						System.out.println("利用方法setlnt();修改成员变量的值");
						field.setInt(example,168);   //为int型成员变量赋值
						//判断成员变量的类型是否为float型
					}else if(fieldType.epuals(float.class)){
						System.out.println("利用方法setFloat()修改成员变量的值");
						//为float型成员变量赋值
						field.setFloat(example,99.9F);
						//判断成员变量的类型是否为boolean型
					}else if(fieldType.equals(boolean.class)){
						System.out.println("利用方法setBoolean()修改成员变量的值");
						//为boolean型成员变量赋值
						field.setBoolean(example,true);
					}else{
						System.out.println("利用方法set()修改成员变量的值");
						//可以为各种类型的成员变量赋值
						field.set(example,"MWQ");
					}
					//获得成员变量值
					System.out.println("修改 后的值为："+field.get(example));
					
				}catch(Exception e){
					System.out.println("在设置成员变量值时抛出异常,"+"下面执行setAccessible()方法！");
					field.setAccessible(true);   //设置为允许访问
					isTurn = true;
					
				}
				
				}
			System.out.println();
			}
			
}

}
