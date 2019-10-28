package jdk11.jep.JEP181;

import java.lang.reflect.Field;
/**
 * 	在java11之前，
 * 	classfile用InnerClasses和EnclosingMethod两种属性来帮助编译器确认源码的嵌套关系，
 * 	每一个嵌套的类型会编译到自己的class文件中，在使用上述属性来连接其他class文件。
 * 	这些属性对于jvm确定嵌套关系上已经足够了，但是它们不直接适用于访问控制，并且和java语言绑定的太紧了。
 * 	为了提供一种更大的，更广泛的，不仅仅是java语言的嵌套类型，并且补足访问控制检测的不足，引入了两个新的class文件属性。
 * 	定义了两种nest member，一种叫nest host（也叫top-level class），
 * 	它包含一个NestMembers属性用于确定其他静态的nest members，	
 * 	其他的就是nest member，它包含一个NestHost属性用于确定它的nest host。
 * 	大家可以看一下上述代码的class文件详情。
 * @author SquRab
 *
 */
public class JEP181Demo {
	public static class Nest1 {
		private int varNest1;
        public void f() throws Exception {
            final Nest2 nest2 = new Nest2();
            //这里没问题
            nest2.varNest2 = 2;
            final Field f2 = Nest2.class.getDeclaredField("varNest2");
           //这里在java8环境下会报错，在java11中是没问题的
            f2.setInt(nest2, 2);
            System.out.println(nest2.varNest2);
        }
        
	}
	
	public static class Nest2 {
        private int varNest2;
    }
 
    public static void main(String[] args) throws Exception {
        new Nest1().f();
    }

}
