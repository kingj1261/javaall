package org.kingj.learn.java.lang;

import org.junit.Test;

/**
 * 字符串相关
 */
public class StringTest {

    @Test
    public void testOne(){
        String a="i am complex chars 中国人【";
        System.out.println(a);
        System.out.println(a.getBytes().length);
    }

}
