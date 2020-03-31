package com.lifl.testautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author lifl
 */
public class TestApplicationListener implements SpringApplicationRunListener {
    
    //必要的
    public TestApplicationListener(SpringApplication app,String[] rags){
        
    }
    
    @Override
    public void starting(){
        System.out.println("TestApplicationListener starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("TestApplicationListener environmentPrepared");
    }

    /**
     * Called once the {@link ApplicationContext} has been created and prepared, but
     * before sources have been loaded.
     * @param context the application context
     */
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("TestApplicationListener contextPrepared");
    }

    /**
     * Called once the application context has been loaded but before it has been
     * refreshed.
     * @param context the application context
     */
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("TestApplicationListener contextLoaded");
    }

    /**
     * The context has been refreshed and the application has started but
     * {@link CommandLineRunner CommandLineRunners} and {@link ApplicationRunner
     * ApplicationRunners} have not been called.
     * @param context the application context.
     * @since 2.0.0
     */
    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("TestApplicationListener started");
    }

    /**
     * Called immediately before the run method finishes, when the application context has
     * been refreshed and all {@link CommandLineRunner CommandLineRunners} and
     * {@link ApplicationRunner ApplicationRunners} have been called.
     * @param context the application context.
     * @since 2.0.0
     */
    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("TestApplicationListener running");
    }

    /**
     * Called when a failure occurs when running the application.
     * @param context the application context or {@code null} if a failure occurred before
     * the context was created
     * @param exception the failure
     * @since 2.0.0
     */
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("TestApplicationListener failed");
    }
}
