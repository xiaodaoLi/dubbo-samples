package org.apache.dubbo.samples.async.spring.beanpostprocessor;

import org.apache.dubbo.samples.async.spring.springbean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PersonBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PersonBeanPostProcessor.postProcessBeforeInitialization");
        System.out.println("beanName : " + beanName);
        if (bean instanceof Person) {
            Person person = (Person) bean;
            person.setName("Name before initialize");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PersonBeanPostProcessor.postProcessAfterInitialization");
        System.out.println("beanName : " + beanName);
        if (bean instanceof Person) {
            Person person = (Person) bean;
            person.setName("Name after initialize");
        }
        return bean;    }
}
