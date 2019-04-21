package com.orch.Test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TestConfig {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Qualifier("customClass1")
  @Bean
  CustomClass customClass() {
    CustomClass customClass = new CustomClass();
    customClass.setProp1("tata");
    customClass.setProp2("tete");
    return customClass;
  }

  @Qualifier("customClass2")
  @Bean
  CustomClass customClass2() {
    CustomClass customClass = new CustomClass();
    customClass.setProp1("ttoto ata");
    customClass.setProp2("tut");
    return customClass;
  }

}
