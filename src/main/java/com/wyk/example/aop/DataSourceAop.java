package com.wyk.example.aop;

import com.wyk.example.aop.annotation.DataSource;
import com.wyk.example.jdbc.DataSourceHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * @Author: wyk
 * @Description:选择数据源注解aop
 * @Date: Create in 2019/12/21 20:14
 * @Modified By:
 */
@Component
@Aspect
public class DataSourceAop {

    @Before("@annotation(dataSource)")
    public void before(DataSource dataSource) {
        DataSourceHolder.chooseDataSource(dataSource.value());
    }

    @After("@annotation(dataSource)")
    public void after(DataSource dataSource) {
        DataSourceHolder.chooseDefaultDataSource();
    }
}
