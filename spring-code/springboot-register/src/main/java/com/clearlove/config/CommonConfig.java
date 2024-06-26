package com.clearlove.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author promise
 * @date 2024/6/16 - 18:21
 */
@Configuration
public class CommonConfig {

  // 如果配置文件中配置了指定的信息，则注入，否则不注入
  @ConditionalOnProperty(prefix = "country", name = {"name","system"})
  @Bean
  public Country country(@Value("${country.name}") String name,@Value("${country.system}") String system) {
    Country country = new Country();
    country.setName(name);
    country.setSystem(system);
    return country;
  }

//  @Bean("aa")
  // 如果方法的内部需要使用到ioc容器中已经存在的bean对象，那么只需要在方法上声明即可，spring会自动注入
//  @Bean
//  public Province province(Country country) {
//    System.out.println("province: " + country);
//    return new Province();
//  }

  // 如果ioc中不存在Country，则注入province，否则不注入
  @ConditionalOnMissingBean(Country.class)
  // 如果当前环境有DispatcherServlet类，则注入Province，否则不注入
  @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
  @Bean
  public Province province() {
    return new Province();
  }

}
