package com.stringmatch;

public class StringMatch {

	public static void main(String[] args) {
		
		//��\\p{Upper}����д��ĸ��\\p{Lower}��Сд��ĸ��\\d������0~9���κ�һ�����֡�
		String regex = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		String message1 = "ABCd001";	//��Ҫ�����жϵ��ַ���
		String message2 = "Abcd001"; 	//��Ҫ�����жϵ��ַ���
		boolean result1 = message1.matches(regex);
		boolean result2 = message2.matches(regex);
		if(result1)
			System.out.println(message1 + "�ǺϷ�������");
		else
			System.out.println(message1 + "���ǺϷ�������");
		if(result2)
			System.out.println(message2 + "�ǺϷ�������");
		else
			System.out.println(message2 + "���ǺϷ�������");
	}
}
