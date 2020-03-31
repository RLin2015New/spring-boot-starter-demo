package com.lifl.testautoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnMissingBean(IHelloConfigurationConfiguration.class)
@Configuration
@EnableConfigurationProperties(HelloPorperties.class)
public class HelloConfigurationConfiguration  {

    /**
     * 真实的加载过程可以通过监测 SpringFactoriesLoader.loadFactoryNames可以大致分析，
     * 是通过一系列复杂机制，从spring.factories中读取EnableAutoConfiguration配置，获取bean定义
     * 然后在后续环节中统一做实例化的；如果有依赖注入，可能会被触发来做实例化（也就是说会提前实例化）
     * @param helloPorperties
     */
    public HelloConfigurationConfiguration(HelloPorperties helloPorperties){
        System.out.println("HelloConfigurationConfiguration");
        this.helloPorperties = helloPorperties;
    }
    
    final
    HelloPorperties helloPorperties;

    @Bean
    HelloService helloService() {
        HelloService hello = new HelloService();
        hello.setHelloPorperties(helloPorperties);
        return hello;
    }
    
    @Bean
    ApplicationRunner applicationRunner(){
        return new ApplicationRunner(){
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println(" just a inner test ApplicationRunner");
            }
        };
    }
    
    @Bean
    CommandLineRunner commandLineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("just a inner commandLineRunner test");
            }
        };
    }

}
