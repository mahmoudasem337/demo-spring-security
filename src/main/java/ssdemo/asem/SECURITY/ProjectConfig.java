package ssdemo.asem.SECURITY;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {
    /* @Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
 http.authorizeHttpRequests(configurer ->
 configurer
 .requestMatchers(HttpMethod.GET, "/secure").hasRole("write")
 .requestMatchers(HttpMethod.GET, "/notsecure").hasRole("read");
 http.httpBasic(Customizer.withDefaults());
 return http.build();
}
*/

    /* @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
}*/
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}