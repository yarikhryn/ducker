package org.h6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuration for security module
 *
 * @author sergiysi
 * @version v1.0
 */
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/resources/**", "/error/**").permitAll()
                .anyRequest().authenticated();
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth, UserService service){
//        TODO
//    }

}
