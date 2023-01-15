//package gr.hua.dit.dsproject.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import java.util.logging.Filter;
//
//
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//    private final JwtAthFilter jwtAuthFilter;l
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        Filter jwtAuthFilter;
//        http.
//                authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//                .and()
//                .httpBasic();
//        return http.build();
//
//    }
//
//
//
//}