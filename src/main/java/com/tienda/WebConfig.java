package com.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/*
Internationalization ----- i18n ----- 18 letras entre I y n 
* Locale:Representa es el lenguaje, la region geografica, variantes del dialecto/idioma, de un usuario
SessionLocaleResolver : guardar el Locale seleccionado por un usario * como atributo en el request HTTP
LocaleChangeInterceptor: Detectar cualquier cambio de parte del usuario hacia lo que es el Locale
*/

@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Bean
    public SessionLocaleResolver localeResolver(){
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    @Override
    public void addInterceptors (InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
    
}


