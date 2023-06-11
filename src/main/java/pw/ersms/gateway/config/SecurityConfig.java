//package pw.ersms.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        //allow all requests (even if the user doesnt have credentials)
//
//        http
//                .csrf()
//                .disable()
//                .cors().configurationSource(c -> {
//                    CorsConfiguration corsCfg = new CorsConfiguration();
//                    corsCfg.applyPermitDefaultValues();
//                    corsCfg.addAllowedOriginPattern("*");
//                    corsCfg.addAllowedMethod(CorsConfiguration.ALL);
//                    return corsCfg;
//                });
//
//        return http.build();
//    }
//}
