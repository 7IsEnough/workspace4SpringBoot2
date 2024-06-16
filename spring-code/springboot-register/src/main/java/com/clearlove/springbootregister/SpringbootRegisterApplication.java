package com.clearlove.springbootregister;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import com.clearlove.anno.EnableCommonConfig;
import com.clearlove.config.CommonConfig;
import com.clearlove.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(CommonConfig.class)
//@Import({CommonConfig.class})
//@Import(CommonImportSelector.class)
@EnableCommonConfig
public class SpringbootRegisterApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class,
        args);

    Country country = context.getBean(Country.class);
    System.out.println("country = " + country);

    Province province = context.getBean("province", Province.class);
    System.out.println("province = " + province);
  }

}
