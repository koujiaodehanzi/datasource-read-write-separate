package com.wyk.example.aop.annotation;

import java.lang.annotation.*;

/**
 * @Author: wyk
 * @Description: 选择数据源
 * @Date: Create in 2019/12/21 20:18
 * @Modified By:
 */
@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

    /**
     * 数据源名称
     */
    String value();
}
