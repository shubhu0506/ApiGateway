//package com.ubi.ApiGateway.configurations;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//public class CommonBeans {
//
//    @Bean
//    CorsWebFilter corsWebFilter() {
//        CorsConfiguration corsConfig = new CorsConfiguration();
//            corsConfig.setAllowedOrigins(Arrays.asList("http://43.241.63.102:4200","http://localhost:4200"));
//        corsConfig.setMaxAge(8000L);
//        corsConfig.addAllowedMethod("*");
//        corsConfig.addAllowedHeader("*");
//
//        UrlBasedCorsConfigurationSource source =
//                new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        return new CorsWebFilter(source);
//    }
//}
