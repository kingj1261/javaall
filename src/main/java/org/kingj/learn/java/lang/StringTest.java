package org.kingj.learn.java.lang;

import org.junit.Test;

/**
 * �ַ������
 */
public class StringTest {

    @Test
    public void testOne(){
        String a="i am complex chars �й��ˡ�";
        System.out.println(a);
        System.out.println(a.getBytes().length);
    }

}
