package com.jh.springboot;

import java.lang.reflect.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/**
 * 创建set和get方法,无参和有参构造方法,并提供一个 属性名为log 的 log4j 日志对象
 * 
 * @author Liubao
 * @2016年5月10日
 * 
 */
@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("unused")
public class LombokEntity {

    private String name;
    private Field field;
    
}
