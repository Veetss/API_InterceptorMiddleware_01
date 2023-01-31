package co.develhope.interceptorsmiddleware1;

import co.develhope.interceptorsmiddleware1.interceptors.APILoggingInterceptor;
import co.develhope.interceptorsmiddleware1.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InterceptorsMiddleware1Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorsMiddleware1Application.class, args);
    }

}
