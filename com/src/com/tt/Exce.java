package com.tt;

public class Exce {
    public static void main(String[] args) {
		try {
			int sd = aa();
			System.out.println(sd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	int ss = yy();
    	System.out.println(ss);
    	
    	
}
    public static int aa() throws Exception{
    	try {
			int i= 10/0;
			System.out.println(i);
			return i;
		} catch (Exception e) {
			System.out.println("0.0�������������Ǵ����");
			Exception dd = new Exception();
			throw dd;
		}finally {
			System.out.println("���ﶼ��ִ��");
			return 1000;
		}
    }
    public static int yy() {
    	try {
			int i= 10/0;
			System.out.println(i);
			return i;
		} catch (Exception e) {
			System.out.println("0.0�������������Ǵ����");
			
			throw e;
		}finally {
			System.out.println("���ﶼ��ִ��");
			return 1000;
		}
    }
}
