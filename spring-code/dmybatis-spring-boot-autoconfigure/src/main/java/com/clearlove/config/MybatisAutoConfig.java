package com.clearlove.config;

import java.util.List;
import javax.sql.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author promise
 * @date 2024/6/16 - 23:37
 */
@EnableAutoConfiguration // 标识当前配置类是一个自动配置类
public class MybatisAutoConfig {

  // SqlSessionFactoryBean
  @Bean
  public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    return sqlSessionFactoryBean;
  }



  // MapperScannerConfigurer
  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory) {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    // 扫描的包：启动类所在的包及其子包
    List<String> packages = AutoConfigurationPackages.get(beanFactory);
    String p = packages.get(0);
    mapperScannerConfigurer.setBasePackage(p);
    // 扫描的注解
    mapperScannerConfigurer.setAnnotationClass(Mapper.class);
    return mapperScannerConfigurer;
  }

}
