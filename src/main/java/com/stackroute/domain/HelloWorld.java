package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware, BeanNameAware {
    private Quote quote;
    private String msg="Hello World";

    public HelloWorld()
    {

    }


    public HelloWorld(Quote quote) {
        this.quote = quote;
    }

    public  String getMessage()
    {
        return msg;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Quote quote= (Quote) applicationContext.getBean("quoteB");
    }

    public void setBeanName(String s) {
        System.out.println("Bean Name" +s );
    }
}
