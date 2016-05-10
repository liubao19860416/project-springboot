package com.springboot.test;

import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.jh.springboot.LombokEntity;

/**
 * 测试类
 * 
 * @author Liubao
 * @2016年5月10日
 * 
 */
public class LombokEntityTest {
    
    @Test
    public void testName01() throws Exception {
        LombokEntity lombokEntity=new LombokEntity();
        lombokEntity.setName("liubao");
        System.out.println(JSON.toJSONString(lombokEntity));
        assertTrue(true);
    }

}
