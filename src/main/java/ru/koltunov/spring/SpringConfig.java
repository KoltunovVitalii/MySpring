package ru.koltunov.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("ru.koltunov.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
