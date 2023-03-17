package shop.mtcoding.hiberpc.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import shop.mtcoding.hiberpc.config.filter.MyBlackListFilter;

@Configuration
public class FilterRegisterConfig {

    @Bean
    public FilterRegistrationBean<?> blackListFilter() {
        FilterRegistrationBean<MyBlackListFilter> registraion = new FilterRegistrationBean<>();
        registraion.setFilter(new MyBlackListFilter());
        registraion.addUrlPatterns("/filter");
        registraion.setOrder(1);

        return registraion;
    }
}
