package jdk11.jep.JEP181;

import java.lang.reflect.Field;
/**
 * 	��java11֮ǰ��
 * 	classfile��InnerClasses��EnclosingMethod��������������������ȷ��Դ���Ƕ�׹�ϵ��
 * 	ÿһ��Ƕ�׵����ͻ���뵽�Լ���class�ļ��У���ʹ��������������������class�ļ���
 * 	��Щ���Զ���jvmȷ��Ƕ�׹�ϵ���Ѿ��㹻�ˣ��������ǲ�ֱ�������ڷ��ʿ��ƣ����Һ�java���԰󶨵�̫���ˡ�
 * 	Ϊ���ṩһ�ָ���ģ����㷺�ģ���������java���Ե�Ƕ�����ͣ����Ҳ�����ʿ��Ƽ��Ĳ��㣬�����������µ�class�ļ����ԡ�
 * 	����������nest member��һ�ֽ�nest host��Ҳ��top-level class����
 * 	������һ��NestMembers��������ȷ��������̬��nest members��	
 * 	�����ľ���nest member��������һ��NestHost��������ȷ������nest host��
 * 	��ҿ��Կ�һ�����������class�ļ����顣
 * @author SquRab
 *
 */
public class JEP181Demo {
	public static class Nest1 {
		private int varNest1;
        public void f() throws Exception {
            final Nest2 nest2 = new Nest2();
            //����û����
            nest2.varNest2 = 2;
            final Field f2 = Nest2.class.getDeclaredField("varNest2");
           //������java8�����»ᱨ����java11����û�����
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
